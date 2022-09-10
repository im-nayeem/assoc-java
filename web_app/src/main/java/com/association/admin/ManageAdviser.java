package com.association.admin;

import com.association.Adviser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * Created on 09-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "ManageAdviser", value = "/ManageAdviser")
public class ManageAdviser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if(request.getParameter("t").equals("add"))
            request.getRequestDispatcher("admin-panel/addAdviserForm.jsp").forward(request,response);
        if(request.getParameter("t").equals("all"))
        {
            request.setAttribute("adviserList", Adviser.getAdviserList());
            request.getRequestDispatcher("admin-panel/manage adviser.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
