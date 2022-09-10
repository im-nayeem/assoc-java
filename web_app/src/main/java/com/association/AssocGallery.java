/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.association;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Base64;
import org.jetbrains.annotations.NotNull;

/**
 *
 * @author Mestu
 */
public class AssocGallery {
    private String id;
    private InputStream photo;
    private String caption;

    public AssocGallery() {
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


            String base64Image = Base64.getEncoder().encodeToString(outputStream.toByteArray());
            return base64Image;



        }
        catch(Exception e)
        {
            throw  new RuntimeException(e.getMessage());
        }

    }
    
    //<editor-fold desc="all getter method">
    public InputStream getPhoto() {
        return photo;
    }

    public String getId() {
        return id;
    }
    
    public String getPhotoString(){
        return inputStreamToString(photo);
    }

    public String getCaption() {
        return caption;
    }
    
    //</editor-fold>

    //<editor-fold desc="all setter method">
    public void setPhoto(InputStream photo) {
        this.photo = photo;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setCaption(String caption) {
        this.caption = caption;
    }
    
    //</editor-fold>

    
    
}
