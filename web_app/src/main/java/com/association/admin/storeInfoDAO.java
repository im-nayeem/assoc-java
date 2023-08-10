package com.association.admin;

import com.association.AssocInfo;
import com.association.VarsityInfo;
import com.association.database.DatabaseConnection;

import java.sql.PreparedStatement;

/**
 * Created on 07-Sep-22
 *
 * @author Nayeem
 */
public class storeInfoDAO {

    private DatabaseConnection conn;

    public storeInfoDAO() {
        conn = new DatabaseConnection();
    }

    public void storeAssocInfo(AssocInfo assocInfo) {
        final String assocInfoQuery = "INSERT INTO assoc_info "
                + "(assoc_name,assoc_abbr,assoc_logo,about,constitution,email,pass,pay_details,prsdnt_phone,gs_phone)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement pstmnt = conn.getPreparedStatement(assocInfoQuery);

            //set value to the query,extract values from assocInfo
            pstmnt.setString(1, assocInfo.getAssocName());
            pstmnt.setString(2,assocInfo.getAssocAbbr());
            pstmnt.setBinaryStream(3, assocInfo.getAssocLogoStream());
            pstmnt.setString(4, assocInfo.getAssocAbout());
            pstmnt.setBinaryStream(5, assocInfo.getAssocConstitution()  );
            pstmnt.setString(6, assocInfo.getAssocMail());
            pstmnt.setString(7, assocInfo.getPass());
            pstmnt.setString(8, assocInfo.getPaymentMethod());
            pstmnt.setString(9, assocInfo.getPresidentNumber());
            pstmnt.setString(10, assocInfo.getGenSecNumber());

            pstmnt.execute();

            conn.close();

        } catch (Exception e) {
            throw new RuntimeException(e.toString() + "\nProblem with association information storing query");
        }

    }
    public void ClearExistingInfo(){
        try{
            DatabaseConnection connection = new DatabaseConnection();
            connection.executeQuery("DELETE FROM assoc_info");
            connection.executeQuery("DELETE FROM varsity_info");
        }catch (Exception e){
            throw  new RuntimeException(e);

        }
    }
    public void storeVarsityInfo(VarsityInfo varsityInfo) {
        final String varsityInfoQuery = "INSERT INTO varsity_info "
                + "(varsity_name,website_link,dept,last_batch) VALUES(?,?,?,?);";
        try {
            DatabaseConnection conn = new DatabaseConnection();

            PreparedStatement pstmnt = conn.getPreparedStatement(varsityInfoQuery);
            //set value to the query,extract values from varsityInfo
            pstmnt.setString(1, varsityInfo.getVarsityName());
            pstmnt.setString(2, varsityInfo.getVarsityWebLink());
            pstmnt.setString(3, varsityInfo.getDeptListAsString());
            pstmnt.setInt(4, varsityInfo.getLastBatch());

            pstmnt.execute();
            conn.close();

        } catch (Exception e) {
            throw new RuntimeException(e.toString() + "\nProblem with varsity information storing query");
        }
    }
    
    public void storeVerifiedInfo(String email, String id){
        final String qeury = "INSERT INTO verified VALUES('"+email+"',"+id+");";
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement(qeury);
            pstmnt.execute();
        } catch (Exception e) {
            throw new RuntimeException(e.toString() + "\nProblem while verifying members information");
        }
    }
    
//    when rejected by admin
    public void removeMember(String email){
        final String qeury = "DELET FROM members WHERE email="+email+";";
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement(qeury);
            pstmnt.execute();
        } catch (Exception e) {
            throw new RuntimeException(e.toString() + "\nProblem while removing rejected member");
        }
    }
}
