package com.association.adviser;

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
@WebServlet(name = "adviser-panel", value = "/adviser-panel")
public class AdviserPanel extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            if(request.getParameter("t").equals("all"))
            {
                request.setAttribute("adviserList", Adviser.getAdviserList());
                request.getRequestDispatcher("adviser-panel/advisers.jsp").forward(request,response);
            }
            if(request.getParameter("t").equals("login"))
                request.getRequestDispatcher("adviser-panel/adviserLogin.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //adviser log in process
    }
}
