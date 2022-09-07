package com.association;


import com.association.database.DatabaseConnection;
import org.jetbrains.annotations.NotNull;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;

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
    private String assocMail;
    private String pass;
    private final  String query="SELECT * FROM assoc_info";

    public AssocInfo() {
        try {
            DatabaseConnection conn = new DatabaseConnection();
            Statement stmt= conn.getStatement();
            ResultSet rs =  stmt.executeQuery("SELECT * FROM assoc_info");
            rs.next();

            this.assocLogo = inputStreamToString(rs.getBinaryStream("assoc_logo"));
            this.assocConstitution =  rs.getBinaryStream("constitution");
            this.assocAbout =  rs.getString("about");
            this.paymentMethod =  rs.getString("pay_details");
            this.assocName = rs.getString("assoc_name");
            this.assocMail = rs.getString("email");
            this.pass=rs.getString("pass");

        }
        catch (Exception e) {
            throw new RuntimeException(e.toString()+"\nProblem with association information executing query.");
        }

    }
    public AssocInfo(HttpServletRequest request){

    }

    /**
     * Convert InputStream to String,Used to covert image into string
     * @param is_image inputStream to be converted into String
     * @return base64Image the converted String
     * @throws IOException
     */
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

    /**==================Getter Methods=======================**/
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

    public String getAssocMail() {
        return assocMail;
    }

    public String getPass() {
        return pass;
    }
    /**==================================================================**/


}
