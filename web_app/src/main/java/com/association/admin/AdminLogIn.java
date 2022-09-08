package com.association.admin;

import com.association.SecurePassword;
import com.association.UserAccount;
import com.association.database.DatabaseConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created on 07-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "AdminLogIn", value = "/admin-login")
public class AdminLogIn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("adminLogIn.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            DatabaseConnection conn = new DatabaseConnection();

            PreparedStatement pstmt = conn.getPreparedStatement("SELECT  * from account where email=? and role=?");
            pstmt.setString(1,email);
            pstmt.setString(2,"admin");
            ResultSet rs = pstmt.executeQuery();


            if(!rs.next()){
                request.setAttribute("login_error","Invalid e-mail address!");
                request.getRequestDispatcher("adminLogIn.jsp").forward(request,response);
            }


            UserAccount user = new UserAccount(email,"admin");

            if(SecurePassword.verifyPassword(password,user.getKey(), user.getSalt())==true)
            {

                request.getSession().setAttribute("adminInfo",user);
                response.sendRedirect("admin-panel");
            }
            else{
                request.setAttribute("login_error","Incorrect Password!");
                request.getRequestDispatcher("adminLogIn.jsp").forward(request,response);
            }

            conn.close();


        }
        catch(Exception e){
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}
