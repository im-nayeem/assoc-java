/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

import com.association.database.DatabaseConnection;
import com.association.members.AssocMember;
import com.association.members.MembersDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
@WebServlet(name = "VerifiedMembers", urlPatterns = {"/VerifiedMembers"})
public class VerifiedMembers extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MembersDAO memberModel = new MembersDAO();
        Vector<AssocMember> assocMemberList = memberModel.getAssocMemberList();
        request.getSession().setAttribute("assocMemberList", assocMemberList);
        
        try {
//----------------------------get latest committee number-------------------------------------//
            DatabaseConnection conn = new DatabaseConnection();

            PreparedStatement pstmnt = conn.getPreparedStatement("SELECT MAX(committee_id) as lastId FROM exec_committee");
            ResultSet rs = pstmnt.executeQuery();
            int lastCommitteeId = 1;
            if(rs.next()){
                lastCommitteeId = rs.getInt("lastId");
                lastCommitteeId++;
            }
            request.getSession().setAttribute("lastCommitteeId", lastCommitteeId);
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }

        
        request.getRequestDispatcher("verifiedMembers.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
