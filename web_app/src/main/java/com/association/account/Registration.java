package com.association.account;

import com.association.AssocInfo;
import com.association.UserAccount;
import com.association.members.AssocMember;
import com.association.SendMail;
import com.association.Utility;
import com.association.database.DatabaseConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet(name = "Registration", value = "/Registration")
@MultipartConfig
public class Registration extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().setAttribute("title","Registration");
        request.getRequestDispatcher("account/registration.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        try{
            DatabaseConnection conn = new DatabaseConnection();
            String email = request.getParameter("email");

            PreparedStatement pstmt = conn.getPreparedStatement("SELECT  * from members where email=?");
            pstmt.setString(1,email);
            ResultSet rs = pstmt.executeQuery();


            if(rs.next()){
                request.setAttribute("reg_error","This e-mail is already used!");
                request.getRequestDispatcher("account/registration.jsp").forward(request,response);
            }


            AssocMember member = new AssocMember(request);
            request.getSession().setAttribute("member",member);


            request.getSession().setAttribute("verificationCode", Utility.getVerificationCode() );


            AssocInfo assocInfo = (AssocInfo) getServletContext().getAttribute("assocInfo");
            SendMail mail = new SendMail(assocInfo,email);
//            mail.send("Verification","Your Verification Code is: "+request.getSession().getAttribute("verificationCode")+"\n");
            request.setAttribute("forwardServlet","verifyMail");
            request.getRequestDispatcher("verifyMail.jsp").forward(request,response);

            conn.close();

        }
        catch (Exception e)
        {
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }





    }
}
