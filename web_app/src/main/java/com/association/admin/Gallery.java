/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association.admin;

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
@WebServlet(name = "Gallery", urlPatterns = {"/Gallery"})
public class Gallery extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement("SELECT * FROM gallery;");
            ResultSet rs = pstmnt.executeQuery();
            Vector<String>description = new Vector<>();
            Vector<Integer>id = new Vector<>();
            
            while(rs.next()){
                description.add(rs.getString("short_desc"));
                id.add(rs.getInt("id"));
            }
            
            request.setAttribute("id", id);
            request.setAttribute("description", description);
            request.getRequestDispatcher("admin-panel/gallery.jsp").forward(request, response);
            
        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    // </editor-fold>

}
