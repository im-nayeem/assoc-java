package com.association;

import com.association.database.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class VarsityInfo {
//    SELECT json_extract(dept, '$.department') AS POPL_MALE FROM varsity_info;

    private String varsityName;
    private String varsityWebLink;
    private Vector<String> deptList;
    private int lastBatch;
    public VarsityInfo() {
        try {
            DatabaseConnection conn = new DatabaseConnection();
            Statement stmt = conn.getStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM varsity_info");
            rs.next();
            this.varsityName = rs.getString("varsity_name");
            this.varsityWebLink = rs.getString("website_link");
            this.setDeptList(rs.getString("dept"));
            this.lastBatch = rs.getInt("last_batch");
        } catch (Exception e) {
            throw new RuntimeException(e.toString() + "\nProblem with varsity information executing query.");
        }

    }
    
//    JSON file to String list 
    private void setDeptList(String s) {
        deptList = new Vector<>();
        int i = 0;
        while (s.charAt(i) != ':') {
            i++;
        }
        boolean start = false;
        String tmp = "";
        while (i < s.length()) {
            if (('a' <= s.charAt(i) && s.charAt(i) <= 'z') || ('A' <= s.charAt(i) && s.charAt(i) <= 'Z')) {
                tmp += s.charAt(i);
            } else if (s.charAt(i) == '"') {
                if (start) {
                    this.deptList.add(tmp);
                    start = false;
                    tmp = "";
                } else {
                    start = true;
                    tmp = "";
                }
            }
            i++;
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

    public int getLastBatch() {
        return lastBatch;
    }
    
}
