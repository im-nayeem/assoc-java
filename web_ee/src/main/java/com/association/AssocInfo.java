package com.association;

import com.association.database.DatabaseConnection;

import java.io.FileInputStream;
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
    private FileInputStream assocLogo;
    private FileInputStream assocConstitution;
    private String assocAbout;
    private String paymentMethod;
    private final  String query="SELECT * FROM assoc_info";

    public AssocInfo() {
        conn = new DatabaseConnection();
        Statement st = conn.getStatement();
        try {
            ResultSet rs = st.executeQuery(query);
//            rs.


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

//        this.assocName = assocView.getAssocName();
//        this.assocLogo = assocView.getAssocLogo();
//        this.assocConstitution = assocView.getAssocConstitution();
//        this.assocAbout = assocView.getAboutAssoc();
//        this.paymentMethod = assocView.getPaymentMethod();
    }

    public String getAssocName() {
        return assocName;
    }

    public FileInputStream getAssocLogo() {
        return assocLogo;
    }

    public FileInputStream getAssocConstitution() {
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
