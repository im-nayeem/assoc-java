/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;

import association.Association;
import database.DatabaseConnection;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.prefs.Preferences;
import javax.swing.ImageIcon;

/**
 * AssocMember the model class containing single member's info
 * @author Nayeem
 */
public class AssocMember {
    private String name;
    private String id;
    private String email;
    private String phone;
    private String dept;
    private String session;
    private String batch;
    private String gender;
    private String bg;
    private byte[] photoByte;
    private ImageIcon photo;
    private String co_activity;
    private String fathersname;
    private String mothersname;
    private String present_area;
    private String present_details;
    private String permanent_upazila;
    private String permanent_details;
    private String tranc_no;
    // all info variables are here...complete this
    
    
    public AssocMember(){}
    
    /**
     * Constructor
     * @param singleResult containing single member info
     */
    public AssocMember(final ResultSet singleResult) throws SQLException
    {
        
        //use it for RegisteredListModel
        this.setName(singleResult.getString("name"));
        this.setId(singleResult.getString("id"));
        this.setEmail(singleResult.getString("email"));
        this.setPhone(singleResult.getString("phone"));
        this.setDept(singleResult.getString("dept"));
        this.setSession(singleResult.getString("session"));
        this.setBatch(singleResult.getString("batch"));
        this.setGender(singleResult.getString("gender"));
        this.setBg(singleResult.getString("bg"));
        this.setPhotoByte(singleResult.getBytes("photo"));
        this.setCo_activity(singleResult.getString("co_activity"));
        this.setFathersname(singleResult.getString("fathersname"));
        this.setMothersname(singleResult.getString("mothersname"));
        this.setPresent_area(singleResult.getString("present_area"));
        this.setPresent_details(singleResult.getString("present_details"));
        this.setPermanent_upazila(singleResult.getString("permanent_upazila"));
        this.setPermanent_details(singleResult.getString("permanent_details"));
        this.setTranc_no(singleResult.getString("tranc_no"));
        
        
        // if you find better replacemet for ResultSet then replace it,try to find better idea
    }
    
    
    
    
    /**
     * Constructor retrieve all info of member from db and store in class member variables
     * @param id the id of the member to retrieve info from DB
     */
    public AssocMember(String id){
        //for further use,dont't touch this contructor
        //retrieve info from db and store here
    }
    
    
    
    
    /*=============getter methods=============*/
    public ImageIcon getPhoto(byte[] image) {
        Image img = new ImageIcon(image).getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }
    
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDept() {
        return dept;
    }

    public String getSession() {
        return session;
    }

    public String getBatch() {
        return batch;
    }

    public String getGender() {
        return gender;
    }

    public String getBg() {
        return bg;
    }

    public byte[] getPhotoByte() {
        return photoByte;
    }

    public String getCo_activity() {
        return co_activity;
    }

    public String getFathersname() {
        return fathersname;
    }

    public String getMothersname() {
        return mothersname;
    }

    public String getPresent_area() {
        return present_area;
    }

    public String getPresent_details() {
        return present_details;
    }

    public String getPermanent_upazila() {
        return permanent_upazila;
    }

    public String getPermanent_details() {
        return permanent_details;
    }
    
    /*-------------------------------------*/
    
    /*===========setter methods============*/
    
    public String getTranc_no() {
        return tranc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }
    public void setPhotoByte(byte[] photoByte) {
        this.photoByte = photoByte;
    }

    public void setCo_activity(String co_activity) {
        this.co_activity = co_activity;
    }

    public void setFathersname(String fathersname) {
        this.fathersname = fathersname;
    }

    public void setMothersname(String mothersname) {
        this.mothersname = mothersname;
    }

    public void setPresent_area(String present_area) {
        this.present_area = present_area;
    }

    public void setPresent_details(String present_details) {
        this.present_details = present_details;
    }

    public void setPermanent_upazila(String permanent_upazila) {
        this.permanent_upazila = permanent_upazila;
    }

    public void setPermanent_details(String permanent_details) {
        this.permanent_details = permanent_details;
    }

    public void setTranc_no(String tranc_no) {
        this.tranc_no = tranc_no;
    }
    /*-------------------------------------------------------*/
    
    //===============database connection========================//
   
    public String storeAlumniInfo(String id, String email){ //assocmember
        String query = "INSERT INTO alumni(id,email) VALUES(?,?);";
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            pstmnt.setString(1, id);
            pstmnt.setString(2,email);
            pstmnt.execute();
        } catch (Exception e) {
            return e.getMessage();
        }
        
        return "done";
    }
    
    public String markAsVerified(String id, String email, boolean alumni, boolean ex_member){ //assocmember
        String query = "INSERT INTO verified VALUES(?,?,?,?,?);";
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            pstmnt.setString(1,id);
            pstmnt.setString(2,email);
            pstmnt.setBoolean(3,alumni);
            pstmnt.setBoolean(4,ex_member);
            pstmnt.setBoolean(5,ex_member);
            pstmnt.execute();
        } catch (SQLException e) {
            return "something wrong!!";
        }
        return "Thanks for approve.";
    }
    
//============rejected member delete from member table==============//
    public String deleteMemberRow(String email){
        String query = "DELETE FROM members WHERE email='"+email+"';";
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            pstmnt.execute();
        } catch (Exception e) {
            return e.toString();
        }
        return "done";
    }


    //--------------------------------------------------------------------------------//
}