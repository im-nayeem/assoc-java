/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

import com.association.database.DatabaseConnection;
import com.association.members.ExecutiveMember;
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
@WebServlet(name = "ExecutiveCommittee", urlPatterns = {"/ExecutiveCommittee"})
public class ExecutiveCommittee extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String type = request.getParameter("type");
        if (type.equals("init")) {
            try {
                DatabaseConnection conn = new DatabaseConnection();

//----------------------------get latest committee number-------------------------------------//
                PreparedStatement pstmnt = conn.getPreparedStatement("SELECT MAX(committee_id) as lastId FROM exec_committee");
                ResultSet rs = pstmnt.executeQuery();

                int lastCommitteeId = 1;
                if (rs.next()) {
                    lastCommitteeId = rs.getInt("lastId");
                    lastCommitteeId++;
                }
                request.getSession().removeAttribute("lastAddedList");
                request.getSession().setAttribute("lastCommitteeId", lastCommitteeId);

                request.getRequestDispatcher("executiveMember.jsp").forward(request, response);

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

//---------------------- add new committee time -----------------//
        if (type.equals("newExecutiveCommittee")) {
            String startDate = request.getParameter("from_time");
            String endDate = request.getParameter("to_time");
            int committeeNumber = (int) request.getSession().getAttribute("lastCommitteeId");

            try {
                DatabaseConnection conn = new DatabaseConnection();
                PreparedStatement pstmnt = conn.getPreparedStatement("INSERT INTO `exec_committee`(`committee_id`, `from_time`, `to_time`) VALUES (?,?,?)");
                pstmnt.setInt(1, committeeNumber);
                pstmnt.setString(2, startDate);
                pstmnt.setString(3, endDate);

                pstmnt.execute();
            } catch (Exception e) {
                request.setAttribute("error", e);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
            request.getRequestDispatcher("executiveMember.jsp").forward(request, response);
        } 

//-------------- update executive committee member info----------------//
        else if (type.equals("update")) {
            Vector<ExecutiveMember> lastAddedList = (Vector<ExecutiveMember>) request.getSession().getAttribute("lastAddedList");
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = null;
            try {
                for (ExecutiveMember member : lastAddedList) {
                    String postName = request.getParameter(member.getId() + "postName");
                    pstmnt = conn.getPreparedStatement("UPDATE `exec_member` SET `post`='" + postName
                            + "' WHERE exec_member.id='" + member.getId() + "';");
                    pstmnt.execute();
                }
            } catch (Exception e) {
                request.setAttribute("error", e);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
            request.getSession().removeAttribute("lastAddedList");
            request.getRequestDispatcher("executiveMember.jsp").forward(request, response);

        }
//------------ FILTER to update executive member info according to committee id-----------------//
        else if (type.equals("filter")) {
            int committeeNumber = Integer.parseInt(request.getParameter("committeeNumber"));
            Vector<ExecutiveMember> lastAddedList = new Vector<>();
            try {
                DatabaseConnection conn = new DatabaseConnection();
                PreparedStatement pstmnt = conn.getPreparedStatement("SELECT exec_committee.from_time as from_time,"
                        + " exec_committee.to_time as to_time,exec_member.post as post, exec_member.id as id,exec_member.email as email,"
                        + "members.photo as photo,members.name as name FROM exec_member,members,exec_committee "
                        + "WHERE exec_member.committee_id = " + committeeNumber + " AND members.id = exec_member.id ORDER BY id;");

                ResultSet rs = pstmnt.executeQuery();
                while (rs.next()) {
                    ExecutiveMember exeMember = new ExecutiveMember();
                    exeMember.setStartDate(rs.getString("from_time"));
                    exeMember.setEndDate(rs.getString("to_time"));
                    exeMember.setPostName(rs.getString("post"));
                    exeMember.setName(rs.getString("name"));
                    exeMember.setEmail(rs.getString("email"));
                    exeMember.setId(rs.getString("id"));
                    exeMember.setPhoto(rs.getBinaryStream("photo"));
                    if(lastAddedList.size()==0 || lastAddedList.lastElement().getEmail().equals(exeMember.getEmail())==false){
                        lastAddedList.add(exeMember);
                    }
                }
                request.getSession().setAttribute("lastAddedList", lastAddedList);
                request.getRequestDispatcher("executiveMember.jsp").forward(request, response);

            } catch (Exception e) {
                request.setAttribute("error", e);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }

        }

    }

    // </editor-fold>
}
