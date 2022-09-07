package com.association;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Vector;

/**
 * Created on 07-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "Members", value = "/Members")
public class Members extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MembersDAO memberModel = new MembersDAO();
        Vector<AssocMember>assocMemberList = memberModel.getAssocMemberList();
        
        request.getSession().setAttribute("assocMemberList", assocMemberList);
        request.getRequestDispatcher("members.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
}
