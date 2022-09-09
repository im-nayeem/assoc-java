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
@WebServlet(name = "DetailsNewsNotice", urlPatterns = {"/DetailsNewsNotice"})
public class DetailsNewsNotice extends HttpServlet {



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String type = request.getParameter("type");
        String id = request.getParameter("id");
        

//        <editor-fold defaultstate="collapsed" desc="notice request">
//-------------------------notice request ---------------------//
        if(type.equals("notice")){
            AssocNotice noticeDetails = new AssocNotice();
            try {
                DatabaseConnection conn = new DatabaseConnection();
                PreparedStatement pstmnt = conn.getPreparedStatement("SELECT * FROM `notice` WHERE notice_id="+id);
                ResultSet rs = pstmnt.executeQuery();
                if(rs.next()){
                    noticeDetails.setHeadline(rs.getString("headline"));
                    noticeDetails.setDetails(rs.getString("details"));
                    noticeDetails.setPublicationDate(rs.getString("post_date"));
                    noticeDetails.setFooter(rs.getString("footer"));
                    request.getSession().setAttribute("noticeDetails", noticeDetails);
                    request.getRequestDispatcher("noticeDetails.jsp").forward(request, response);
                }
                else{
//                    notice deleted
                }
            } catch (Exception e) {
                request.setAttribute("error",e);
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }
        }
//        </editor-fold>
//        <editor-fold defaultstate="collapsed" desc="news request">
        
//---------------------news request-------------------------//
        else if(type.equals("news")){
            AssocNews newsDetails = new AssocNews();
            try {
                DatabaseConnection conn = new DatabaseConnection();
                PreparedStatement pstmnt = conn.getPreparedStatement("SELECT media.photo1 as photo,"
                        + " news.news_id as news_id, news.headline as headline,news.details as details,"
                        + " news.footer as footer, news.post_date as post_date "
                        + "FROM media,news "
                        + "WHERE media.media_id=news.media_id AND news.news_id="+id);
                ResultSet rs = pstmnt.executeQuery();
                if(rs.next()){
                    newsDetails.setHeadline(rs.getString("headline"));
                    newsDetails.setDetails(rs.getString("details"));
                    newsDetails.setPublicationDate(rs.getString("post_date"));
                    newsDetails.setFooter(rs.getString("footer"));
                    newsDetails.setPhoto(rs.getBinaryStream("photo"));
                    newsDetails.setNewsId(rs.getString("news_id"));
                    
                    request.getSession().setAttribute("newsDetails", newsDetails);
                    request.getRequestDispatcher("newsDetails.jsp").forward(request, response);
                }
                else{
//                    news deleted
                }
            } catch (Exception e) {
                request.setAttribute("error",e);
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }
        }
//         </editor-fold>
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // </editor-fold>

}
