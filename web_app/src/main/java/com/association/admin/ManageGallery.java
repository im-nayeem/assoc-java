package com.association.admin;

import com.association.GalleryObj;
import com.association.database.DatabaseConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created on 10-Sep-22
 *
 * @author Nayeem
 */
@MultipartConfig
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
            request.getRequestDispatcher("admin-panel/addGalleryForm.jsp").forward(request, response);

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{

            DatabaseConnection conn = new DatabaseConnection();
            ResultSet rs = conn.executeQuery("SELECT AUTO_INCREMENT\n" +
                    "FROM information_schema.TABLES\n" +
                    "WHERE TABLE_SCHEMA = 'association'\n" +
                    "AND TABLE_NAME = 'media'");

            int id = 0;
            if(rs.next())
                id=Integer.parseInt(rs.getString("AUTO_INCREMENT"));

            PreparedStatement pstmt = conn.getPreparedStatement("insert into media(photo1,caption1,photo2,caption2,photo3,caption3,video_link,media_id) values(?,?,?,?,?,?,?,?)");
            pstmt.setBlob(1,request.getPart("photo1").getInputStream());
            pstmt.setString(2,request.getParameter("caption1"));
            pstmt.setBlob(3,request.getPart("photo2").getInputStream());
            pstmt.setString(4,request.getParameter("caption2"));
            pstmt.setBlob(5,request.getPart("photo3").getInputStream());
            pstmt.setString(6,request.getParameter("caption3"));
            pstmt.setString(7,request.getParameter("video_link"));
            pstmt.setInt(8,id);
            pstmt.execute();




            pstmt  = conn.getPreparedStatement("insert into gallery (id,short_desc) values(?,?)");
            pstmt.setInt(1,id);
            pstmt.setString(2,request.getParameter("desc"));
            pstmt.execute();

            conn.close();

            response.sendRedirect("manage-gallery?t=all");
        }
        catch (Exception e){
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
    }
}
