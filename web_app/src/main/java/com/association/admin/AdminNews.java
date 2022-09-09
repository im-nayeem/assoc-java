/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

import com.association.AssocNews;
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
@WebServlet(name = "AdminNews", urlPatterns = {"/AdminNews"})
public class AdminNews extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminNews</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminNews at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement("SELECT media.photo1 as photo,"
                    + " news.headline as headline,news.details as details, news.footer as footer,"
                    + " news.post_date as post_date FROM media,news WHERE media.media_id=news.media_id ORDER BY news.post_date;");
            ResultSet rs = pstmnt.executeQuery();
            Vector<AssocNews>newsList = new Vector<>();
            
            while(rs.next()){
                AssocNews news = new AssocNews();
                news.setHeadline(rs.getString("headline"));
                news.setDetails(rs.getString("details"));
                news.setPublicationDate(rs.getString("post_date"));
                news.setFooter(rs.getString("footer"));
                news.setPhoto(rs.getBinaryStream("photo"));
                newsList.add(news);
            }
            
            request.getSession().setAttribute("newsList", newsList);
            request.getRequestDispatcher("news.jsp").forward(request,response);
        } catch (Exception e) {
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    // </editor-fold>

}
