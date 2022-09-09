/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

import com.association.database.DatabaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "DeleteNewsNotice", urlPatterns = {"/DeleteNewsNotice"})
public class DeleteNewsNotice extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            DatabaseConnection conn = new DatabaseConnection();
            String type = request.getParameter("type");
            if(type.equals("notice")){
                PreparedStatement pstmnt = conn.getPreparedStatement("DELETE FROM `notice` WHERE notice_id ='"+request.getParameter("id")+"'");
                pstmnt.execute();
                response.sendRedirect("AdminNotice");
            }
            else{
                PreparedStatement pstmnt = conn.getPreparedStatement("DELETE FROM `news` WHERE news_id ='"+request.getParameter("id")+"'");
                pstmnt.execute();
                response.sendRedirect("AdminNews");
            }
            
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    // </editor-fold>

}
