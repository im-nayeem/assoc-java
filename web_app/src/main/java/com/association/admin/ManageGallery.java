package com.association.admin;

import com.association.GalleryObj;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * Created on 10-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "ManageGallery", value = "/manage-gallery")
public class ManageGallery extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("t").equals("all")){
            List<GalleryObj> galleryList = GalleryObj.getGalleryList();
            request.setAttribute("galleryList", galleryList);
            request.getRequestDispatcher("admin-panel/manageGallery.jsp").forward(request, response);
        }
        if(request.getParameter("t").equals("add")){
            request.getRequestDispatcher("admin-panel/galleryForm.jsp").forward(request, response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
