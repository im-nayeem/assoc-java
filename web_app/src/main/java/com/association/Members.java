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
        
        try{
            MembersDAO memberModel = new MembersDAO();
            Vector<AssocMember>assocMemberList = memberModel.getAssocMemberList();
            MemberFilterValue memberFilterValue = memberModel.getMemberFilterValue();
            
            request.getSession().setAttribute("assocMemberList", assocMemberList);
            request.getSession().setAttribute("memberFilterValue", memberFilterValue);
            request.getRequestDispatcher("members.jsp").forward(request,response);
        }
        catch(Exception e){
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }
}
