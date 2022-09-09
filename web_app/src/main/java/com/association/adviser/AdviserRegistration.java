package com.association.adviser;

import com.association.*;
import com.association.database.DatabaseConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created on 09-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "AdviserRegistration", value = "/adviser-reg")
@MultipartConfig
public class AdviserRegistration extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.setAttribute("adviserMail",request.getParameter("email"));
            request.getRequestDispatcher("adviser-panel/adviserReg.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{

            if(request.getSession().getAttribute("adviserInfo")==null)
            {
                Adviser adviser = new Adviser();
                adviser.setEmail( request.getParameter("email"));
                adviser.setOccupation(request.getParameter("occupation"));
                adviser.setUserAccount(new UserAccount(adviser.getEmail(),request.getParameter("password"),"adviser"));
                adviser.setPresentAddr(request.getParameter("present_addr"));
                adviser.setPermanentAddr(request.getParameter("permanent_addr"));
                adviser.setPhoto(request.getPart("photo").getInputStream());

                request.getSession().setAttribute("adviserInfo",adviser);

                request.getSession().setAttribute("verificationCode", Utility.getVerificationCode() );

                AssocInfo assocInfo = (AssocInfo) getServletContext().getAttribute("assocInfo");
                SendMail mail = new SendMail(assocInfo,adviser.getEmail());
                mail.send("Verification","Your Verification Code is: "+request.getSession().getAttribute("verificationCode")+"\n");
                request.setAttribute("forwardServlet","adviser-reg");
                request.getRequestDispatcher("verifyMail.jsp").forward(request,response);
            }

            int x = Integer.parseInt(request.getSession().getAttribute("verificationCode").toString());
            int y = Integer.parseInt(request.getParameter("verify_code"));

            if(x!=y)
            {
                request.setAttribute("errorCode","Wrong verification code! Code didn't match.");
                request.getRequestDispatcher("verifyMail.jsp").forward(request,response);
            }

            Adviser adviser = (Adviser) request.getSession().getAttribute("adviserInfo");
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmt = conn.getPreparedStatement("update account set pass=?,salt=? where email=? and role='adviser'");
            pstmt.setString(1,adviser.getUserAccount().getKey());
            pstmt.setString(2,adviser.getUserAccount().getSalt());
            pstmt.setString(3,adviser.getUserAccount().getEmail());
            pstmt.execute();


            pstmt = conn.getPreparedStatement("update adviser set occupation=?,photo=?,present_addr=?,permanent_addr=? where email=?");
            pstmt.setString(1,adviser.getOccupation());
            pstmt.setBlob(2,adviser.getPhoto());
            pstmt.setString(3,adviser.getPresentAddr());
            pstmt.setString(4,adviser.getPermanentAddr());
            pstmt.setString(5,adviser.getEmail());
            pstmt.execute();


            conn.close();
            request.getSession().removeAttribute("verificationCode");
            request.getSession().removeAttribute("adviserInfo");

            response.sendRedirect("adviser-panel?t=login");

        }
        catch (Exception e){
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}
