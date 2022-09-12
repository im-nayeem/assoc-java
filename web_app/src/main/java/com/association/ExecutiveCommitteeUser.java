/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association;

import com.association.database.DatabaseConnection;
import com.association.members.AssocExecutiveMember;
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
@WebServlet(name = "ExecutiveCommitteeUser", urlPatterns = {"/ExecutiveCommitteeUser"})
public class ExecutiveCommitteeUser extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String type = request.getParameter("type");
        if (type.equals("init")) {
            try {
                AssocExecutiveMember executiveMember = new AssocExecutiveMember();
                int lastCommitteeId = executiveMember.getLastCommitteeNumer();
                request.getSession().removeAttribute("lastAddedList");
                request.getSession().setAttribute("lastCommitteeId", lastCommitteeId);

                request.getRequestDispatcher("userExecutiveMember.jsp").forward(request, response);

            } catch (Exception e) {
                request.setAttribute("error", e);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String type = request.getParameter("type");
        if (type.equals("filter")) {
            int committeeNumber = Integer.parseInt(request.getParameter("committeeNumber"));
            Vector<AssocExecutiveMember> lastAddedList = new Vector<>();
            try {
                DatabaseConnection conn = new DatabaseConnection();
                PreparedStatement pstmnt = conn.getPreparedStatement("SELECT exec_committee.from_time as from_time,"
                        + " exec_committee.to_time as to_time,exec_member.post as post, exec_member.id as id,exec_member.email as email,"
                        + "members.photo as photo,members.name as name FROM exec_member,members,exec_committee "
                        + "WHERE exec_member.committee_id = " + committeeNumber + " AND members.id = exec_member.id ORDER BY id;");

                ResultSet rs = pstmnt.executeQuery();
                while (rs.next()) {
                    AssocExecutiveMember exeMember = new AssocExecutiveMember();
                    exeMember.setPostName(rs.getString("post"));
                    exeMember.setName(rs.getString("name"));
                    exeMember.setEmail(rs.getString("email"));
                    exeMember.setPhoto(rs.getBinaryStream("photo"));
                    if (lastAddedList.size() == 0 || lastAddedList.lastElement().getEmail().equals(exeMember.getEmail()) == false) {
                        lastAddedList.add(exeMember);
                    }
                }
                request.getSession().setAttribute("lastAddedList", lastAddedList);
                request.getRequestDispatcher("userExecutiveMember.jsp").forward(request, response);

            } catch (Exception e) {
                request.setAttribute("error", e);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }
    }

    // </editor-fold>
}
