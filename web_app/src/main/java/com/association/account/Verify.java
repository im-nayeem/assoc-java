package com.association.account;

import com.association.AssocMember;
import com.association.database.DatabaseConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;

@WebServlet(name = "verifyMail", value = "/verifyMail")
public class Verify extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int x = Integer.parseInt(request.getSession().getAttribute("verificationCode").toString());
        int y = Integer.parseInt(request.getParameter("verify_code"));

        if(x!=y)
        {
            request.setAttribute("errorCode","Wrong verification code! Code didn't match.");
            request.getRequestDispatcher("verifyMail.jsp").forward(request,response);
        }
        try {
            DatabaseConnection conn = new DatabaseConnection();
            String query = "INSERT INTO members VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            AssocMember member = (AssocMember) request.getSession().getAttribute("member");
            pstmnt.setString(1,member.getName());
            pstmnt.setString(2,member.getId());
            pstmnt.setString(3,member.getEmail());
            pstmnt.setString(4,member.getPassword());
            pstmnt.setString(5,member.getSalt());
            pstmnt.setString(6,member.getPhone());
            pstmnt.setString(7,member.getDept());
            pstmnt.setString(8,member.getSession());
            pstmnt.setString(9,member.getBatch());
            pstmnt.setString(10,member.getGender());
            pstmnt.setString(11,member.getBloodGroup());
            pstmnt.setBlob(12,member.getPhoto());
            pstmnt.setString(13,member.getCoActivity());
            pstmnt.setString(14,member.getFathersName());
            pstmnt.setString(15,member.getMothersName());
            pstmnt.setString(16,member.getPresentArea());
            pstmnt.setString(17,member.getPresentDetails());
            pstmnt.setString(18,member.getPermanentUpazila());
            pstmnt.setString(19,member.getPermanentDetails());
            pstmnt.setString(20,member.getTrancNo());



            pstmnt.execute();

            request.getSession().removeAttribute("member");

            request.setAttribute("isRegistrationCompleted",true);
            response.sendRedirect("Login");

        } catch (Exception e) {
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }


    }
}
