package initAssociation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;

/**
 * AssocInitView view class for AssocInit that extends JFrame
 * @author Nayeem
 */
public class AssocInitView extends JFrame{
    
        //contentPanel that contains other components
    private JPanel contentPanel = new JPanel();
    
    //databse variable
    private JTextField dbAddr = new JTextField();
    private JTextField dbUserName = new JTextField();
    private JPasswordField dbPass = new JPasswordField();
    private JButton submitDb = new JButton("Submit");
    
    //Univarsity information 
    private JTextField varsityName;
    private JTextField varsityWebLink;
    private JTextField lastBatch;
    private JTextPane departmentList;
    private JButton submitVarsity;
    
//    Association Information
    private JTextField assocName;
    private JTextField assocEmail;
    private JTextField assocVerificationEmail;
    private JTextField presidentPhone;
    private JTextField genSecretaryPhone;
    private JTextField paymentNumber;
    private JTextField paymentAmount;
    private JButton submitAssoc;
    private JTextArea assocAbout;
    private JComboBox paymentMethod;
    private FileInputStream logo;
    private FileInputStream constitutionPDF;
    
    /**
     * Constructor for this view class
     * setup the components to be displayed in frame
     */
    public AssocInitView()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setResizable(false);
        //get the window screen size to make responsive application
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
       this.setSize(screenSize.width, screenSize.height);
        System.out.println(screenSize.width+" "+screenSize.height);
//        this.setSize(new Dimension(1300,1000));
       
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

    public JButton getSubmitDb() {
        return submitDb;
    }
    
    public void addSubmitListener(ActionListener e){
        submitDb.addActionListener(e);
    }

    public JButton getSubmitVarsity() {
        return submitVarsity;
    }

    public String getVarsityName() {
        return varsityName.getText();
    }

    public String getVarsityWebLink() {
        return varsityWebLink.getText();
    }

    public String getLastBatch() {
        return lastBatch.getText();
    }

    public String getDepartmentList() {
        return departmentList.getText();
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }

    public String getAssocName() {
        return assocName.getText();
    }

    public String getAssocEmail() {
        return assocEmail.getText();
    }

    public String getAssocVerificationEmail() {
        return assocVerificationEmail.getText();
    }

    public String getPresidentPhone() {
        return presidentPhone.getText();
    }

    public String getGenSecretaryPhone() {
        return genSecretaryPhone.getText();
    }

    public String getPaymentNumber() {
        return paymentNumber.getText();
    }

    public String getPaymentAmount() {
        return paymentAmount.getText();
    }

    public JButton getSubmitAssoc() {
        return submitAssoc;
    }

    public String getAssocAbout() {
        return assocAbout.getText();
    }

    public String getPaymentMethod() {
        return paymentMethod.getSelectedItem().toString();
    }

    public FileInputStream getLogo() {
        return logo;
    }

