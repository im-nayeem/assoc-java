
package initAssociation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * AssocInitController the controller class for AssocInitView and AssocInitModel
 * @author Nayeem
 */
public class AssocInitController {

   private AssocInitModel assocModel;
   private AssocInitView assocView;
   private boolean processing;
   public String status="running";


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
        CustomAction btnAction = new CustomAction();
        this.assocView.addListener(assocView.getSubmitDb(),btnAction );
        this.assocView.addListener(assocView.getSubmitVarsity(), btnAction);
       
        this.assocView.addDeptNumberListener();
    }
   
    public void start()
    {
        this.assocView.addDatabaseInfo();
        assocView.setVisible(true);
        
    }
    public void OpenWelcomeWindow(){
        
    }
    public void stop(){
//        assocView.dispose();
    }
   
    
    
        
    class CustomAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==assocView.getSubmitDb()){
                assocView.addVarsityInfo();
                assocView.repaint();
            }
            if(ae.getSource()==assocView.getSubmitVarsity()){
                assocView.addAssocInfo();
                assocView.repaint();
            }
        }
        
    }
      
}
