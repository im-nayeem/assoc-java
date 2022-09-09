/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

import com.association.AssocNews;
import com.association.database.DatabaseConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
@WebServlet(name = "AddNews", urlPatterns = {"/AddNews"})
@MultipartConfig
public class AddNews extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String newNews = request.getParameter("newNews");
//----------------------add new news----------------------//
        if(newNews.equals("yes")){
            try {
                DatabaseConnection conn = new DatabaseConnection();
//news_id	media_id	headline	details	footer	post_date	

//------------------------------insert photo into media table--------------------------------//
                InputStream photo  = request.getPart("photo").getInputStream();
                PreparedStatement pstmnt  = conn.getPreparedStatement("INSERT INTO media(`photo1`) VALUES(?);");
                pstmnt.setBlob(1, photo);
                pstmnt.execute();
//-------------------------------get last inserted media id-----------------------------------//
                pstmnt = conn.getPreparedStatement("SELECT AUTO_INCREMENT\n" +
                                                    "FROM information_schema.TABLES\n" +
                                                    "WHERE TABLE_SCHEMA = \"assoc\"\n" +
                                                    "AND TABLE_NAME = \"media\";");
                ResultSet rs = pstmnt.executeQuery();
                rs.next();
                int lastId = rs.getInt("AUTO_INCREMENT");
                lastId--;
                
//-----------------------------insert news into news table------------------------------------//
                pstmnt = conn.getPreparedStatement("INSERT INTO `news`(`media_id`, `headline`, `details`,"
                        + " `footer`, `post_date`) VALUES (?,?,?,?,CURDATE());");
                
                pstmnt.setInt(1,lastId);
                pstmnt.setString(2,request.getParameter("headline"));
                pstmnt.setString(3,request.getParameter("details"));
                pstmnt.setString(4,request.getParameter("footer"));
                pstmnt.execute();
                
                
                response.sendRedirect("AdminNews");
            } catch (Exception e) {
                request.setAttribute("error", e);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
        else if(newNews.equals("no")) {
            try {
                DatabaseConnection conn = new DatabaseConnection();
                AssocNews updateNews = (AssocNews) request.getSession().getAttribute("updateNews");
                request.getSession().removeAttribute("updateNews");
//-------------------------update previous existing news-------------------------//
                PreparedStatement pstmnt  = conn.getPreparedStatement("UPDATE `news` SET `headline`='"
                        +request.getParameter("headline")+"',`details`='"
                        +request.getParameter("details")+"',`footer`='"
                        +request.getParameter("footer")+"' WHERE news_id='"
                        +updateNews.getNewsId()+"';");
                pstmnt.execute();
                response.sendRedirect("AdminNews");
            } catch (Exception e) {
                request.setAttribute("error", e);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
    }

    // </editor-fold>

}
