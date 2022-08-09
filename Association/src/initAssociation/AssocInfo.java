/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initAssociation;

import java.io.File;

/**
 *
 * @author Nayeem
 */
public class AssocInfo {
    private String assocName;
    private File assocLogo;
    private File constitution;
    private String aboutAssoc;
    private String paymentDetails;

    public AssocInfo(String assocName, File assocLogo, File constitution, String aboutAssoc, String paymentDetails) {
        this.assocName = assocName;
        this.assocLogo = assocLogo;
        this.constitution = constitution;
        this.aboutAssoc = aboutAssoc;
        this.paymentDetails = paymentDetails;
    }

    public String getAssocName() {
        return assocName;
    }

    public File getAssocLogo() {
        return assocLogo;
    }

    public File getConstitution() {
        return constitution;
    }

    public String getAboutAssoc() {
        return aboutAssoc;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

   
 
    
}
