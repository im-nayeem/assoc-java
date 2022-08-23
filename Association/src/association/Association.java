
package association;

import initAssociation.*;
import java.util.prefs.Preferences;
import welcome.WelcomeController;
import welcome.WelcomeHomeView;
import welcome.WelcomeModel;
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
        String s=prefs.get("dbAddr","");
//        s="";
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
           
            while(controller.running==true)
            {
                // don't go to next step
            }
            controller.stop();

        }
        WelcomeHomeView view = new WelcomeHomeView();
        WelcomeModel model = new WelcomeModel();
        WelcomeController controller = new WelcomeController(model,view);
        controller.start();
    }
    
    public static void main(String[] args) {
              
        //start the application
        init();
        
        
        
        
    }
    
}
