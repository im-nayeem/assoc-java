
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
        
        
        /** 
         * add Action listener for buttons
         * on-click(submitDb) create new table in DB,store info in Preferences,add VarsityInfoPanel to view
         * @param assocView.getButton() the button in which to add action listener
         * @param ActionListener the instance of the ActionListener class
         */
        CustomAction btnAction = new CustomAction();
        this.assocView.addListener(assocView.getSubmitDb(),btnAction );
        this.assocView.addListener(assocView.getSubmitVarsity(), btnAction);
        this.assocView.addListener(assocView.getSubmitAssoc(), btnAction);
        
        // Add key event listener in numberOfDept JTextField
        this.assocView.addDeptNumberListener();
        
        //Add Action Listener for choosing assocLogo and assocConstitution
        this.assocView.addLogoListener();
        this.assocView.addConstitutionListener();
        
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
            
            //<editor-fold defaultstate="collapsed" desc="if button == submitDb then...">
            if(ae.getSource()==assocView.getSubmitDb()){
                
                //create tables in DB and get the result of creating tables
                String res=assocModel.createDatabaseTables(
                        assocView.getDbAddr(),assocView.getDbUserName(),assocView.getDbPass());
                assocView.showDialogueMsg(res);
                
                //store DB info in Preferences
                assocModel.storeInPreferences();
                
                //if successfully created tables in DB then goto next step
                if(res.equals("Successfully Connected With Database")){
                    assocView.addVarsityInfo();
                }
                assocView.repaint();
            }
            //</editor-fold>
            
            if(ae.getSource()==assocView.getSubmitVarsity()){
                VarsityInfo varsityInfo = new VarsityInfo(assocView);
                assocModel.storeVarsityInfo(varsityInfo);
                assocView.addAssocInfo();
                assocView.repaint();
            }
            
            if(ae.getSource()==assocView.getSubmitAssoc()){
                AssocInfo assocInfo = new AssocInfo(assocView);
                assocModel.storeAssocInfo(assocInfo);
                
            }
        }

    }
      
}
