/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.association;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Base64;
import org.jetbrains.annotations.NotNull;

/**
 *
 * @author Mestu
 */
public class AssocNews {
    private String headline;
    private String details;
    private String footer;
    private String publicationDate;
    private InputStream photo;
    private String newsId;
    public AssocNews() {
    }
    
    
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
// <editor-fold defaultstate="collapsed" desc="News getter method. Click on the + sign on the left to edit the code.">
//---------------all getter method-------------------//
    public String getHeadline() {
        return headline;
    }

    public String getDetails() {
        return details;
    }

    public String getFooter() {
        return footer;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public InputStream getPhoto() {
        return photo;
    }
    
    public String getPhotoString(){
        return inputStreamToString(photo);
    }

    public String getNewsId() {
        return newsId;
    }
    
    
//    </editor-fold>
//-----------------------------------------------------------//
    
// <editor-fold defaultstate="collapsed" desc="News setter method. Click on the + sign on the left to edit the code.">
//---------all setter method--------------------------//
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
    
    public void setPhoto(InputStream photo) {
        this.photo = photo;
    }
    
    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }
    
//------------------------------------------------------------//
//    </editor-fold>




    
    
}
