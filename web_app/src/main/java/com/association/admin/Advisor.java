package com.association.admin;

import com.association.UserAccount;
import com.association.database.DatabaseConnection;
import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

/**
 * Created on 09-Sep-22
 *
 * @author Nayeem
 */
public class Advisor {
    private String name;
    private String email;
    private InputStream photo;
    private String occupation;
    private String presentAddr;
    private String permanentAddr;
    private String fromTime;
    private String toTime;

    public Advisor(String name, String email, String fromTime, String toTime) {
        this.name = name;
        this.email = email;
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    /**
     * Constructor
     * @param name advisor name
     * @param email advisor email
     * @param occupation advisor's occupation
     * @param presentAddr advisor's present address
     * @param permanentAddr advisor's permanent address
     * @param fromTime
     * @param toTime
     */
    public Advisor(String name, String email,InputStream photo, String occupation, String presentAddr, String permanentAddr, String fromTime, String toTime) {
        this.name = name;
        this.email = email;
        this.photo = photo;
        this.occupation = occupation;
        this.presentAddr = presentAddr;
        this.permanentAddr = permanentAddr;
        this.fromTime = fromTime;
        this.toTime = toTime;
    }
    public Advisor(final ResultSet rs){
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
    public  static List<Advisor> getAdvisorList(){
        List<Advisor>advisorList = new ArrayList<>();

       try{
           DatabaseConnection conn = new DatabaseConnection();
           ResultSet rs = conn.executeQuery("select * from advisor");
           while(rs.next())
           {
               advisorList.add(new Advisor(rs));

           }
       }
       catch (Exception e){
           throw new RuntimeException(e);
       }

       return advisorList;
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
