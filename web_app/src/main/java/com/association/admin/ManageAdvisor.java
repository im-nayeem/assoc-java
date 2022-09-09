package com.association.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * Created on 09-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "ManageAdvisor", value = "/ManageAdvisor")
public class ManageAdvisor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("t")!=null && request.getParameter("t").equals("add"))
            request.getRequestDispatcher("admin-panel/addAdvisorForm.jsp").forward(request,response);
        request.setAttribute("advisorList",Advisor.getAdvisorList());
        request.getRequestDispatcher("admin-panel/manage advisor.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
