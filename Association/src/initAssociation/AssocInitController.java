
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
    * Constructor
    * @param assocModel the instance of AssocInitModel class for using by this controller class
    * @param assocView the instance of AssocInitView class for using by this controller class
    */
    public AssocInitController(AssocInitModel assocModel, AssocInitView assocView) {
        this.assocModel = assocModel;
        this.assocView = assocView;
        
           CustomAction btnAction = new CustomAction();
     
        /** 
         * add Action listener for buttons
         * on-click(submitDb) create new table in DB,store info in Preferences,add VarsityInfoPanel to view
         * @param assocView.getButton() the button in which to add action listener
         * @param ActionListener the instance of the ActionListener class
         */
        this.assocView.addListener(assocView.getSubmitDb(),btnAction );
        this.assocView.addListener(assocView.getSubmitVarsity(), btnAction);
        
        // Add key event listener in numberOfDept JTextField
        this.assocView.addDeptNumberListener();
        
    }
   
    //Start Controlling
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
                
                //create tables in DB and get the result of creating tables
                String res=assocModel.createDatabaseTables(
                        assocView.getDbAddr(),assocView.getDbUserName(),assocView.getDbPass());
                assocView.showDialogueMsg(res);
                
                //store DB info in Preferences
                assocModel.storeInPreferences();
                
                //if successfully created tables in DB then goto next step
                if(res.equals("Successfully Created Database")){
                        assocView.addVarsityInfo();
                }
                assocView.repaint();
            }
            if(ae.getSource()==assocView.getSubmitVarsity()){
                assocView.addAssocInfo();
                assocView.repaint();
            }
        }
        
    }
      
}
