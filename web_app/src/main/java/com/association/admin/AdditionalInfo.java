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
@WebServlet(name = "AdditionalInfo", urlPatterns = {"/AdditionalInfo"})
public class AdditionalInfo extends HttpServlet {



    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String id = request.getParameter("studentId");
        String type = request.getParameter("type");
        
//-------------------mark memeber as an alumni----------------------------//
        if(type.equals("alumni")){
            try {
                DatabaseConnection conn = new DatabaseConnection();
                PreparedStatement pstmnt = conn.getPreparedStatement("INSERT INTO `alumni`(`id`, `email`) "
                        + "VALUES ('"+id+"','"+email+"');");
                pstmnt.execute();
                request.setAttribute("addAlumni", "Successfully marked the member as alumni");
                response.sendRedirect("VerifiedMembers");
            } catch (Exception e) {
                request.setAttribute("error", e);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
            
        }
        else if(type.equals("exeMember")){
            try {
                
                response.sendRedirect("VerifiedMembers");
            } catch (Exception e) {
                request.setAttribute("error", e);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // </editor-fold>

}
