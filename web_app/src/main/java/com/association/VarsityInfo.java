package com.association;

import com.association.database.DatabaseConnection;

import javax.servlet.http.HttpServletRequest;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class VarsityInfo {
//    SELECT json_extract(dept, '$.department') AS POPL_MALE FROM varsity_info;

    private String varsityName;
    private String varsityWebLink;
    private Vector<String> deptList;
    private String deptListAsString;
    private int lastBatch;
    public VarsityInfo() {
        try
        {
            DatabaseConnection conn = new DatabaseConnection();
            Statement stmt = conn.getStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM varsity_info");
            rs.next();
            this.varsityName = rs.getString("varsity_name");
            this.varsityWebLink = rs.getString("website_link");
            this.setDeptList(rs.getString("dept"));
            this.lastBatch = rs.getInt("last_batch");
        }
        catch (Exception e)
        {
            throw new RuntimeException(e.toString() + "\nProblem with varsity information executing query.");
        }

    }
    public VarsityInfo(HttpServletRequest request){
        try {
            this.varsityName = request.getParameter("varsity_name");
            this.varsityWebLink = request.getParameter("varsity_web_link");
            int numberOfDepts = Integer.parseInt(request.getParameter("number_of_dept"));
            this.deptListAsString = "";
            for(int i=1; i<=numberOfDepts; i++){
                String dept = request.getParameter("department"+i);
                this.deptListAsString += dept;
                if(i+1<=numberOfDepts)this.deptListAsString+=",";
            }
            this.lastBatch = Integer.parseInt(request.getParameter("last_batch_number"));
        } catch (Exception e) {
            throw new RuntimeException(e.toString() + "\nProblem with varsity information storing query.");
        }
        
    }
    
    
    private void setDeptList(String s) {
        deptList = new Vector<>();
        String tmp[] = s.split(",");
        for(String dept:tmp){
            deptList.add(dept);
        }
    }

    public String getVarsityName() {
        return varsityName;
    }

    public String getVarsityWebLink() {
        return varsityWebLink;
    }

    public Vector<String> getDeptList() {
        return deptList;
    }

    public String getDeptListAsString() {
        return deptListAsString;
    }
    
    public int getLastBatch() {
        return lastBatch;
    }
    
}
