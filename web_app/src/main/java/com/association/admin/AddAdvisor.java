package com.association.admin;

import com.association.AssocInfo;
import com.association.SendMail;
import com.association.Utility;
import com.association.database.DatabaseConnection;

//import javax.rmi.CORBA.Util;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created on 09-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "AddAdviser", value = "/AddAdviser")
public class AddAdvisor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            try{
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String from_time = request.getParameter("from_time");
                String to_time = request.getParameter("to_time");

                DatabaseConnection conn = new DatabaseConnection();
                PreparedStatement pstmt = conn.getPreparedStatement("insert into account (email,role) values(?,?)");
                pstmt.setString(1,email);
                pstmt.setString(2,"adviser");
                pstmt.execute();

                pstmt = conn.getPreparedStatement( "insert into adviser (name,email,from_time,to_time) values(?,?,?,?)");
                pstmt.setString(1,name);
                pstmt.setString(2,email);
                pstmt.setString(3,from_time);
                pstmt.setString(4,to_time);

                pstmt.execute();

                conn.close();

                AssocInfo assocInfo = (AssocInfo) getServletContext().getAttribute("assocInfo");
                SendMail mail = new SendMail(assocInfo,email);
                String baseUrl = Utility.getBaseUrl(request);
                mail.send("Advisor in "+assocInfo.getAssocAbbr(),"Greetings!\n"+assocInfo.getAssocName()+"has added you as an adviser. Complete this process and access website by creating new password at: \n"+baseUrl+"/adviser-reg?email="+email+"\n");

                response.sendRedirect("ManageAdviser?t=all");

            }catch (Exception e){
                request.setAttribute("error",e);
                request.getRequestDispatcher("error.jsp").forward(request,response);
            }
    }
}
