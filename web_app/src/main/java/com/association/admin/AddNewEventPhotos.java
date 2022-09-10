/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

import com.association.database.DatabaseConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mestu
 */
@WebServlet(name = "AddNewEventPhotos", urlPatterns = {"/AddNewEventPhotos"})
@MultipartConfig
public class AddNewEventPhotos extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String description = request.getParameter("description");
        Vector<InputStream> images = new Vector<>();
        Vector<String> captions = new Vector<>();
        int i = 1;
        try {
        //<editor-fold desc="get all images and caption">
            while(request.getParameter("caption"+i)!=null){
                images.add(request.getPart("img"+i).getInputStream());
                captions.add(request.getParameter("caption"+i));
                i++;
            }
            
            DatabaseConnection conn= new DatabaseConnection();
        //</editor-fold>

        //<editor-fold desc="set query string">
            String query = "INSERT INTO media(photo1,caption1";
            for(i=2; i<=captions.size(); i++){
                query +=",photo"+i+",caption"+i;
            }
            query +=") VALUES(";
            for(i=1; i<=captions.size(); i++){
                if(i==1)query +="?,?";
                else query +=",?,?";
            }
            query += ");";
//</editor-fold>

        //<editor-fold desc="store image into media table">
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            int j=1;
            for(i=0; i<images.size(); i++){
                pstmnt.setBlob(j++,images.get(i));
                pstmnt.setString(j++,captions.get(i));
            }
            out.println(pstmnt+"<br>");
            out.println("execut return "+pstmnt.execute());
        //</editor-fold>

        //<editor-fold desc="get last added media_id from media table">

            query = "SELECT AUTO_INCREMENT\n" +
                    "FROM information_schema.TABLES\n" +
                    "WHERE TABLE_SCHEMA = \"association\"\n" +
                    "AND TABLE_NAME = \"media\"";
            pstmnt = conn.getPreparedStatement(query);
            ResultSet rs = pstmnt.executeQuery();
            
            rs.next();
            int lastMediaId = rs.getInt("AUTO_INCREMENT")-1;
            out.println("last id "+lastMediaId);
        //</editor-fold>
    
        //<editor-fold desc="Store short description into gallery table">
            query = "INSERT INTO gallery VALUES(?,?);";
            pstmnt = conn.getPreparedStatement(query);
            pstmnt.setInt(1,lastMediaId);
            pstmnt.setString(2,description);
            
            out.println(pstmnt.execute());
        //</editor-fold>
            
        response.sendRedirect("Gallery");
        } catch (Exception e) {
            out.println(e);
            request.setAttribute("error", e);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
    // </editor-fold>

}
