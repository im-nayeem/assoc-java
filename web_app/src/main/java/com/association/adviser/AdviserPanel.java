package com.association.adviser;

import com.association.Adviser;
import com.association.SecurePassword;
import com.association.UserAccount;
import com.association.database.DatabaseConnection;
import com.association.members.AssocMember;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created on 09-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "adviser-panel", value = "/adviser-panel")
public class AdviserPanel extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            if(request.getParameter("t").equals("all"))
            {
                request.setAttribute("adviserList", Adviser.getAdviserList());
                request.getRequestDispatcher("adviser-panel/advisers.jsp").forward(request,response);
            }
            if(request.getParameter("t").equals("login"))
                request.getRequestDispatcher("adviser-panel/adviserLogin.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            DatabaseConnection conn = new DatabaseConnection();

            PreparedStatement pstmt = conn.getPreparedStatement("SELECT  * from adviser where email=?");
            pstmt.setString(1,email);
            ResultSet rs = pstmt.executeQuery();


            if(!rs.next()){
                request.setAttribute("login_error","Invalid e-mail address!");
                request.getRequestDispatcher("adviserLogin.jsp").forward(request,response);
            }


            UserAccount user = new UserAccount(email,"adviser");

            if(SecurePassword.verifyPassword(password,user.getKey(), user.getSalt())==true)
            {
                Adviser adviserProfile = new Adviser(email);
                request.getSession().setAttribute("adviserProfile",adviserProfile);
                request.getSession().setAttribute("isRegistrationCompleted",true);
                response.sendRedirect("Dashboard");
            }
            else{
                request.setAttribute("login_error","Incorrect Password!");
                request.getRequestDispatcher("adviserLogin.jsp").forward(request,response);
            }

            conn.close();


        }
        catch(Exception e){
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}
