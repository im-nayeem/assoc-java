
package association;

import initAssociation.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
/**
 * Association the main class that assemble the model,view and controller
 * @author Nayeem
 */

public class Association {

    /**
     * get user preferences to check whether DB info is found or not
     * if found goto welcome window
     * if not found create new association and store DB info in preferences
     */
    static Preferences prefs=Preferences.userNodeForPackage(Association.class);
    
    public static void init(){
        try {
            prefs.clear();
        } catch (BackingStoreException ex) {
            Logger.getLogger(Association.class.getName()).log(Level.SEVERE, null, ex);
        }
        String s=prefs.get("dbAddr","");
        /**
         * if database info is not found in Preferences initialize AssocInitController in package initAssociation
         * AssocInitController initialize the setup for new association or existing association
         */
        if(s.equals(""))
        {
            AssocInitView view=new AssocInitView();
            AssocInitModel model=new AssocInitModel();
            AssocInitController controller=new AssocInitController(model,view);
            controller.start();
               
        }
        else
        {
            
        }
    }
    
    public static void main(String[] args) {
              
        //start the application
        System.out.println("khela start");
        init();
        
        
        
        
        
    }
    
}
