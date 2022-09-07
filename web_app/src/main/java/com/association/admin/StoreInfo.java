package com.association.admin;

import com.association.AssocInfo;
import com.association.VarsityInfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created on 07-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "StoreInfo", value = "/StoreInfo")
public class StoreInfo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            VarsityInfo varsityInfo = new VarsityInfo(request);
            AdminDAO admin = new AdminDAO();
            admin.storeVarsityInfo(varsityInfo);
        }catch (Exception e){

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(request.getParameter("infoType"));
        out.println(request.getParameter("assoc_name"));
        out.println(request.getParameter("name"));
//        try {
//            AdminDAO admin = new AdminDAO();
//            
//            if(request.getParameter("infoType").equals("varsityInfo")){
//                VarsityInfo varsityInfo = new VarsityInfo(request);
//                admin.storeVarsityInfo(varsityInfo);
//            }
//            else if(request.getParameter("infoType").equals("assocInfo")){
//                AssocInfo assocInfo = new AssocInfo();
//                admin.storeAssocInfo(assocInfo);
//            }
//        }
//        catch (Exception e){
////            request.setAttribute("error",e);
////            request.getRequestDispatcher("error.jsp").forward(request,response);
//        }
    }
}
