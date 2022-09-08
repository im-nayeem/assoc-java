package com.association.account;

import com.association.UserAccount;
import com.association.members.AssocMember;
import com.association.database.DatabaseConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.association.SecurePassword;
@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("account/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            DatabaseConnection conn = new DatabaseConnection();

            PreparedStatement pstmt = conn.getPreparedStatement("SELECT  * from verified where email=?");
            pstmt.setString(1,email);
            ResultSet rs = pstmt.executeQuery();


            if(!rs.next()){
                request.setAttribute("login_error","Invalid e-mail address!");
                request.getRequestDispatcher("account/login.jsp").forward(request,response);
            }


            UserAccount user = new UserAccount(email,"member");

            if(SecurePassword.verifyPassword(password,user.getKey(), user.getSalt())==true)
            {
                AssocMember userProfile = new AssocMember(email);
                request.getSession().setAttribute("userProfile",userProfile);
                request.getSession().setAttribute("isRegistrationCompleted",true);
                response.sendRedirect("Dashboard");
            }
            else{
                request.setAttribute("login_error","Incorrect Password!");
                request.getRequestDispatcher("account/login.jsp").forward(request,response);
            }

            conn.close();


        }
        catch(Exception e){
            request.setAttribute("error",e);
           request.getRequestDispatcher("error.jsp").forward(request,response);
        }
        

    }
}
