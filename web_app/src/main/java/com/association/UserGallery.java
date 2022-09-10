/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association;

import com.association.database.DatabaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mestu
 */
@WebServlet(name = "UserGallery", urlPatterns = {"/UserGallery"})
public class UserGallery extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String query = "SELECT *,gallery.short_desc FROM `media`,gallery  WHERE media.media_id IN(SELECT id FROM gallery);";
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            
            Vector<AssocGallery>galleries =  new Vector<>();
            ResultSet rs = pstmnt.executeQuery();
            
            while(rs.next()){
                AssocGallery gallery = new AssocGallery();
                gallery.setId(rs.getString("id"));
                gallery.setPhoto(rs.getBinaryStream("photo1"));
                gallery.setCaption(rs.getString("caption1"));
                galleries.add(gallery);
                if(rs.getString("caption2")!=null){
                    gallery.setPhoto(rs.getBinaryStream("photo2"));
                    gallery.setCaption(rs.getString("caption2"));
                    galleries.add(gallery);
                }
                if(rs.getString("caption3")!=null){
                    gallery.setPhoto(rs.getBinaryStream("photo3"));
                    gallery.setCaption(rs.getString("caption3"));
                    galleries.add(gallery);
                }
            }
            request.setAttribute("galleries", galleries);
            request.getRequestDispatcher("gallery.jsp").forward(request, response);
            
            
        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // </editor-fold>

}
