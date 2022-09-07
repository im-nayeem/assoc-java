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
        try {
            System.out.println("Hello World");
            System.out.println(request.getParameter("email"));
            AssocInfo assocInfo = new AssocInfo(request);
            AdminDAO admin = new AdminDAO();
            admin.storeAssocInfo(assocInfo);
        }
        catch (Exception e){

        }
    }
}
