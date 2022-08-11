/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initAssociation;

import java.io.File;
import java.io.FileInputStream;

/**
 *
 * @author Nayeem
 */
public class AssocInfo {
    private String assocName;
    private FileInputStream assocLogo;
    private FileInputStream assocConstitution;
    private String assocAbout;
    private String paymentNumber;
    private String paymentMethod;
    private int payementAmount;

    public AssocInfo(AssocInitView assocView) {
//        this.assocName = assocView.getAssocName();
//        this.assocLogo = assocView.getLogo();
//        this.assocConstitution = assocView.getConstitutionPDF();
//        this.assocAbout = assocView.getAssocAbout();
//        this.paymentNumber = assocView.getPaymentNumber();
//        this.paymentMethod = assocView.getPaymentMethod();
//        this.payementAmount = Integer.parseInt(assocView.getPaymentAmount());
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

    public String getPaymentNumber() {
        return paymentNumber;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public int getPayementAmount() {
        return payementAmount;
    }
    
}
