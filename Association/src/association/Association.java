
package association;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.Preferences;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import java.util.prefs.PreferencesFactory;


public class Association {

    static JButton submit_assoc_name;
    static JTextField assoc_name;
    Preferences prefs=Preferences.userNodeForPackage(Association.class);
    
    
    public static void main(String[] args) {
        
        //create a pre-customized frame by creating instance of MyFrame class 
        MyFrame fr=new MyFrame();  
//        fr.setVisible(true);
        
        //create an instance of this class to access non-static outside the class
        Association temp=new Association();
//        
        String s=temp.prefs.get("name","");
        if(s.equals(""))
        {
            assoc_name=new JTextField("Association Name",40);
            submit_assoc_name=new JButton();
            submit_assoc_name.setSize(50,20);
            submit_assoc_name.setText("Submit");
            
            JPanel jp=new JPanel();
            jp.setSize(300, 300);
            jp.setBackground(new Color(69, 84, 82));
            jp.add(assoc_name);
            jp.add(submit_assoc_name);
            fr.add(jp);
            fr.setVisible(true);
            
            submit_assoc_name.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                        temp.prefs.put("name", assoc_name.getText());

                        fr.dispose();
                        MyFrame x=new MyFrame();
                                x.setTitle(temp.prefs.get("name", ""));
                        
                }
                
            });
            
        }
        else{
        fr.setTitle(temp.prefs.get("name", ""));
        fr.setVisible(true);
        }

        
        
        
        
    }
    
}
