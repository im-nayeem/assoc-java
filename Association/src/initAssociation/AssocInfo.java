
package initAssociation;
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
    private String paymentMethod;

    public AssocInfo(AssocInitView assocView) {
        this.assocName = assocView.getAssocName();
        this.assocLogo = assocView.getAssocLogo();
        this.assocConstitution = assocView.getAssocConstitution();
        this.assocAbout = assocView.getAboutAssoc();
        this.paymentMethod = assocView.getPaymentMethod();
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