    public FileInputStream getConstitutionPDF() {
        return constitutionPDF;
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
    
    public void addVarsityForm(){
        System.out.println("function is called");
        contentPanel.removeAll();
        contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        contentPanel.setLayout(null);
        
//        new form for varsity information
//        JPanel form = new JPanel();
//        form.setLayout(new GridLayout(5,2));
//        form.setPreferredSize(new Dimension(this.getWidth()*4/5, this.getHeight()*4/5));
//        form.setPreferredSize(new Dimension(300,300));
        
//        Here copy paste
        JLabel lblNewLabel = new JLabel("University Information");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel.setBounds(575, 25, 200, 25);
        contentPanel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("University Name :");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel_1.setBounds(410, 145, 200, 25);
        contentPanel.add(lblNewLabel_1);

        varsityName = new JTextField();
        varsityName.setBounds(410, 195, 200, 25);
        contentPanel.add(varsityName);
        varsityName.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("University Website Link :");
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel_1_1.setBounds(410, 245, 200, 25);
        contentPanel.add(lblNewLabel_1_1);

        varsityWebLink = new JTextField();
        varsityWebLink.setColumns(10);
        varsityWebLink.setBounds(410, 295, 200, 25);
        contentPanel.add(varsityWebLink);

        JLabel lblNewLabel_2 = new JLabel("Current Batch Number :");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel_2.setBounds(410, 345, 200, 25);
        contentPanel.add(lblNewLabel_2);

        lastBatch = new JTextField();
        lastBatch.setColumns(10);
        lastBatch.setBounds(410, 395, 200, 25);
        contentPanel.add(lastBatch);

        JLabel lblNewLabel_3 = new JLabel("All Department's Name :");
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        lblNewLabel_3.setBounds(750, 145, 200, 25);
        contentPanel.add(lblNewLabel_3);

        departmentList = new JTextPane();
        departmentList.setText("dept 1\ndept 2\n. . .\n. . .\n. . .");
        departmentList.setBounds(750, 200, 200, 220);
        departmentList.setFont(new Font("Times New Roman", Font.ITALIC , 18));
        contentPanel.add(departmentList);

        submitVarsity = new JButton("Submit");
        submitVarsity.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        submitVarsity.setBounds(626, 499, 120, 25);
        contentPanel.add(submitVarsity);
//        copy paste end

//        contentPanel.add(form);
    }
    
    public void addAssociationForm(){
        System.out.println("add association form function is called");
        contentPanel.removeAll();
        contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        contentPanel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Association Information");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel.setBounds(575, 25, 200, 30);
        contentPanel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Association Name :");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(276, 145, 152, 14);
        contentPanel.add(lblNewLabel_1);

        assocName = new JTextField();
        assocName.setBounds(276, 175, 200, 20);
        contentPanel.add(assocName);
        assocName.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("Association Logo :");
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel_1_1.setBounds(276, 215, 152, 14);
        contentPanel.add(lblNewLabel_1_1);

        JButton assocLogo = new JButton("Choose Image");
        assocLogo.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        JFileChooser fileChooser = new JFileChooser();
                        //response = 0?choose a file
                        //responce = 1?cancel
                        int response = fileChooser.showOpenDialog(null);  
                        if(response == JFileChooser.APPROVE_OPTION) {
                            File file = fileChooser.getSelectedFile();
                            String path = file.getAbsolutePath();
                            try {
                                logo = new FileInputStream(path.replace('\\', '/'));
                            } catch (FileNotFoundException e1) {
                                    System.out.print("Image file not found");
                            }
                        }
                }
        });
        assocLogo.setBounds(276, 240, 200, 23);
        contentPanel.add(assocLogo);

        JLabel lblNewLabel_1_2 = new JLabel("Constitution (PDF) :");
        lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel_1_2.setBounds(276, 285, 150, 14);
        contentPanel.add(lblNewLabel_1_2);

        JButton assocConstitution = new JButton("Choose PDF ");
        assocConstitution.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                        JFileChooser fileChooser = new JFileChooser();
                        int response = fileChooser.showOpenDialog(null);
                        if(response==JFileChooser.APPROVE_OPTION) {
                                File file = fileChooser.getSelectedFile();
                                String path = file.getAbsolutePath();
                                try {
                                    constitutionPDF = new FileInputStream(path.replace('\\', '/'));
                                } catch (FileNotFoundException e1) {
                                        // TODO Auto-generated catch block
                                        e1.printStackTrace();
                                }
                        }
                }
        });
        assocConstitution.setBounds(276, 310, 200, 23);
        contentPanel.add(assocConstitution);

        JLabel lblNewLabel_1_3 = new JLabel("Association Email Address :");
        lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel_1_3.setBounds(276, 355, 171, 14);
        contentPanel.add(lblNewLabel_1_3);

        assocEmail = new JTextField();
        assocEmail.setColumns(10);
        assocEmail.setBounds(276, 385, 200, 20);
        contentPanel.add(assocEmail);

        JLabel lblNewLabel_1_4 = new JLabel("Email for authentication :");
        lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel_1_4.setBounds(276, 425, 150, 14);
        contentPanel.add(lblNewLabel_1_4);

        assocVerificationEmail = new JTextField();
        assocVerificationEmail.setColumns(10);
        assocVerificationEmail.setBounds(276, 455, 200, 20);
        contentPanel.add(assocVerificationEmail);

        JLabel lblNewLabel_1_5 = new JLabel("President Phone :");
        lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel_1_5.setBounds(276, 499, 152, 14);
        contentPanel.add(lblNewLabel_1_5);

        presidentPhone = new JTextField();
        presidentPhone.setColumns(10);
        presidentPhone.setBounds(276, 529, 200, 20);
        contentPanel.add(presidentPhone);

        JLabel lblNewLabel_1_6 = new JLabel("General Secretary Phone :");
        lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel_1_6.setBounds(276, 575, 152, 14);
        contentPanel.add(lblNewLabel_1_6);

        genSecretaryPhone = new JTextField();
        genSecretaryPhone.setColumns(10);
        genSecretaryPhone.setBounds(276, 605, 200, 20);
        contentPanel.add(genSecretaryPhone);

        JLabel lblNewLabel_2 = new JLabel("About Association :");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(640, 310, 166, 14);
        contentPanel.add(lblNewLabel_2);

        assocAbout = new JTextArea();
        assocAbout.setBounds(637, 334, 380, 291);
        contentPanel.add(assocAbout);

        JPanel payment_panel = new JPanel();
        Border blackline = BorderFactory.createLineBorder(Color.black);
        payment_panel.setBounds(640, 145, 380, 120);
        payment_panel.setBorder(blackline);
        contentPanel.add(payment_panel);
        payment_panel.setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("Payment Details :");
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel_3.setBounds(10, 0, 169, 14);
        payment_panel.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("Payment Number");
        lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel_4.setBounds(10, 36, 101, 14);
        payment_panel.add(lblNewLabel_4);

        paymentNumber = new JTextField();
        paymentNumber.setBounds(10, 61, 116, 20);
        payment_panel.add(paymentNumber);
        paymentNumber.setColumns(10);

        paymentAmount = new JTextField();
        paymentAmount.setColumns(10);
        paymentAmount.setBounds(147, 61, 60, 20);
        payment_panel.add(paymentAmount);

        JLabel lblNewLabel_4_1 = new JLabel("Amount");
        lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel_4_1.setBounds(147, 36, 72, 14);
        payment_panel.add(lblNewLabel_4_1);

        String media[] = {"bKash","Nagad","Rocket"};
        paymentMethod = new JComboBox(media);
        paymentMethod.setBounds(238, 60, 107, 22);
        payment_panel.add(paymentMethod);

        JLabel lblNewLabel_5 = new JLabel(" Payment Method");
        lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        lblNewLabel_5.setBounds(236, 36, 109, 14);
        payment_panel.add(lblNewLabel_5);;

        submitAssoc = new JButton("Submit");
        submitAssoc.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        submitAssoc.setBounds(601, 675, 120, 25);
        contentPanel.add(submitAssoc);
    }
    
}
