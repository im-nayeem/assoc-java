/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.association.members;

import com.association.SecurePassword;
import com.association.UserAccount;
import com.association.database.DatabaseConnection;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.Base64;
import javax.servlet.http.HttpServletRequest;

import org.jetbrains.annotations.NotNull;

/**
 * AssocMember the  class containing single member's info
 * @author Nayeem
 */
public class AssocMember {
    private String name;
    private String id;
    private String email;

    private UserAccount userAccount;
    private String phone;
    private String dept;
    private String session;
    private String batch;
    private String gender;
    private String blood_group;
    private InputStream photo;
    private String coActivity;
    private String fathersName;
    private String mothersName;
    private String presentArea;
    private String presentDetails;
    private String permanentUpazila;
    private String permanentDetails;
    private String trancNo;

    /**
     * Constructor
     * @param memberEmail member's email address used to retrieve data from DB
     */
    public AssocMember(String memberEmail){
        try {
            DatabaseConnection conn = new DatabaseConnection();
            ResultSet rs =  conn.executeQuery("SELECT * FROM members WHERE email = '"+memberEmail+"'");
            rs.next();

            this.name =  rs.getString("name");
            this.id =  rs.getString("id");
            this.email =  rs.getString("email");
            this.userAccount = new UserAccount(this.email,"member");
            this.phone =  rs.getString("phone");
            this.dept =  rs.getString("dept");
            this.session =  rs.getString("session");
            this.batch =  rs.getString("batch");
            this.gender =  rs.getString("gender");
            this.blood_group =  rs.getString("bg");
            this.photo =  rs.getBinaryStream("photo");
            this.coActivity =  rs.getString("co_activity");
            this.fathersName =  rs.getString("fathersname");
            this.mothersName =  rs.getString("mothersname");
            this.presentArea =  rs.getString("present_area");
            this.presentDetails =  rs.getString("present_details");
            this.permanentUpazila =  rs.getString("permanent_upazila");
            this.permanentDetails =  rs.getString("permanent_details");
            this.trancNo =  rs.getString("tranc_no");

            conn.close();
        }
        catch (Exception e) {
            throw new RuntimeException(e.toString()+"\nProblem with association information executing query.");
        }
    }

    /**
     * Constructor
     * @param request the HttpServletRequest object
     */
    public AssocMember(HttpServletRequest request)
    {
        try{
            this.name = request.getParameter("name");
            this.id = request.getParameter("id");
            this.email = request.getParameter("email");
            this.userAccount = new UserAccount(this.email,request.getParameter("password"),"member");
            this.phone = request.getParameter("phone");
            this.dept = request.getParameter("department");
            this.session = request.getParameter("session");
            this.batch = request.getParameter("batch");
            this.gender = request.getParameter("gender");
            this.blood_group = request.getParameter("blood_group");
            this.photo = request.getPart("photo").getInputStream();
            this.coActivity = request.getParameter("co_actvt");
            this.fathersName = request.getParameter("fathers_name");
            this.mothersName = request.getParameter("mothers_name");
            this.presentArea = request.getParameter("present_area");
            this.presentDetails = request.getParameter("present_details");
            this.permanentUpazila = request.getParameter("upazila");
            this.permanentDetails = request.getParameter("permanent_details");
            this.trancNo = request.getParameter("transc_no");

        }
        catch(Exception e)
        {
            throw  new RuntimeException(e);
        }
    }

    AssocMember() {
        
    }

    /**
     * Convert InputStream to String
     * @param inpStream InputStream
     * @return String
     * @throws IOException
     */
    public  String inputStreamToString(@NotNull InputStream inpStream)
    {

        try{

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            byte[] buffer = new byte[8192];
            int length;
            while ((length = inpStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, length);
            }
            outputStream.flush();

            photo = new ByteArrayInputStream(outputStream.toByteArray());

            String base64Image = Base64.getEncoder().encodeToString(outputStream.toByteArray());
            return base64Image;



        }
        catch(Exception e)
        {
            throw  new RuntimeException(e.getMessage());
        }



    }


    /**====================getter methods=========================*/
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

    public InputStream getPhoto(){
        return photo;
    }
    public String getPhotoString() {
        return inputStreamToString(photo);

    }
    public void another(){}
    
    public String getCoActivity() {
        return coActivity;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public String getPresentArea() {
        return presentArea;
    }

    public String getPresentDetails() {
        return presentDetails;
    }

    public String getPermanentUpazila() {
        return permanentUpazila;
    }
    public String getPermanentDetails() {
        return permanentDetails;
    }
    public String getTrancNo() {
        return trancNo;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }
/**-----------------------------------------------------------------*/


    /**=============================setter methods====================*/

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
        this.blood_group = bg;
    }

    public void setCoActivity(String co_activity) {
        this.coActivity = co_activity;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public void setPresentArea(String present_area) {
        this.presentArea = present_area;
    }

    public void setPresentDetails(String presentDetails) {
        this.presentDetails = presentDetails;
    }

    public void setPermanentUpazila(String permanent_upazila) {
        this.permanentUpazila = permanent_upazila;
    }

    public void setPermanentDetails(String permanent_details) {
        this.permanentDetails = permanent_details;
    }

    public void setTrancNo(String trancNo) {
        this.trancNo = trancNo;
    }

    public void setPhoto(InputStream photo) {
        this.photo = photo;
    }

    /**-------------------------------------------------------*/

}