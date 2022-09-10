package com.association;


import com.association.database.DatabaseConnection;
import org.jetbrains.annotations.NotNull;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import java.io.InputStream;
import java.sql.ResultSet;
import java.util.Base64;
import javax.servlet.ServletException;

/**
 *
 * @author Nayeem
 */
public class AssocInfo {
    private DatabaseConnection conn;
    private String assocName;
    private String assocAbbr;
    private String assocLogo;
    private InputStream assocLogoStream;
    private InputStream assocConstitution;
    private String assocAbout;
    private String paymentMethod;
    private String assocMail;
    private String pass;
    private String presidentNumber;
    private String genSecNumber;
    private final  String query="SELECT * FROM assoc_info";

    public AssocInfo() {
        try {
            DatabaseConnection conn = new DatabaseConnection();
            ResultSet rs = conn.executeQuery("SELECT * FROM assoc_info");
            rs.next();

            this.assocLogo = this.inputStreamToString(rs.getBinaryStream("assoc_logo"));
            this.assocConstitution =  rs.getBinaryStream("constitution");
            this.assocAbout =  rs.getString("about");
            this.paymentMethod =  rs.getString("pay_details");
            this.assocName = rs.getString("assoc_name");
            this.assocAbbr = rs.getString("assoc_abbr");
            this.assocMail = rs.getString("email");
            this.pass=rs.getString("pass");
            this.presidentNumber = rs.getString("prsdnt_phone");
            this.genSecNumber = rs.getString("prsdnt_phone");

        }
        catch (Exception e) {
            throw new RuntimeException(e.toString()+"\nProblem with association information executing query.");
        }

    }
    public AssocInfo(HttpServletRequest request){
        try {
            this.assocName = request.getParameter("assoc_name");
            this.assocAbbr  = request.getParameter("assoc_abbr");
            this.assocLogoStream = request.getPart("assoc_logo").getInputStream();
            this.assocConstitution = request.getPart("assoc_constitution").getInputStream();
            this.assocAbout = request.getParameter("assoc_about");
            this.paymentMethod = request.getParameter("payment_details");
            this.assocMail = request.getParameter("assoc_email");
            this.pass = request.getParameter("password");
            this.presidentNumber = request.getParameter("president_number");
            this.genSecNumber = request.getParameter("gen_sec_number");
            
        } catch (IOException ex) {
            throw new RuntimeException(ex.toString()+"\nProblem with input format");
        } catch (ServletException ex) {
            throw new RuntimeException(ex.toString()+"\nProblem with servlet");
        }
    }

    /**
     * Convert InputStream to String,Used to covert image into string
     * @param inpStream inputStream to be converted into String
     * @return base64Image the converted String
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


            String base64Image = Base64.getEncoder().encodeToString(outputStream.toByteArray());
            return base64Image;



        }
        catch(Exception e)
        {
            throw  new RuntimeException(e.getMessage());
        }

    }

    /**==================Getter Methods=======================**/
    public String getAssocName() {
        return assocName;
    }
    public String getAssocAbbr(){return assocAbbr;}

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

    public InputStream getAssocLogoStream() {
        return assocLogoStream;
    }


    public String getPresidentNumber() {
        return presidentNumber;
    }

    public String getGenSecNumber() {
        return genSecNumber;
    }
    
    
    
    /**==================================================================**/


}
