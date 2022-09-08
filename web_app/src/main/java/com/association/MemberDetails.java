/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association;

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
@WebServlet(name = "MemberDetails", urlPatterns = {"/MemberDetails"})
public class MemberDetails extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            AssocMember assocMemberDetails = null;
            String email = request.getParameter("email");

            Vector<AssocMember> assocMemberList = (Vector<AssocMember>) request.getSession().getAttribute("assocMemberList");
            for (AssocMember member : assocMemberList) {
                if (member.getEmail().equals(email)) {
                    assocMemberDetails = member;
                    break;
                }
            }

            request.getSession().setAttribute("assocMemberDetails", assocMemberDetails);
            request.getRequestDispatcher("memberDetails.jsp").forward(request, response);
        }
        catch(Exception e){
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
