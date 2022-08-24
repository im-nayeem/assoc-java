package com.association;

import com.association.database.DatabaseConnection;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nayeem
 */
public class AssocInfo {
    private DatabaseConnection conn;
    private String assocName;
    private InputStream assocLogo;
    private InputStream assocConstitution;
    private String assocAbout;
    private String paymentMethod;
    private final  String query="SELECT * FROM assoc_info";

    public AssocInfo(ResultSet rs){

    }
    public AssocInfo() {
        try {
                DatabaseConnection conn = new DatabaseConnection();
                System.out.println("Connected Successfully");
                Statement stmt= conn.getStatement();
                ResultSet rs =  stmt.executeQuery("SELECT * FROM assoc_info");
                rs.next();


                this.assocLogo = rs.getBinaryStream("assoc_logo");
                this.assocConstitution =  rs.getBinaryStream("constitution");
                this.assocAbout =  rs.getString("about");
                this.paymentMethod =  rs.getString("pay_details");




        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public String getAssocName() {
        return assocName;
    }

    public InputStream getAssocLogo() {
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


}
