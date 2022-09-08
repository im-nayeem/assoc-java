/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

import com.association.database.DatabaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, Exception e)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddNotice</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddNotice at " + request.getContextPath() + "</h1>");
            out.println(e.getMessage());
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        String headline = request.getParameter("headline");
        String details = request.getParameter("details");
        String footer = request.getParameter("footer");
        String newNotice = request.getParameter("newNotice");
        
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
            } catch (Exception ex) {
                processRequest(request, response,ex);
            }
            
        }
        else{
            
        }
    }

}
