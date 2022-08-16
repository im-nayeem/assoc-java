
package initAssociation;
import java.io.FileInputStream;
import validation.Validate;

/**
 *
 * @author Nayeem
 */
public class AssocInfo {
    private String assocName;
    private FileInputStream assocLogo;
    private String assocAbout;
    private FileInputStream assocConstitution;
    private String assocEmail;
    private String assocPass;
    private String paymentMethod;
    private String presidentPhone;
    private String genSecretaryPhone;

   
    
    public AssocInfo(AssocInitView assocView) {
        this.assocName = assocView.getAssocName();
        //validity check of association name
        if (Validate.isValidAssocName(this.assocName) == false) {
            assocView.showDialogueMsg("Association name can only contain alphabet or ' or space");
            assocView.addAssocInfo();
            assocView.revalidate();
        }
        this.assocLogo = assocView.getAssocLogo();
        this.assocConstitution = assocView.getAssocConstitution();
        this.assocAbout = assocView.getAboutAssoc();
        this.assocEmail = assocView.getAssocEmail();
        this.assocPass = assocView.getAssocEmailPass();
        this.paymentMethod = assocView.getPaymentMethod();
        this.presidentPhone = assocView.getPresidentPhone();
        this.genSecretaryPhone = assocView.getGsPhone();
    }

    //<editor-fold defaultstate="collapsed" desc="getter methods">
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
    
    public String getAssocEmail() {
        return assocEmail;
    }
    
    public String getAssocPass() {
        return assocPass;
    }
    
    public String getPresidentPhone() {
        return presidentPhone;
    }
    
    public String getGenSecretaryPhone() {
        return genSecretaryPhone;
    }
//</editor-fold>
    
    
}
