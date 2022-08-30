package com.association.account;

import com.association.AssocInfo;
import com.association.AssocMember;
import com.association.SendMail;
import com.association.Utility;
import com.association.database.DatabaseConnection;

import javax.naming.Context;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Registration", value = "/Registration")
@MultipartConfig
public class Registration extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("registration.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        try{
            DatabaseConnection conn = new DatabaseConnection();
            String userMail = request.getParameter("email");
            String query_result = conn.getColumnValueByKey("members", "email", "email",userMail);
//
//        exception handle
            if(query_result.substring(0,6).equals("error")){
                request.setAttribute("error",query_result);
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }
//        check new email or not
            if(query_result.equals("no record")==false){
                request.setAttribute("isNotValidEmail",true);
                response.sendRedirect("Registration");
            }
//
            AssocMember member = new AssocMember(request);
            request.getSession().setAttribute("member",member);

            request.getSession().setAttribute("verificationCode", Utility.getVerificationCode() );


            AssocInfo assocInfo = (AssocInfo) getServletContext().getAttribute("assocInfo");
            SendMail mail = new SendMail(assocInfo,userMail);
//            mail.send("Verification","Your Verification Code is: "+request.getSession().getAttribute("verificationCode")+"\n");


        }
        catch (Exception e)
        {
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }


        request.getRequestDispatcher("verifyMail.jsp").forward(request,response);


    }
}
