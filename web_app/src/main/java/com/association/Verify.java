package com.association;

import com.association.database.DatabaseConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UTFDataFormatException;
import java.nio.charset.StandardCharsets;
import java.sql.PreparedStatement;

@WebServlet(name = "verifyMail", value = "/verifyMail")
public class Verify extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            DatabaseConnection conn = new DatabaseConnection();
            String query = "INSERT INTO members VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            AssocMember member = (AssocMember) request.getAttribute("member");
            pstmnt.setString(1,member.getName());
            pstmnt.setString(2,member.getId());
            pstmnt.setString(3,member.getEmail());
            pstmnt.setString(4,member.getPassword());
            pstmnt.setString(5,member.getPhone());
            pstmnt.setString(6,member.getDept());
            pstmnt.setString(7,member.getSession());
            pstmnt.setString(8,member.getBatch());
            pstmnt.setString(9,member.getGender());
            pstmnt.setString(10,member.getBloodGroup());
            InputStream stream = new ByteArrayInputStream(member.getPhoto().getBytes());
            pstmnt.setBlob(11,stream);
            pstmnt.setString(12,member.getCoActivity());
            pstmnt.setString(13,member.getFathersname());
            pstmnt.setString(14,member.getMothersname());
            pstmnt.setString(15,member.getPresentArea());
            pstmnt.setString(16,member.getPresentDetails());
            pstmnt.setString(17,member.getPermanentUpazila());
            pstmnt.setString(18,member.getPermanentDetails());
            pstmnt.setString(19,member.getTranc_no());

            pstmnt.execute();

        } catch (Exception e) {
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
        request.setAttribute("isRegistrationCompleted",true);
        request.getRequestDispatcher("login.jsp").forward(request,response);

    }
}
