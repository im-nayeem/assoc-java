package com.association;

import com.association.database.DatabaseConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

/**
 * Created on 07-Sep-22
 *
 * @author Nayeem
 */
@WebServlet(name = "Notice", value = "/Notice")
public class Notice extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
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
                notice.setNoticeId(rs.getString("notice_id"));
                noticeList.add(notice);
            }
            
            request.getSession().setAttribute("noticeList", noticeList);
            request.getRequestDispatcher("notice.jsp").forward(request,response);
        } catch (Exception e) {
            request.setAttribute("error",e);
            request.getRequestDispatcher("error.jsp").forward(request,response);
        }
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
