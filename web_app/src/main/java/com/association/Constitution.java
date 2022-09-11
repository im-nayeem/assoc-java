/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association;

import com.association.database.DatabaseConnection;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mestu
 */
@WebServlet(name = "Constitution", urlPatterns = {"/Constitution"})
public class Constitution extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Constitution</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Constitution at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try{
                DatabaseConnection conn = new DatabaseConnection();
                PreparedStatement pstmnt = conn.getPreparedStatement("Select constitution from `assoc_info`;");
                ResultSet rs = pstmnt.executeQuery();
                Blob file = null;
                byte[] filedata = null;
                if(rs.next()){
                    file = rs.getBlob("constitution");
                    filedata = file.getBytes(1, (int)file.length());
                }
                response.setContentType("application/pdf");
                response.setHeader("Content-Disposition", "inline");
                response.setContentLength(filedata.length);
                OutputStream stream = response.getOutputStream();
                stream.write(filedata);
                stream.flush();
            }
            catch(Exception e){
                request.setAttribute("error",e);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
            
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
