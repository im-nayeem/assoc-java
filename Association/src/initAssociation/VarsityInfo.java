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
    private String numberOfDept;
    List<String> depts = new ArrayList<>();
    private String lastBatch;

    private boolean isAlphabetOnly(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) == false) {
                return false;
            }
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

    public boolean isURL(String url) {
        try {
            (new java.net.URL(url)).openStream().close();
            return true;
        } catch (Exception ex) {
        }
        return false;
    }

    public VarsityInfo(AssocInitView assocView) {
        this.varsityName = assocView.getVarsityName();
        //validity check  of varsity name
        if (this.isAlphabetOnly(this.varsityName) == false) {
            assocView.showDialogueMsg("Varsity Name must contain only alphabet");
            assocView.addVarsityInfo();
            assocView.repaint();
        }

        this.varsityWebLink = assocView.getVarsityWebLink();
        //validity check of university website link
        if(isURL(this.varsityWebLink)==false){
            assocView.showDialogueMsg("Invalid website link");
            assocView.addVarsityInfo();
            assocView.repaint();
        }

        this.numberOfDept = assocView.getNumberOfDept();
        //validity check  of numberOfDepartments
        if (this.isDigitOnly(this.numberOfDept) == false) {
            assocView.showDialogueMsg("Number of Department must a number");
            assocView.addVarsityInfo();
            assocView.repaint();
        }

        this.depts = assocView.getDepts();
        //check validity of all departments name
        for (int i = 0; i < this.depts.size(); i++) {
            if (this.isAlphabetOnly(this.depts.get(i)) == false) {
                assocView.showDialogueMsg(i + "th Department name is invalid\n Department must contain only alpabet");
            }
        }

        this.lastBatch = assocView.getLastBatch();
        //check validity of lastBatch
        if (this.isDigitOnly(this.lastBatch) == false) {
            assocView.showDialogueMsg("Number of Department must a number");
            assocView.addVarsityInfo();
            assocView.repaint();
        }
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
