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
@WebServlet(name = "News", urlPatterns = {"/News"})
public class News extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement("SELECT media.photo1 as photo,"
                    + " news.news_id as news_id,"
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
                news.setNewsId(rs.getString("news_id"));
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


}
