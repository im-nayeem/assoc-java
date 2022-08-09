/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initAssociation;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Nayeem
 */
public class VarsityInfo {
    private String varsityName;
    private String varsityWebLink;
    private int numberOfDept;
    List<String>depts=new ArrayList<>();
   private int lastBatch;

    public VarsityInfo(String varsityName, String varsityWebLink, int numberOfDept, int lastBatch) {
        this.varsityName = varsityName;
        this.varsityWebLink = varsityWebLink;
        this.numberOfDept = numberOfDept;
        this.lastBatch = lastBatch;
    }

    public String getVarsityName() {
        return varsityName;
    }

    public String getVarsityWebLink() {
        return varsityWebLink;
    }

    public int getNumberOfDept() {
        return numberOfDept;
    }

    public List<String> getDepts() {
        return depts;
    }

    public int getLastBatch() {
        return lastBatch;
    }
    
    
}
