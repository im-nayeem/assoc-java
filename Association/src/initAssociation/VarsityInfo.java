package initAssociation;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Nayeem
 */
public class VarsityInfo {

    private String varsityName;
    private String varsityWebLink;
    private String numberOfDept;
    List<String> depts = new ArrayList<>();
    private String lastBatch;

    private boolean isAlphabetOnly(String s) {
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z')) 
            {
                continue;
            }
            else if(s.charAt(i)==' ')
                continue;
            else
                return false;
                
        }
        return true;
    }

    private boolean isDigitOnly(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (('0' <= ch && ch <= '9') == false) {
                return false;
            }
        }
        return true;
    }

     boolean isURL(String url) {
        try {
            (new java.net.URL(url)).openStream().close();
            return true;
        } catch (IOException ex) {
            return false;
        }
        
    }

    public VarsityInfo(AssocInitView assocView) {
        this.varsityName = assocView.getVarsityName();
        //validity check  of varsity name
        if (this.isAlphabetOnly(this.varsityName) == false) {
            assocView.showDialogueMsg("Institution name can contain only alphabet and space");
            assocView.addVarsityInfo();
            assocView.repaint();
        }

        this.varsityWebLink = assocView.getVarsityWebLink();
        //validity check of university website link
        if(isURL(this.varsityWebLink)==false){
            assocView.showDialogueMsg("Invalid website link");
            assocView.addVarsityInfo();
            assocView.revalidate();
        }

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
        return Integer.parseInt(numberOfDept);
    }

    public List<String> getDepts() {
        return depts;
    }
//    List<String> to convert JSON format

    public String getDeptsAsJSONFormat() {
        String jsonFormat = "{\"department\":[";
        for (int i = 0; i < this.depts.size(); i++) {
            jsonFormat = jsonFormat + "\"" + this.depts.get(i) + "\"";
            if (i + 1 < this.depts.size()) {
                jsonFormat = jsonFormat + ",";
            }
        }
        jsonFormat = jsonFormat + "]}";
        return jsonFormat;
    }

    public int getLastBatch() {
        return Integer.parseInt(lastBatch);
    }

}
