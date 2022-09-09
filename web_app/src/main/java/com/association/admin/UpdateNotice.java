/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

import com.association.AssocNews;
import com.association.AssocNotice;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "UpdateNotice", urlPatterns = {"/UpdateNotice"})
public class UpdateNotice extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String id = request.getParameter("id");
            String type = request.getParameter("type");
//-------------------set currnt notice for update-----------------------//
            if (type.equals("notice")) {
                AssocNotice updateNotice = new AssocNotice();
                Vector<AssocNotice> allNotice = (Vector<AssocNotice>) request.getSession().getAttribute("noticeList");
                for (AssocNotice notice : allNotice) {
                    if (notice.getNoticeId().equals(id)) {
                        updateNotice = notice;
                        break;
                    }
                }
                request.getSession().setAttribute("updateNotice", updateNotice);
                request.getRequestDispatcher("addNotice.jsp").forward(request, response);
            }
            else if(type.equals("news")){
                AssocNews updateNews = new AssocNews();
                Vector<AssocNews> allNews = (Vector<AssocNews>) request.getSession().getAttribute("newsList");
                for (AssocNews news : allNews) {
                    if (news.getNewsId().equals(id)) {
                        updateNews = news;
                        break;
                    }
                }
                request.getSession().setAttribute("updateNews", updateNews);
                request.getRequestDispatcher("addNews.jsp").forward(request, response);
            }
        }
        catch(Exception e) {
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
