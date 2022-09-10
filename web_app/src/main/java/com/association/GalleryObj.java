package com.association;

import com.association.database.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 10-Sep-22
 *
 * @author Nayeem
 */
public class GalleryObj {
    private String photo1;
    private String photo2;
    private String photo3;
    private String caption1;
    private String caption2;
    private String caption3;
    private String videoLink;
    private  String shortDesc;
    GalleryObj(){

    }
    public GalleryObj(ResultSet rs){
        try{
            this.photo1 = Utility.inputStreamToString(rs.getBinaryStream("photo1"));
            this.photo2 = Utility.inputStreamToString(rs.getBinaryStream("photo2"));
            this.photo3 = Utility.inputStreamToString(rs.getBinaryStream("photo3"));
            this.caption1 = rs.getString("caption1");
            this.caption2 = rs.getString("caption2");
            this.caption3  = rs.getString("caption3");
            this.shortDesc = rs.getString("short_desc");
        }
        catch (Exception e){
                throw new RuntimeException(e);
        }

    }
    public GalleryObj(String photo1, String photo2, String photo3, String caption1, String caption2, String caption3, String videoLink) {
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.caption1 = caption1;
        this.caption2 = caption2;
        this.caption3 = caption3;
        this.videoLink = videoLink;
    }

    public static List<GalleryObj> getHighlights(){
        try{
            List<GalleryObj>highlights = new ArrayList<>();
            DatabaseConnection conn = new DatabaseConnection();
            ResultSet rs = conn.executeQuery("SELECT * from media,gallery WHERE media.media_id=gallery.id and gallery.highlight=1");
            while(rs.next())
            {
                highlights.add(new GalleryObj(rs));

            }
            return highlights;

        }
        catch(Exception e){
            throw  new RuntimeException(e);

        }
    }

    public String getPhoto1() {
        return photo1;
    }

    public String getPhoto2() {
        return photo2;
    }

    public String getPhoto3() {
        return photo3;
    }

    public String getCaption1() {
        return caption1;
    }

    public String getCaption2() {
        return caption2;
    }

    public String getCaption3() {
        return caption3;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public String getShortDesc() {
        return shortDesc;
    }
}

