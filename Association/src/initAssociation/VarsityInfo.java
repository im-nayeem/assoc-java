package initAssociation;

import java.util.List;
import java.util.ArrayList;
import validation.Validate;

/**
 *
 * @author Nayeem
 */
public final class VarsityInfo {

    private String varsityName;
    private String varsityWebLink;
    private String numberOfDept;
    List<String> depts = new ArrayList<>();
    private String lastBatch;
    public static String isValid="";


    public VarsityInfo(AssocInitView assocView) {
        this.varsityName = assocView.getVarsityName();
        this.varsityWebLink = assocView.getVarsityWebLink();
        this.numberOfDept = assocView.getNumberOfDept();
        this.depts = assocView.getDepts();
        this.lastBatch = assocView.getLastBatch();
        checkValidity();
    }
    
     void checkValidity(){
         
        //validity check  of varsity name
        if(Validate.isValidVarsityName(this.varsityName) == false)
            isValid+="*Institution name should only contain alphabet and space.\n";
        
        //validity check of university website link
        if(Validate.isUrl(this.varsityWebLink)==false)
            isValid+=("*Invalid website link.\n");
        if(Validate.isNumber(lastBatch)==false)
            isValid+="*Batch should be a number.";
        if(isValid.isEmpty())
            isValid="Yes";
            
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
