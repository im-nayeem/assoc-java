package initAssociation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * AssocInitView view class for AssocInit that extends JFrame
 * @author Nayeem
 */
public class AssocInitView extends JFrame{
    private JPanel contentPanel = new JPanel();

    private JTextField dbAddr = new JTextField();
    private JTextField dbUserName = new JTextField();
    private JPasswordField dbPass = new JPasswordField();
    private JButton submitDb = new JButton("Submit");
    
    /**
     * Constructor for this view class
     * setup the components to be displayed in frame
     */
    public AssocInitView()
    {
        //get the window screen size to make responsive application
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
        this.setSize(screenSize.width*2/3, screenSize.height*2/3);
       
        //set background color of the frame
        this.getContentPane().setBackground(new Color(69, 84, 82)); 
        
        //set layout manager for the frame
        this.setLayout(new BorderLayout(2,2));
        
        contentPanel.setBackground(new Color(100, 120, 110));
        contentPanel.setPreferredSize(this.getSize());   
        this.add(contentPanel);
        
    }
    
    /**
     * Method getpPane()
     * @return  contentPanel the reference of the panel where all others component will be added
     */
    public JPanel getPane(){
        return this.contentPanel;
    }
    
//<editor-fold defaultstate="collapsed" desc="All Getter Methods">
    public String getDbAddr()
    {
        return this.dbAddr.getText();
    }
    
    public String getDbUserName() {
        return dbUserName.getText();
    }
    
    public String getDbPass() {
        return new String(dbPass.getPassword());
    }
    
    public void addSubmitListener(ActionListener e){
        submitDb.addActionListener(e);
    }
    
//</editor-fold>
    
    public void addDatabaseForm(){
        contentPanel.removeAll();
        contentPanel.setLayout(new GridBagLayout());
        
        //<editor-fold defaultstate="collapsed" desc="Address Form">
        JPanel form = new JPanel();
        form.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
        form.setPreferredSize(new Dimension(this.getWidth()/2, this.getHeight()/2));
        
        form.add(new JLabel("Enter DB Address: "));
        form.add(dbAddr);
        dbAddr.setPreferredSize(new Dimension(300,20));
        form.add(new JLabel("Enter DB Username: "));
        form.add(dbUserName);
        dbUserName.setPreferredSize(new Dimension(300,20));
        form.add(new JLabel("Enter DB Password: "));
        form.add(dbPass);
        dbPass.setPreferredSize(new Dimension(300,20));
        form.add(submitDb);
        
        
        
//</editor-fold>
        contentPanel.add(form);
    }
    
    public void addVarsityInfo(){
        
    }
    
    public void addAssociationInfo(){
        
    }
    
}
