
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

    public VarsityInfo(AssocInitView assocView) {
        this.varsityName = assocView.getVarsityName();
        this.varsityWebLink = assocView.getVarsityWebLink();
        this.numberOfDept = assocView.getNumberOfDept();
        this.depts = assocView.getDepts();
        this.lastBatch = assocView.getLastBatch();
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
