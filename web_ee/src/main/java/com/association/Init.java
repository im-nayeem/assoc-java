package com.association;

import com.association.database.DatabaseConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

/***
 * Welcome Servlet that retrieve essential data from database to configure index.jsp
 */
@WebServlet(name = "initAll", value = "/init")
public class Init extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        DatabaseConnection conn = new DatabaseConnection();
        Statement stmt= conn.getStatement();
//        ResultSet rs =  stmt.execute();
        req.getRequestDispatcher("index.jsp").forward(req,resp);
        req.setAttribute("studs",new StudentList().getStudentList());
        req.getRequestDispatcher("WEB-INF/view.jsp").forward(req,resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("studs",new StudentList());
//        req.getRequestDispatcher("WEB-INF/view.jsp").forward(req,resp);

    }

    @Override
    public void destroy() {
//        super.destroy();
    }
}