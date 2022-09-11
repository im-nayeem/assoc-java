/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.association;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mestu
 */
@WebServlet(name = "gallery", urlPatterns = {"/gallery"})
public class Gallery extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       if(request.getParameter("t").equals("all"))
       {
           try {
               List<GalleryObj>galleryList = GalleryObj.getGalleryList();
               request.setAttribute("galleryList", galleryList);
               request.getRequestDispatcher("galleryListView.jsp").forward(request, response);

           } catch (Exception e) {
               throw new RuntimeException(e);
           }
       }
       if(request.getParameter("t").equals("details")){

           GalleryObj glry = new GalleryObj(Integer.parseInt(request.getParameter("id")));
           System.out.println(glry.getShortDesc());
           request.setAttribute("gallery",glry);
           request.getRequestDispatcher("galleryDetailsView.jsp").forward(request,response);
       }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    // </editor-fold>

}
