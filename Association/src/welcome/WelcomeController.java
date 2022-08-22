/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Nayeem
 */
public class WelcomeController {
    private WelcomeModel model;
    private WelcomeHomeView view;
    public WelcomeController(WelcomeModel model,WelcomeHomeView view)
    {
        this.model = model;
        this.view = view;
        
        // add click action listener on verify button
        this.view.addVerifyListener(new CustomAction());
        
    }
    
    public void start(){
        view.addWelcomePane();
        view.setVisible(true);
    }
    
    public void stop(){
        
    }
    
    //============Control event listener here==============//
    
    class CustomAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            // If clicked on verify button add registered list panel
            if(ae.getSource() == view.getBtnVerify())
            {
                view.addRegisteredList();
                view.repaint();
            }
            
            
        }
        
    }
    
    
    
    
    //============Control event listener here--------//

    
}
