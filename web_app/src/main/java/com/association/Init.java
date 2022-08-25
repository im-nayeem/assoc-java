package com.association;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 * Welcome Servlet that retrieve essential data from database to configure index.jsp
 */
@WebServlet(name = "initAll", value = "/init")
public class Init extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        try
        {

            AssocInfo assocInfo = new AssocInfo();
            VarsityInfo varsityInfo = new VarsityInfo();

            req.getSession().setAttribute("assocInfo",assocInfo);
            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
        catch (Exception e){
            req.setAttribute("error",e);
            req.getRequestDispatcher("WEB-INF/error.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
//        super.destroy();
    }
}