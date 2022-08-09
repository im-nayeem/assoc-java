
package initAssociation;

import java.awt.event.ActionEvent;

/**
 * AssocInitController the controller class for AssocInitView and AssocInitModel
 * @author Nayeem
 */
public class AssocInitController {

   private AssocInitModel assocModel;
   private AssocInitView assocView;

   /**
    * 
    * @param assocModel the instance of AssocInitModel class for using by this controller class
    * @param assocView the instance of AssocInitView class for using by this controller class
    */
    public AssocInitController(AssocInitModel assocModel, AssocInitView assocView) {
        this.assocModel = assocModel;
        this.assocView = assocView;
        
        
        /** on-click(submitDb) create new table in DB,store info in Preferences
         * @param ActionListener the instance of the class that implements ActionListener()
         */
        this.assocView.addSubmitListener((ActionEvent ae) -> {
            System.out.println(assocModel.createDatabaseTables(assocView));
            assocModel.storeInPreferences();
            assocView.getPane().removeAll();
            assocView.repaint();
        });
       
    }
    public void start()
    {
        assocView.addDatabaseForm();
        assocView.setVisible(true);
        
    }
    public void stop(){
        assocView.setVisible(false);
    }
      
}
