package com.association.reset;

import com.association.UserAccount;
import com.association.database.DatabaseConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.PreparedStatement;

/**
 * Created on 09-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "ResetPassword", value = "/confirm-reset")
public class ConfirmReset extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int x = Integer.parseInt(request.getSession().getAttribute("verificationCode").toString());
            int y = Integer.parseInt(request.getParameter("verify_code"));

            if(x!=y)
            {
                request.setAttribute("errorCode","Wrong verification code! Code didn't match.");
                request.getRequestDispatcher("verifyMail.jsp").forward(request,response);
            }

            UserAccount user = (UserAccount) request.getSession().getAttribute("user");

            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmt = conn.getPreparedStatement("update account set email=?,salt=?,pass=? where email=? and role=?");
            pstmt.setString(1, user.getEmail());
            pstmt.setString(2, user.getSalt());
            pstmt.setString(3, user.getKey());
            pstmt.setString(4, user.getEmail());
            pstmt.setString(5, user.getRole());

            pstmt.execute();
            conn.close();
            response.sendRedirect("Login");
        } catch (Exception e) {
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }

    }
}
