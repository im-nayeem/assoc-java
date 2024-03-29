/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

import com.association.members.AssocMember;
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
@WebServlet(name = "AdminMembersDetails", urlPatterns = {"/AdminMembersDetails"})
public class AdminMembersDetails extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AdminMembersDetails</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdminMembersDetails at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            AssocMember assocMemberDetails = null;
            String email = request.getParameter("email");

//            find details of member using email
            Vector<AssocMember> assocMemberList = (Vector<AssocMember>) request.getSession().getAttribute("assocMemberList");
            for (AssocMember member : assocMemberList) {
                if (member.getEmail().equals(email)) {
                    assocMemberDetails = member;
                    break;
                }
            }

            request.getSession().setAttribute("assocMemberDetails", assocMemberDetails);
            
//            it is a indicator to know >is this member is verified or not
            String memberType = request.getParameter("type");
            
//            according to verified attribute approve/reject button show or hide
            if(memberType.equals("verified")){
                request.getSession().setAttribute("verified", "yes");
            }
            else{
                request.getSession().setAttribute("verified", "no");
            }
            request.getRequestDispatcher("adminMemberDetails.jsp").forward(request, response);
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
