/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "FilterMemberList", urlPatterns = {"/FilterMemberList"})
public class FilterMemberList extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FilterMemberList</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FilterMemberList at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Vector<String> key = new Vector<>();
        Vector<String> value = new Vector<>();
        
        String attributeName[] = {"dept","session","present_area","permanent_upazila"};
        for(int i=0; i<4; i++){
            String attributeValue = request.getParameter(attributeName[i]);
            if(attributeValue != null){
                key.add(attributeName[i]);
                value.add("'"+attributeValue+"'");
            }
        }
        
        try{
            MembersDAO memberModel = new MembersDAO();
            Vector<AssocMember>assocMemberList = memberModel.getAssocMemberList(key,value);

            request.getSession().setAttribute("assocMemberList", assocMemberList);
            request.getRequestDispatcher("members.jsp").forward(request,response);
        }
        catch(Exception e){
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

}
