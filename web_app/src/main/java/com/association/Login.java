package com.association;

import com.association.database.DatabaseConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login", value = "/Login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        DatabaseConnection db = new DatabaseConnection();
        
        String validPassword = db.getColumnValueByKey("members", "pass","email", email);
        
        if(validPassword.equals(password)){
//            set user information to requestSession and forward to homepage

            AssocMember userProfile = new AssocMember(email);
            
            request.getSession().setAttribute("userProfile",userProfile);
            request.getRequestDispatcher("dashboard.jsp").forward(request,response);
        }
        else{
            String msg = "Somthing error";
//            user email does not contain any account
            if(validPassword.equals("no record")){
                msg = "Invalid Email account";
            }
//            Database Query Error
            else if(validPassword.substring(0,7).equals("Error!")){
                request.setAttribute("error",msg);
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }
//            password not match
            else{
                msg = "Wrong password";
            }
            request.setAttribute("login_error",msg);
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }
    }
}
