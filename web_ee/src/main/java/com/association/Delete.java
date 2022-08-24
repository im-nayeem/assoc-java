package com.association;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "delete",value = "/delete")
public class Delete extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        Student obj=new Student(req.getParameter("name"),Integer.parseInt(req.getParameter("id")),req.getParameter("dept"));
        new StudentList().getStudentList().remove(obj);
        resp.sendRedirect("hello");

    }
}
