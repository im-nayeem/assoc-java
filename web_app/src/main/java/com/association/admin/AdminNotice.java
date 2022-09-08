/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

import com.association.AssocNotice;
import com.association.database.DatabaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mestu
 */
@WebServlet(name = "AdminNotice", urlPatterns = {"/AdminNotice"})
public class AdminNotice extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement("SELECT * FROM `notice` ORDER BY notice.post_date DESC;");
            ResultSet rs = pstmnt.executeQuery();
            Vector<AssocNotice>noticeList = new Vector<>();
            
            while(rs.next()){
                AssocNotice notice = new AssocNotice();
                notice.setHeadline(rs.getString("headline"));
                notice.setDetails(rs.getString("details"));
                notice.setPublicationDate(rs.getString("post_date"));
                notice.setFooter(rs.getString("footer"));
                noticeList.add(notice);
            }
            
            request.getSession().setAttribute("noticeList", noticeList);
            request.getRequestDispatcher("adminNotice.jsp").forward(request,response);
        } catch (Exception e) {
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


}
