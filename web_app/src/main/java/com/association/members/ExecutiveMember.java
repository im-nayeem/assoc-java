/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.association.members;

/**
 *
 * @author Mestu
 */
public class ExecutiveMember extends AssocMember{
    private int committeeId;
    private String postName;
    private String startDate;
    private String endDate;

    public ExecutiveMember() {
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
