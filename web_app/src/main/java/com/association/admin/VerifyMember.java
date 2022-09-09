/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mestu
 */
@WebServlet(name = "VerifyMember", urlPatterns = {"/VerifyMember"})
public class VerifyMember extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VerifyMember</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VerifyMember at " + request.getContextPath() + "</h1>");
            out.println(request.getParameter("isValid"));
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String isValid = request.getParameter("isValid");
            storeInfoDAO model = new storeInfoDAO();

//            isValid parameter is used for knowing approved/rejected
            if(isValid.equals("yes")){
                model.storeVerifiedInfo(request.getParameter("email"), request.getParameter("id"));
            }
            else{
                model.removeMember(request.getParameter("email"));
            }
            response.sendRedirect("RegisteredMembers");
        }
        catch(Exception e){
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

}
