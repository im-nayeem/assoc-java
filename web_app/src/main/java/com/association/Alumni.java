/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association;

import com.association.database.DatabaseConnection;
import com.association.members.AssocMember;
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
@WebServlet(name = "Alumni", urlPatterns = {"/Alumni"})
public class Alumni extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String type = request.getParameter("type");
        if (type.equals("init")) {
            try {
                DatabaseConnection conn = new DatabaseConnection();
                PreparedStatement pstmnt = conn.getPreparedStatement("SELECT DISTINCT members.name as name,"
                        + "members.photo as photo, members.email as email, members.dept as department,"
                        + " members.session as session, alumni.occupation as occupation,"
                        + " alumni.job_loc as jobLocation FROM members,alumni "
                        + "WHERE members.id IN(SELECT id FROM alumni);");
                ResultSet rs = pstmnt.executeQuery();
                Vector<AssocMember> alumniList = new Vector<AssocMember>();
                while (rs.next()) {
                    AssocMember alumni = new AssocMember();
                    alumni.setName(rs.getString("name"));
                    alumni.setPhoto(rs.getBinaryStream("photo"));
                    alumni.setEmail(rs.getString("email"));
                    alumni.setDept(rs.getString("department"));
                    alumni.setSession(rs.getString("session"));
                    if(rs.getString("occupation")==null){
                        alumni.setOccupation("Not Provided");
                        alumni.setJobLocation("Not Provided");
                    }
                    else{
                        alumni.setOccupation(rs.getString("occupation"));
                        alumni.setJobLocation(rs.getString("jobLocation"));
                    }

                    alumniList.add(alumni);
                }
                request.setAttribute("alumniList", alumniList);
                request.getRequestDispatcher("alumni.jsp").forward(request, response);

            } catch (Exception e) {
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    // </editor-fold>
}
