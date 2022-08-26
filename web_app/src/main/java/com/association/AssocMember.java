/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.association;

import com.association.database.DatabaseConnection;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Base64;
import javax.swing.ImageIcon;
import org.jetbrains.annotations.NotNull;

/**
 * AssocMember the model class containing single member's info
 * @author Nayeem
 */
public class AssocMember {
    private String name;
    private String id;
    private String email;
    private String password;
    private String phone;
    private String dept;
    private String session;
    private String batch;
    private String gender;
    private String blood_group;
    private String photo;
    private String co_activity;
    private String fathersname;
    private String mothersname;
    private String present_area;
    private String present_details;
    private String permanent_upazila;
    private String permanent_details;
    private String tranc_no;
    // all info variables are here...complete this
    
    
    public AssocMember(String memberEmail){
        try {
            DatabaseConnection conn = new DatabaseConnection();
            Statement stmt= conn.getStatement();
            ResultSet rs =  stmt.executeQuery("SELECT * FROM members WHERE email = '"+memberEmail+"'");
            rs.next();

            this.name =  rs.getString("name");
            this.id =  rs.getString("id");
            this.email =  rs.getString("email");
            this.password =  rs.getString("pass");
            this.phone =  rs.getString("phone");
            this.dept =  rs.getString("dept");
            this.session =  rs.getString("session");
            this.batch =  rs.getString("batch");
            this.gender =  rs.getString("gender");
            this.blood_group =  rs.getString("bg");
            this.photo =  this.inputStreamToString(rs.getBinaryStream("photo"));
            this.co_activity =  rs.getString("co_activity");
            this.fathersname =  rs.getString("fathersname");
            this.mothersname =  rs.getString("mothersname");
            this.present_area =  rs.getString("present_area");
            this.present_details =  rs.getString("present_details");
            this.permanent_upazila =  rs.getString("permanent_upazila");
            this.permanent_details =  rs.getString("permanent_details");
            this.tranc_no =  rs.getString("tranc_no");
        }
        catch (Exception e) {
            throw new RuntimeException(e.toString()+"\nProblem with association information executing query.");
        }
    }
    /*=============getter methods=============*/
    
    public String inputStreamToString(@NotNull InputStream  is_image) throws IOException{

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte buffer[] = new byte[4096];
        int bytesRead = -1;
        while((bytesRead = is_image.read(buffer))!=-1){
            outputStream.write(buffer,0,bytesRead);
        }
        String base64Image = Base64.getEncoder().encodeToString(outputStream.toByteArray());
        return base64Image;
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

    public String getBloodGroup() {
        return blood_group;
    }

    public String getPhoto() {
        return photo;
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

    public void setBloodGroup(String bg) {
        this.blood_group = blood_group;
    }

    public void setPhotoByte(byte[] photoByte) {
        this.photo = photo;
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

}