package initAssociation;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import validation.Validate;

/**
 * AssocInitView the view class for AssocInitController 
 * @author Nayeem
 */
public class AssocInitView extends javax.swing.JFrame {

   //----------Constructor--------------//
    public AssocInitView() {
        initComponents();
                //method where auto-generated codes are added to this frame
                
        this.setExtendedState(AssocInitView.MAXIMIZED_BOTH);
        try {
            //set frame state to extended window
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AssocInitView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AssocInitView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AssocInitView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AssocInitView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //----------------------------------//

    
    
    
    
 //================!!Dont't edit!!=================//   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code - Don't edit">                          
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        mainContentPanel = new javax.swing.JPanel();
        DatabaseInfoPanel = new javax.swing.JPanel();
        header1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        dbForm = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dbAddr = new javax.swing.JTextField();
        dbUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dbPass = new javax.swing.JTextField();
        submitDb = new javax.swing.JButton();
        VarsityInfoPanel = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        varsityInfoForm = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        varsityName = new javax.swing.JTextField();
        varsityWebLink = new javax.swing.JTextField();
        numberOfDept = new javax.swing.JFormattedTextField();
        lastBatch = new javax.swing.JFormattedTextField();
        submitVarsity = new javax.swing.JButton();
        deptListScrollPane = new javax.swing.JScrollPane();
        deptList = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        AssocInfoPanel = new javax.swing.JPanel();
        header2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        assocInfoForm = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        assocEmail = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        chooseAssocLogo = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        assocName = new javax.swing.JTextField();
        chooseAssocConstitution = new javax.swing.JButton();
        assocEmailPass = new javax.swing.JPasswordField();
        presidentPhone = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        gsPhone = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentMethod = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        aboutAssoc = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        submitAssoc = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(Toolkit.getDefaultToolkit().getScreenSize());
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());

        mainContentPanel.setBackground(new java.awt.Color(0, 102, 102));
        mainContentPanel.setMinimumSize(this.getSize());
        mainContentPanel.setPreferredSize(this.getSize());

        DatabaseInfoPanel.setBackground(new java.awt.Color(153, 153, 153));
        DatabaseInfoPanel.setMinimumSize(new java.awt.Dimension(1071, 700));
        DatabaseInfoPanel.setName("DatabaseInfoPanel"); // NOI18N
        DatabaseInfoPanel.setPreferredSize(new java.awt.Dimension(1368, 800));

        header1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Enter Database Information");
        jLabel12.setPreferredSize(new java.awt.Dimension(418, 95));

        javax.swing.GroupLayout header1Layout = new javax.swing.GroupLayout(header1);
        header1.setLayout(header1Layout);
        header1Layout.setHorizontalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        header1Layout.setVerticalGroup(
            header1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        dbForm.setBackground(new java.awt.Color(204, 204, 204));
        dbForm.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dbForm.setPreferredSize(new java.awt.Dimension(300, 300));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Enter Database Address: ");

        dbAddr.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        dbUserName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Enter Database Username:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Enter Database Password:");

        dbPass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        submitDb.setBackground(new java.awt.Color(0, 102, 51));
        submitDb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submitDb.setText("Submit");

        javax.swing.GroupLayout dbFormLayout = new javax.swing.GroupLayout(dbForm);
        dbForm.setLayout(dbFormLayout);
        dbFormLayout.setHorizontalGroup(
            dbFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dbFormLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(dbFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dbFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dbUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(dbPass)
                    .addComponent(dbAddr))
                .addGap(45, 45, 45))
            .addGroup(dbFormLayout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(submitDb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(311, 311, 311))
        );
        dbFormLayout.setVerticalGroup(
            dbFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dbFormLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(dbFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dbAddr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(dbFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(dbUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(dbFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(dbPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(submitDb)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout DatabaseInfoPanelLayout = new javax.swing.GroupLayout(DatabaseInfoPanel);
        DatabaseInfoPanel.setLayout(DatabaseInfoPanelLayout);
        DatabaseInfoPanelLayout.setHorizontalGroup(
            DatabaseInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatabaseInfoPanelLayout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addComponent(dbForm, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
            .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DatabaseInfoPanelLayout.setVerticalGroup(
            DatabaseInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatabaseInfoPanelLayout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(dbForm, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        dbForm.getAccessibleContext().setAccessibleName("");

        VarsityInfoPanel.setBackground(new java.awt.Color(204, 204, 204));
        VarsityInfoPanel.setMinimumSize(new java.awt.Dimension(1071, 700));
        VarsityInfoPanel.setName("contentPanel"); // NOI18N
        VarsityInfoPanel.setPreferredSize(this.mainContentPanel.getSize());

        header.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enter Institution Information");
        jLabel4.setPreferredSize(new java.awt.Dimension(418, 95));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        varsityInfoForm.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Institution Name:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Institution Website Link:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Current Batch:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Number Of Department:");

        varsityName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        varsityWebLink.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        numberOfDept.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        numberOfDept.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lastBatch.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        lastBatch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        submitVarsity.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        submitVarsity.setText("Submit");

        javax.swing.GroupLayout varsityInfoFormLayout = new javax.swing.GroupLayout(varsityInfoForm);
        varsityInfoForm.setLayout(varsityInfoFormLayout);
        varsityInfoFormLayout.setHorizontalGroup(
            varsityInfoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varsityInfoFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(varsityInfoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submitVarsity)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, varsityInfoFormLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastBatch))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, varsityInfoFormLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberOfDept))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, varsityInfoFormLayout.createSequentialGroup()
                        .addGroup(varsityInfoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(varsityInfoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(varsityWebLink, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varsityName, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        varsityInfoFormLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel5, jLabel6, jLabel7});

        varsityInfoFormLayout.setVerticalGroup(
            varsityInfoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(varsityInfoFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(varsityInfoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(varsityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(varsityInfoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(varsityWebLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(varsityInfoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(numberOfDept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(varsityInfoFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lastBatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(submitVarsity)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        varsityInfoFormLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel5, jLabel6, jLabel7});

        deptListScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        deptListScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        deptListScrollPane.setAutoscrolls(true);
        deptListScrollPane.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        deptList.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        deptList.setAutoscrolls(true);
        deptList.setMaximumSize(new java.awt.Dimension(400, 32767));

        javax.swing.GroupLayout deptListLayout = new javax.swing.GroupLayout(deptList);
        deptList.setLayout(deptListLayout);
        deptListLayout.setHorizontalGroup(
            deptListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );
        deptListLayout.setVerticalGroup(
            deptListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );

        deptListScrollPane.setViewportView(deptList);

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Enter All of the Department Name:");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout VarsityInfoPanelLayout = new javax.swing.GroupLayout(VarsityInfoPanel);
        VarsityInfoPanel.setLayout(VarsityInfoPanelLayout);
        VarsityInfoPanelLayout.setHorizontalGroup(
            VarsityInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(VarsityInfoPanelLayout.createSequentialGroup()
                .addComponent(varsityInfoForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(VarsityInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deptListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        VarsityInfoPanelLayout.setVerticalGroup(
            VarsityInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VarsityInfoPanelLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VarsityInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VarsityInfoPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deptListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(varsityInfoForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        AssocInfoPanel.setMinimumSize(new java.awt.Dimension(1071, 700));
        AssocInfoPanel.setName("DatabaseInfoPanel"); // NOI18N
        AssocInfoPanel.setPreferredSize(new java.awt.Dimension(1368, 800));

        header2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel13.setFont(new java.awt.Font("Algerian", 1, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Enter Association Information");
        jLabel13.setPreferredSize(new java.awt.Dimension(418, 95));

        javax.swing.GroupLayout header2Layout = new javax.swing.GroupLayout(header2);
        header2.setLayout(header2Layout);
        header2Layout.setHorizontalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        header2Layout.setVerticalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        assocInfoForm.setBackground(new java.awt.Color(102, 102, 102));
        assocInfoForm.setLayout(new java.awt.GridLayout(1, 2, 2, 0));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel14.setText("Association Name:");

        assocEmail.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel15.setText("Association Logo(<16MB):");

        chooseAssocLogo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chooseAssocLogo.setText("Choose a logo in PNG format");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel16.setText("Constitution(PDF):");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel17.setText("E-mail in-app Password:");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel18.setText("Association E-mail address:");

        assocName.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        chooseAssocConstitution.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chooseAssocConstitution.setText("Choose a pdf file");

        assocEmailPass.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        presidentPhone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel19.setText("President Phone Number:");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel20.setText("G.S. Phone Number:");

        gsPhone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(assocName, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(assocEmail))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel19))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chooseAssocConstitution, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(presidentPhone))))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseAssocLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(assocEmailPass))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(81, 81, 81)
                        .addComponent(gsPhone)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(assocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(assocEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(assocEmailPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(chooseAssocLogo))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(chooseAssocConstitution))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(presidentPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gsPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        assocInfoForm.add(jPanel1);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel21.setText("Payment Details:");

        paymentMethod.setColumns(20);
        paymentMethod.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        paymentMethod.setLineWrap(true);
        paymentMethod.setRows(5);
        jScrollPane1.setViewportView(paymentMethod);

        aboutAssoc.setColumns(20);
        aboutAssoc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        aboutAssoc.setLineWrap(true);
        aboutAssoc.setRows(5);
        jScrollPane2.setViewportView(aboutAssoc);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel22.setText("About Association:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                 .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                 .addContainerGap(17, Short.MAX_VALUE))
        );

        assocInfoForm.add(jPanel2);

        submitAssoc.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        submitAssoc.setText("Submit");

        javax.swing.GroupLayout AssocInfoPanelLayout = new javax.swing.GroupLayout(AssocInfoPanel);
        AssocInfoPanel.setLayout(AssocInfoPanelLayout);
        AssocInfoPanelLayout.setHorizontalGroup(
            AssocInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(assocInfoForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AssocInfoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitAssoc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AssocInfoPanelLayout.setVerticalGroup(
            AssocInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssocInfoPanelLayout.createSequentialGroup()
                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assocInfoForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitAssoc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainContentPanelLayout = new javax.swing.GroupLayout(mainContentPanel);
        mainContentPanel.setLayout(mainContentPanelLayout);
        mainContentPanelLayout.setHorizontalGroup(
            mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1071, Short.MAX_VALUE)
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(DatabaseInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(VarsityInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AssocInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE))
        );
        mainContentPanelLayout.setVerticalGroup(
            mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGap(0, 713, Short.MAX_VALUE)
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(DatabaseInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                 .addComponent(VarsityInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainContentPanelLayout.createSequentialGroup()
                     .addComponent(AssocInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        DatabaseInfoPanel.getAccessibleContext().setAccessibleName("DatabaseInfoPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(995, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainContentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(726, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
//=================!!Do not edit!!================//
    
    
    
    
    
    //==========Getter Methods===========//
    //<editor-fold defaultstate="collapsed" desc="Getter Method for buttons">
    
    public JButton getSubmitAssoc() {
        return submitAssoc;
    }
    
    public JButton getSubmitDb() {
        return submitDb;
    }
    
    public JButton getSubmitVarsity() {
        return submitVarsity;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getter for DB info">
    public String getDbAddr() {
        return dbAddr.getText();
    }
    
    public String getDbPass() {
        return dbPass.getText();
    }
    
    public String getDbUserName() {
        return dbUserName.getText();
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getter for Varsity Info">
    public String getVarsityName() {
        return varsityName.getText();
    }
    public String getVarsityWebLink() {
        return varsityWebLink.getText();
    }
    public String getNumberOfDept(){
        return numberOfDept.getText();
    }
    public List<String> getDepts() {
        
        List<String>allDept=new ArrayList<>();
        for(JTextField s:depts)
            allDept.add(s.getText());
            
        return allDept;
    }
    public String getLastBatch(){
        return lastBatch.getText();
    }
    
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getter for Association Info">
    public String getAboutAssoc() {
        return aboutAssoc.getText();
    }
    
    public String getAssocEmail() {
        return assocEmail.getText();
    }
    
    public String getAssocName() {
        return assocName.getText();
    }
    
    public String getAssocEmailPass() {
        return new String(assocEmailPass.getPassword());
    }
    
    public String getGsPhone() {
        return gsPhone.getText();
    }
    
    public String getPaymentMethod() {
        return paymentMethod.getText();
    }
    
    public String getPresidentPhone() {
        return presidentPhone.getText();
    }
    public FileInputStream getAssocLogo(){
        return this.assocLogo;
    }
    public FileInputStream getAssocConstitution(){
        return this.assocConstitution;
    }
//</editor-fold>
   
    //===================================//
    
    
    //================Setter Methdos======//
    
    //===================================//
    
    
//=================Add Event Listener to Components=============//
    public void addListener(JButton btn,ActionListener ae)
    {
        btn.addActionListener(ae);
    }
     /**
     * add action listener to chooseAssocConstitution button
     * on-click(chooseAssocConstitution)  choose a file and store it in assocConstitution FileInputStream
     * */
    public void addConstitutionListener(){
        this.chooseAssocConstitution.addActionListener((ActionEvent ae) -> {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if(response == JFileChooser.APPROVE_OPTION) 
            {
                File file = fileChooser.getSelectedFile();
                String path = file.getAbsolutePath();
                
                this.chooseAssocConstitution.setText(file.getPath());

                try {
                   this.assocConstitution = new FileInputStream(path.replace('\\', '/'));
                    
                } catch (FileNotFoundException ex) {
                    this.chooseAssocConstitution.setText("File not found");
                }
            }
            else
                this.chooseAssocConstitution.setText("File not selected!");
        });
      }
    /**
     * add action listener to chooseAssocLogo button
     * when clicked on chooseAssocLogo button choose a file and store it in assocLogo FileInputStream
     * */
    public void addLogoListener(){
        this.chooseAssocLogo.addActionListener((ActionEvent ae) -> {
            JFileChooser fileChooser = new JFileChooser();
            int response = fileChooser.showOpenDialog(null);
            if(response == JFileChooser.APPROVE_OPTION) 
            {
                
                File file = fileChooser.getSelectedFile();
                String path = file.getAbsolutePath();
                
                this.chooseAssocLogo.setText(file.getPath());

                try {
                   this.assocLogo = new FileInputStream(path.replace('\\', '/'));
                    
                } catch (FileNotFoundException ex) {
                    this.chooseAssocLogo.setText("Image file not found");
                }
            }
            else
                this.chooseAssocLogo.setText("Image not selected!");
        });
      }
    // when number of department is given add JTextField in deptList pane on deptListScrollPane
    public void addDeptNumberListener(){
        numberOfDept.addKeyListener(new KeyListener() {
            @Override
            public void keyReleased(KeyEvent ke) {
                if(numberOfDept.getText().equals("") || Validate.isNumber(numberOfDept.getText())==false)
                    return;
                
                int n=Integer.parseInt(numberOfDept.getText());
                
                depts.clear();
                deptList.removeAll();
                
                deptList.setLayout(new GridLayout(Math.max(n,10),1,0,5));
                for(int i=0;i<n;i++){
                    depts.add(i, new JTextField());
                    depts.get(i).setToolTipText("Department Name");
                    depts.get(i).setPreferredSize(new Dimension(deptList.getWidth(),40));
                    depts.get(i).setFont(new Font("Times New Roman",Font.PLAIN,18));
                    deptList.add(depts.get(i));
                }
                
                deptList.revalidate();
            }
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
            }
        });
    }
   
//==============================================================//
    
    
//==============Methods for Adding Panel to mainContentPanel========//
    public void addVarsityInfo(){
        mainContentPanel.removeAll();
        mainContentPanel.add(VarsityInfoPanel);
    }
    public void addAssocInfo(){
        mainContentPanel.removeAll();
        mainContentPanel.add(AssocInfoPanel);
    }
    public void addDatabaseInfo(){
       mainContentPanel.removeAll();
       mainContentPanel.add(DatabaseInfoPanel);
   } 
//=========================================================//
  
   
   //--------method to show dialogue message--//
   public void showDialogueMsg(String msg){
       JOptionPane.showMessageDialog(this,msg);
   }
   
   
//===============Member Variables================//
   private List<JTextField>depts=new ArrayList<>();
   
   private FileInputStream assocLogo;
   private FileInputStream assocConstitution;
   
   
   //---do not edit----//
 // <editor-fold defaultstate="collapsed" desc="Generated variables">
    // Variables declaration - do not modify                     
    private javax.swing.JPanel AssocInfoPanel;
    private javax.swing.JPanel DatabaseInfoPanel;
    private javax.swing.JPanel VarsityInfoPanel;
    private javax.swing.JTextArea aboutAssoc;
    private javax.swing.JButton chooseAssocConstitution;
    private javax.swing.JTextField assocEmail;
    private javax.swing.JPanel assocInfoForm;
    private javax.swing.JButton chooseAssocLogo;
    private javax.swing.JTextField assocName;
    private javax.swing.JPasswordField assocEmailPass;
    private javax.swing.JTextField dbAddr;
    private javax.swing.JPanel dbForm;
    private javax.swing.JTextField dbPass;
    private javax.swing.JTextField dbUserName;
    private javax.swing.JPanel deptList;
    private javax.swing.JScrollPane deptListScrollPane;
    private javax.swing.JFormattedTextField gsPhone;
    private javax.swing.JPanel header;
    private javax.swing.JPanel header1;
    private javax.swing.JPanel header2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField lastBatch;
    private javax.swing.JPanel mainContentPanel;
    private javax.swing.JFormattedTextField numberOfDept;
    private javax.swing.JTextArea paymentMethod;
    private javax.swing.JFormattedTextField presidentPhone;
    private javax.swing.JButton submitAssoc;
    private javax.swing.JButton submitDb;
    private javax.swing.JButton submitVarsity;
    private javax.swing.JPanel varsityInfoForm;
    private javax.swing.JTextField varsityName;
    private javax.swing.JTextField varsityWebLink;
    // End of variables declaration                   

 // </editor-fold> 
    //---do not edit-----//


}
