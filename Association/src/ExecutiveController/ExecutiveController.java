/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExecutiveController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import welcome.WelcomeHomeView;

/**
 * controller class for handling all executive member related operation
 * view class for this controller is the common view class - WelcomeHomeView
 * model class for this controller is the ExecutiveMember class
 * @author Nayeem
 */
public class ExecutiveController {
    private WelcomeHomeView view;
    private ExecutiveMember model;
    
    /**
     * Constructor
     * @param view the view class for this controller
     */
    public ExecutiveController(WelcomeHomeView view) 
    {
        this.view = view;
        
        //set other actions or listeners
    }
    /**
     * Constructor
     * @param model the model class for this controller
     * @param view the view class for this controller
     */
    public ExecutiveController(ExecutiveMember model,WelcomeHomeView view) 
    {
        this.model = model;
        this.view = view;
        
        //set other actions or action listeners
    }
    public void start(){
//        view.showExecutiveMembersPanel();
    }
    
    public void stop(){
        
    }
    
    class CustomAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
//            if(ae.getSource() == view.somebtn()){
//                
//            }
        }
        
    }
    
    
    
}
