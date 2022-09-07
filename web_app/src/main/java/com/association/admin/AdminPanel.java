package com.association.admin;

import com.association.database.DatabaseConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created on 08-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "AdminPanel", value = "/admin-panel")
public class AdminPanel extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            DatabaseConnection conn = new DatabaseConnection();
            Statement st = conn.getStatement();
            ResultSet rs = st.executeQuery("Select * from members");
        } catch (SQLException e) {
            request.getRequestDispatcher("initAssoc.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
