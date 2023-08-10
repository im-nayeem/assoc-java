package com.association.admin;

import com.association.AssocInfo;
import com.association.Utility;
import com.association.VarsityInfo;
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

            AssocInfo assocInfo = new AssocInfo();
            VarsityInfo varsityInfo = new VarsityInfo();
            DatabaseConnection conn = new DatabaseConnection();
            ResultSet rs = conn.executeQuery("select count(*) from verified");
            if(rs.next())
                request.getSession().setAttribute("totalVerified",rs.getString("count(*)"));
            rs = conn.executeQuery("select count(*) from members");
            if(rs.next())
                request.getSession().setAttribute("totalMembers",rs.getString("count(*)"));
            conn.close();
            request.getRequestDispatcher("admin dashboard.jsp").forward(request,response);
        }
        catch (Exception e) {
                try{
                    response.sendRedirect("StoreInfo?t=association");
                }
                catch (Exception ex){
                    request.setAttribute("error","Error in initializing");
                    request.getRequestDispatcher("error.jsp").forward(request,response);
                }

            }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
