/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

import com.association.members.AssocMember;
import com.association.members.MemberFilterValue;
import com.association.members.MembersDAO;
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
@WebServlet(name = "RegisteredMembers", urlPatterns = {"/RegisteredMembers"})
public class RegisteredMembers extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            MembersDAO memberModel = new MembersDAO();
            Vector<AssocMember>assocMemberList = memberModel.getRegisteredAssocMemberList();

            request.getSession().setAttribute("assocMemberList", assocMemberList);
            request.getRequestDispatcher("registeredMembers.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


}
