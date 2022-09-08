package com.association.admin;

import com.association.AssocInfo;
import com.association.VarsityInfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * Created on 07-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "StoreInfo", value = "/StoreInfo")
@MultipartConfig
public class StoreInfo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            if(request.getParameter("t").equals("institution"))
                request.getRequestDispatcher("varsityInfoForm.jsp").forward(request,response);
            if(request.getParameter("t").equals("association"))
                request.getRequestDispatcher("assocInfoForm.jsp").forward(request,response);
        }catch (Exception e){

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            storeInfoDAO admin = new storeInfoDAO();

            if(request.getParameter("infoType").equals("assocInfo")){
                AssocInfo assocInfo = new AssocInfo(request);
                admin.storeAssocInfo(assocInfo);
                response.sendRedirect("StoreInfo?t=institution");
            }
            //infoType is set in 17th line of two jsp files
            else if(request.getParameter("infoType").equals("varsityInfo")){
                VarsityInfo varsityInfo = new VarsityInfo(request);
                admin.storeVarsityInfo(varsityInfo);
                response.sendRedirect("./");
            }
        }
        catch (Exception e){
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").include(request,response);
        }
    }
}
