package com.association;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(name="add",value = "/add")
public class Add extends HttpServlet {

    private List<Student> studentsList=new StudentList().getStudentList();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
       String name=req.getParameter("name");
       int id= Integer.parseInt(req.getParameter("id"));
       String dept=req.getParameter("dept");
       studentsList.add(new Student(name,id,dept));

//        req.setAttribute("studs",new StudentList().getStudentList());

        resp.sendRedirect("./");
//        req.getRequestDispatcher("/WEB-INF/view.jsp").forward(req,resp);

    }
}
