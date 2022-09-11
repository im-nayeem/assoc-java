/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

import com.association.AssocNotice;
import com.association.database.DatabaseConnection;
import java.io.IOException;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mestu
 */
@WebServlet(name = "AddNotice", urlPatterns = {"/AddNotice"})
public class AddNotice extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String headline = request.getParameter("headline");
        String details = request.getParameter("details");
        String footer = request.getParameter("footer");
        String newNotice = request.getParameter("newNotice");


//        add new notice 
        if(newNotice.equals("yes")){
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement("INSERT INTO `notice`(`headline`, "
                    + "`details`, `footer`, `post_date`) VALUES (?,?,?,CURDATE());");
            try {
                pstmnt.setString(1, headline);
                pstmnt.setString(2, details);
                pstmnt.setString(3, footer);
                pstmnt.execute();
                response.sendRedirect("AdminNotice");
            } catch (Exception e) {
                request.setAttribute("error", e);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
            
        }
//        update existing notice
        else{
            DatabaseConnection conn = new DatabaseConnection();
            AssocNotice updateNotice = (AssocNotice) request.getSession().getAttribute("updateNotice");
            request.getSession().removeAttribute("updateNotice");
            
            try {
                PreparedStatement pstmnt = conn.getPreparedStatement("UPDATE `notice` SET `headline`='"
                        +headline+"',`details`='"+details+"',`footer`='"+footer+"' WHERE `notice_id`='"
                        +updateNotice.getNoticeId()+"';");
                pstmnt.execute();
                response.sendRedirect("AdminNotice");

            } catch (Exception e) {
                request.setAttribute("error", e);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
    }

}
