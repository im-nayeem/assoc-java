package com.association;

import com.association.database.DatabaseConnection;
import java.io.FileInputStream;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

@WebServlet(name = "Registration", value = "/Registration")
@MultipartConfig
public class Registration extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DatabaseConnection db = new DatabaseConnection();
        
        String email = request.getParameter("email");
        String query_result = db.getColumnValueByKey("members", "email", "email",email);
        
//        exception handle
        if(query_result.substring(0,6).equals("error")){
            request.setAttribute("error",query_result);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
//        check new email or not         
        if(query_result.equals("no record")==false){
            request.setAttribute("isNotValidEmail",true);
            request.getRequestDispatcher("registration.jsp");
        }
        String query = "INSERT INTO members VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement pstmnt = db.getPreparedStatement(query);
        try {
            pstmnt.setString(1,request.getParameter("name"));
            pstmnt.setString(2,request.getParameter("id"));
            pstmnt.setString(3,request.getParameter("email"));
            pstmnt.setString(4,request.getParameter("password"));
            pstmnt.setString(5,request.getParameter("phone"));
            pstmnt.setString(6,request.getParameter("department"));
            pstmnt.setString(7,request.getParameter("session"));
            pstmnt.setString(8,request.getParameter("batch"));
            pstmnt.setString(9,request.getParameter("gender"));
            pstmnt.setString(10,request.getParameter("blood_group"));
            pstmnt.setBlob(11,request.getPart("photo").getInputStream());
            pstmnt.setString(12,request.getParameter("co_actvt"));
            pstmnt.setString(13,request.getParameter("fathers_name"));
            pstmnt.setString(14,request.getParameter("mothers_name"));
            pstmnt.setString(15,request.getParameter("present_area"));
            pstmnt.setString(16,request.getParameter("present_details"));
            pstmnt.setString(17,request.getParameter("upazila"));
            pstmnt.setString(18,request.getParameter("permanent_details"));
            pstmnt.setString(19,request.getParameter("transc_no"));
            
            pstmnt.execute();

        } catch (Exception e) {
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
        request.setAttribute("isRegistrationCompleted",true);
        request.getRequestDispatcher("login.jsp").forward(request,response);

    }
}
