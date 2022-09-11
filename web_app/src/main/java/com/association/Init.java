package com.association;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/***
 * Welcome Servlet that retrieve essential data from database to configure index.jsp
 */
@WebServlet(name = "initAll", value = "/init")
public class Init extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        try
        {
            List<GalleryObj> gallery = GalleryObj.getHighlights();

            if(!gallery.isEmpty())
                getServletContext().setAttribute("gallery",gallery.get(0));

            AssocInfo assocInfo = new AssocInfo();
            VarsityInfo varsityInfo = new VarsityInfo();

            getServletContext().setAttribute("assocInfo",assocInfo);
            getServletContext().setAttribute("varsityInfo", varsityInfo);

            req.getSession().setAttribute("title", "Home");

            req.getRequestDispatcher("index.jsp").forward(req,resp);
        }
        catch (Exception e){
            req.setAttribute("error",e);
            req.getRequestDispatcher("error.jsp").forward(req,resp);
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