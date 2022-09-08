package com.association.reset;

import com.association.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * Created on 09-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "Reset", value = "/reset")
public class Reset extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("role",request.getParameter("role"));
        if(request.getParameter("t").equals("password"))
            request.getRequestDispatcher("resetPassword.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            UserAccount user = new UserAccount();
            user.setEmail(request.getParameter("email"));
            user.setRole(request.getParameter("role"));
            user.setSalt(SecurePassword.generateSalt(512).get());
            user.setKey(SecurePassword.hashPassword(request.getParameter("password"), user.getSalt()).get());
            request.getSession().setAttribute("user",user);

            request.getSession().setAttribute("verificationCode", Utility.getVerificationCode() );
            AssocInfo assocInfo = (AssocInfo) getServletContext().getAttribute("assocInfo");

            SendMail mail = new SendMail(assocInfo, user.getEmail());
            mail.send("Verification","Your Verification Code is: "+request.getSession().getAttribute("verificationCode")+"\n");

            request.getRequestDispatcher("resetVerification.jsp").forward(request,response);
    }
}
