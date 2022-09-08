package com.association.admin;

import com.association.SecurePassword;
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

            PreparedStatement pstmt = conn.getPreparedStatement("SELECT  * from adminpanel where email=?");
            pstmt.setString(1,email);
            ResultSet rs = pstmt.executeQuery();


            if(!rs.next()){
                request.setAttribute("login_error","Invalid e-mail address!");
                request.getRequestDispatcher("adminLogIn.jsp").forward(request,response);
            }


            String key = conn.getColumnValueByKey("adminpanel", "pass","email", email);
            String salt = conn.getColumnValueByKey("adminpanel", "salt","email", email);

            if(SecurePassword.verifyPassword(password,key,salt)==true)
            {

                request.getSession().setAttribute("adminInfo",email);
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
