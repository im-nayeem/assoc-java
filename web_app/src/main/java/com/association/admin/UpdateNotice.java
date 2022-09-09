/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

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
        String noticeId = request.getParameter("noticeId");
        AssocNotice updateNotice = new AssocNotice();
        Vector<AssocNotice> allNotice = (Vector<AssocNotice>) request.getSession().getAttribute("noticeList");
        for(AssocNotice notice:allNotice){
            if(notice.getNoticeId().equals(noticeId)){
                updateNotice = notice;
                break;
            }
        }
        request.getSession().setAttribute("updateNotice", updateNotice);
        request.getRequestDispatcher("addNotice.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
