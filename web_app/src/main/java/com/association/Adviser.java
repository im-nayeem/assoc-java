package com.association;

import com.association.database.DatabaseConnection;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * Created on 09-Sep-22
 *
 * @author Nayeem
 */
public class Adviser {
    private String name;
    private String email;
    private InputStream photo;
    private String occupation;
    private String presentAddr;
    private String permanentAddr;
    private String fromTime;
    private String toTime;

    private UserAccount userAccount;

    public Adviser(String name, String email, String fromTime, String toTime) {
        this.name = name;
        this.email = email;
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

   public Adviser(){

   }
    /**
     * Constructor
     * @param email adviser email
     */
    public Adviser(final String email) {
        try{

            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmt = conn.getPreparedStatement("select * from adviser where email = ?");
            pstmt.setString(1,email);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            this.name = rs.getString("name");
            this.email =rs.getString("email");
            this.occupation = rs.getString("occupation");
            this.photo = rs.getBinaryStream("photo");
            this.presentAddr = rs.getString("present_addr");
            this.permanentAddr = rs.getString("permanent_addr");
            this.fromTime = rs.getString("from_time");
            this.toTime = rs.getString("to_time");

        }
        catch (Exception e){
            throw  new RuntimeException(e);
        }
    }
    public Adviser(final ResultSet rs){
        try{
            this.name = rs.getString("name");
            this.email =rs.getString("email");
            this.occupation = rs.getString("occupation");
            this.photo = rs.getBinaryStream("photo");
            this.presentAddr = rs.getString("present_addr");
            this.permanentAddr = rs.getString("permanent_addr");
            this.fromTime = rs.getString("from_time");
            this.toTime = rs.getString("to_time");
        }
        catch (Exception e)
        {
            throw  new RuntimeException(e);
        }
    }


    /**====================Methods=====================*/
    public  static List<Adviser> getAdviserList(){
        List<Adviser> adviserList = new ArrayList<>();

       try{
           DatabaseConnection conn = new DatabaseConnection();
           ResultSet rs = conn.executeQuery("select * from adviser");
           while(rs.next())
           {
               adviserList.add(new Adviser(rs));

           }
       }
       catch (Exception e){
           throw new RuntimeException(e);
       }

       return adviserList;
    }


    /**
     * Convert InputStream photo to String
     * @param inpStream InputStream
     * @return String
     * @throws IOException
     */
    public  String inputStreamToString(InputStream inpStream)
    {
        if(inpStream==null)
            return "";

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


    /**===========Getter=========*/
    public String getName() {
        return name;
    }
    public InputStream getPhoto(){
        return  this.photo;
    }
    public String getEmail() {
        return email;
    }


    public String getOccupation() {
        return occupation;
    }

    public String getPresentAddr() {
        return presentAddr;
    }

    public String getPermanentAddr() {
        return permanentAddr;
    }

    public String getFromTime() {
        return fromTime;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public String getToTime() {
        return toTime;
    }
    public String getPhotoString(){
        return this.inputStreamToString(this.photo);
    }

    /**=====================Setter==========*/
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setPhoto(InputStream photo) {
        this.photo = photo;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void setPresentAddr(String presentAddr) {
        this.presentAddr = presentAddr;
    }

    public void setPermanentAddr(String permanentAddr) {
        this.permanentAddr = permanentAddr;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }
}
