package com.association.admin;

import com.association.database.DatabaseConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created on 09-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "AddAdvisor", value = "/AddAdvisor")
public class AddAdvisor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            try{
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String from_time = request.getParameter("from_time");
                String to_time = request.getParameter("to_time");

                DatabaseConnection conn = new DatabaseConnection();
                PreparedStatement pstmt = conn.getPreparedStatement("insert into account (email,role) values(?,?)");
                pstmt.setString(1,email);
                pstmt.setString(2,"advisor");
                pstmt.execute();

                pstmt = conn.getPreparedStatement( "insert into advisor (name,email,from_time,to_time) values(?,?,?,?)");
                pstmt.setString(1,name);
                pstmt.setString(2,email);
                pstmt.setString(3,from_time);
                pstmt.setString(4,to_time);

                pstmt.execute();

                conn.close();

                response.sendRedirect("ManageAdvisor");

            }catch (Exception e){
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }
    }
}
