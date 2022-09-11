/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.association.members;

import com.association.database.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Mestu
 */
public class AssocExecutiveMember extends AssocMember{
    private int committeeId;
    private String postName;
    private String startDate;
    private String endDate;

    public AssocExecutiveMember() {
    }
    
    //----------------------------get latest committee number-------------------------------------//
    public int getLastCommitteeNumer(){
        try {
                DatabaseConnection conn = new DatabaseConnection();
                PreparedStatement pstmnt = conn.getPreparedStatement("SELECT MAX(committee_id) as lastId FROM exec_committee");
                ResultSet rs = pstmnt.executeQuery();

                int lastCommitteeId = 1;
                if (rs.next()) {
                    lastCommitteeId = rs.getInt("lastId");
                    lastCommitteeId++;
                }
                return lastCommitteeId;

            } catch (Exception e) {
                throw new RuntimeException(e.toString()+"\nProblem with finding committee number.");
            }
    }
    
//    <editor-fold desc="all getter method">
    public int getCommitteeId() {
        return committeeId;
    }

    public String getPostName() {
        return postName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    
//    </editor-fold>   
    
//    <editor-fold desc="all setter method">
    
    public void setCommitteeId(int committeeId) {
        this.committeeId = committeeId;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
//    </editor-fold>        

    

    
}
