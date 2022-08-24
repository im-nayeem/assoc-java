package com.association;


import com.association.database.DatabaseConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;
import javax.websocket.Decoder;

/**
 *
 * @author Nayeem
 */
public class AssocInfo {
    private DatabaseConnection conn;
    private String assocName;
    private String assocLogo;
    private InputStream assocConstitution;
    private String assocAbout;
    private String paymentMethod;
    private final  String query="SELECT * FROM assoc_info";

    public AssocInfo() {
        try {
            DatabaseConnection conn = new DatabaseConnection();
            Statement stmt= conn.getStatement();
            ResultSet rs =  stmt.executeQuery("SELECT * FROM assoc_info");
            rs.next();

            this.assocLogo = this.convertBinaryStreamToBase64Image(rs.getBinaryStream("assoc_logo"));
            this.assocConstitution =  rs.getBinaryStream("constitution");
            this.assocAbout =  rs.getString("about");
            this.paymentMethod =  rs.getString("pay_details");
        }
        catch (Exception e) {
//            System.out.println(e);
            throw new RuntimeException(e.toString()+"\nProblem with executing query.");
        }

    }
    public String convertBinaryStreamToBase64Image(InputStream is_image) throws IOException{
        
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte buffer[] = new byte[4096];
        int bytesRead = -1;
        while((bytesRead = is_image.read(buffer))!=-1){
            outputStream.write(buffer,0,bytesRead);
        }
        String base64Image = Base64.getEncoder().encodeToString(outputStream.toByteArray());
        return base64Image;
    }
    public String getAssocName() {
        return assocName;
    }

    public String getAssocLogo() {
        return assocLogo;
    }

    public  InputStream getAssocConstitution() {
        return assocConstitution;
    }

    public String getAboutAssoc() {
        return assocAbout;
    }

    public String getAssocAbout() {
        return assocAbout;
    }


    public String getPaymentMethod() {
        return paymentMethod;
    }

    public static void main(String a[]){
        System.out.println("hello world");
    }
}
