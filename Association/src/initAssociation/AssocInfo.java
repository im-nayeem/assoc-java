
package initAssociation;
import java.io.FileInputStream;

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

    
    private boolean isAlphabetOnly(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) == false) {
                return false;
            }
        }
        return true;
    }
    
    public AssocInfo(AssocInitView assocView) {
        this.assocName = assocView.getAssocName();
        //validity check of association name
        if (this.isAlphabetOnly(this.assocName) == false) {
            assocView.showDialogueMsg("Varsity Name must contain only alphabet");
            assocView.addVarsityInfo();
            assocView.repaint();
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
    
    
}
