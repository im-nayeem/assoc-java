/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nayeem
 */
public class WelcomeHomeView extends javax.swing.JFrame {
    
    
    /**
     * Creates new form WelcomeHomeView
     */
    public WelcomeHomeView() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

 //====Don't Modify==========//
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnVerify = new javax.swing.JButton();
        statusPanel = new javax.swing.JPanel();
        sidebarPanel = new javax.swing.JPanel();
        creditPanel = new javax.swing.JPanel();
        mainContentPanel = new javax.swing.JPanel();
        exeMemberInfo = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        exeMemberPostName = new javax.swing.JTextField();
        exeMemberStartDate = new javax.swing.JTextField();
        exeMemberEndDate = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exeMemberInfoBtn = new javax.swing.JButton();
        exeMemberInfoCancelBtn = new javax.swing.JButton();
        welcomePanel = new javax.swing.JPanel();
        registeredListPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        registeredMemberTable = new javax.swing.JTable();
        memberViewPanel = new javax.swing.JPanel();
        memberInfoHeaderPanel = new javax.swing.JPanel();
        memberInfoHeader = new javax.swing.JLabel();
        memberInfoPanel_1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        memberName = new javax.swing.JLabel();
        memberEmail = new javax.swing.JLabel();
        memberBatch = new javax.swing.JLabel();
        memberMothersName = new javax.swing.JLabel();
        memberID = new javax.swing.JLabel();
        memberSession = new javax.swing.JLabel();
        memberBloodGroup = new javax.swing.JLabel();
        memberFathersName = new javax.swing.JLabel();
        memberPhone = new javax.swing.JLabel();
        memberGender = new javax.swing.JLabel();
        memberDepartment = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        memberTrancNo = new javax.swing.JLabel();
        memberInfoFooterPanel = new javax.swing.JPanel();
        rejectMember = new javax.swing.JButton();
        memberInfoApprove = new javax.swing.JButton();
        memberInfoPanel_2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        memberPresentAddress = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        memberPermanentAddress = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        memberPhoto = new javax.swing.JLabel();
        co_activy = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        memberCoActivity = new javax.swing.JTextArea();
        alumni = new javax.swing.JCheckBox();
        exeMember = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(80, 0));
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());

        headerPanel.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("jButton1");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("jButton2");

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("jButton3");

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("jButton4");

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("jButton5");

        btnVerify.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnVerify.setText("Verify");

        statusPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                .addComponent(btnVerify)
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(btnVerify))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sidebarPanel.setBackground(new java.awt.Color(102, 102, 102));

        creditPanel.setBackground(new java.awt.Color(204, 204, 255));
        creditPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout creditPanelLayout = new javax.swing.GroupLayout(creditPanel);
        creditPanel.setLayout(creditPanelLayout);
        creditPanelLayout.setHorizontalGroup(
            creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        creditPanelLayout.setVerticalGroup(
            creditPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sidebarPanelLayout = new javax.swing.GroupLayout(sidebarPanel);
        sidebarPanel.setLayout(sidebarPanelLayout);
        sidebarPanelLayout.setHorizontalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(creditPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarPanelLayout.setVerticalGroup(
            sidebarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarPanelLayout.createSequentialGroup()
                .addGap(0, 537, Short.MAX_VALUE)
                .addComponent(creditPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Post Name :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText(" Start Date :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("End Date :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exeMemberEndDate)
                    .addComponent(exeMemberStartDate)
                    .addComponent(exeMemberPostName, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(300, 300, 300))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(exeMemberPostName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(exeMemberStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(exeMemberEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(187, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Executive Member's Information");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(389, 389, 389)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addGap(333, 333, 333))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        exeMemberInfoBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exeMemberInfoBtn.setText("Save");

        exeMemberInfoCancelBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exeMemberInfoCancelBtn.setText("Cancel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exeMemberInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exeMemberInfoCancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(418, 418, 418))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exeMemberInfoBtn)
                    .addComponent(exeMemberInfoCancelBtn))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout exeMemberInfoLayout = new javax.swing.GroupLayout(exeMemberInfo);
        exeMemberInfo.setLayout(exeMemberInfoLayout);
        exeMemberInfoLayout.setHorizontalGroup(
            exeMemberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exeMemberInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(exeMemberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(exeMemberInfoLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(167, 167, 167))
                    .addGroup(exeMemberInfoLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        exeMemberInfoLayout.setVerticalGroup(
            exeMemberInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exeMemberInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1018, Short.MAX_VALUE)
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );

        registeredListPanel.setAutoscrolls(true);

        registeredMemberTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        registeredMemberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(registeredMemberTable);

        javax.swing.GroupLayout registeredListPanelLayout = new javax.swing.GroupLayout(registeredListPanel);
        registeredListPanel.setLayout(registeredListPanelLayout);
        registeredListPanelLayout.setHorizontalGroup(
            registeredListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registeredListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE))
        );
        registeredListPanelLayout.setVerticalGroup(
            registeredListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registeredListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE))
        );

        memberViewPanel.setPreferredSize(this.memberViewPanel.getSize());

        memberInfoHeaderPanel.setBackground(new java.awt.Color(0, 102, 102));

        memberInfoHeader.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        memberInfoHeader.setForeground(new java.awt.Color(255, 255, 255));
        memberInfoHeader.setText("Student's Information");

        javax.swing.GroupLayout memberInfoHeaderPanelLayout = new javax.swing.GroupLayout(memberInfoHeaderPanel);
        memberInfoHeaderPanel.setLayout(memberInfoHeaderPanelLayout);
        memberInfoHeaderPanelLayout.setHorizontalGroup(
            memberInfoHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberInfoHeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(memberInfoHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        memberInfoHeaderPanelLayout.setVerticalGroup(
            memberInfoHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberInfoHeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(memberInfoHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        memberInfoPanel_1.setBackground(new java.awt.Color(108, 154, 165));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Student Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Student ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Phone");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Batch");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Department");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Session");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Gender");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Mother's Name");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Father's Name");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Blood Group");

        memberName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        memberName.setText("Student Name");
        memberName.setText("dynamic hobe");
        memberName.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                memberNameInputMethodTextChanged(evt);
            }
        });

        memberEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        memberEmail.setText("Email");

        memberBatch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        memberBatch.setText("Batch");

        memberMothersName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        memberMothersName.setText("Mother's Name");

        memberID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        memberID.setText("Student ID");

        memberSession.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        memberSession.setText("Session");

        memberBloodGroup.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        memberBloodGroup.setText("Blood Group");

        memberFathersName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        memberFathersName.setText("Father's Name");

        memberPhone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        memberPhone.setText("Phone");

        memberGender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        memberGender.setText("Gender");

        memberDepartment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        memberDepartment.setText("Department");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("Transaction Number");

        memberTrancNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        memberTrancNo.setText("01700000000");

        javax.swing.GroupLayout memberInfoPanel_1Layout = new javax.swing.GroupLayout(memberInfoPanel_1);
        memberInfoPanel_1.setLayout(memberInfoPanel_1Layout);
        memberInfoPanel_1Layout.setHorizontalGroup(
            memberInfoPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(memberInfoPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                        .addGroup(memberInfoPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(15, 15, 15))
                            .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(44, 44, 44))
                            .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(52, 52, 52))
                            .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(43, 43, 43))
                            .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(19, 19, 19))
                            .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(48, 48, 48))
                            .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(53, 53, 53))
                            .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27))
                            .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)))
                        .addGap(87, 87, 87))
                    .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(memberInfoPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(memberFathersName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberBloodGroup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberBatch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberSession, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberDepartment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberTrancNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberMothersName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        memberInfoPanel_1Layout.setVerticalGroup(
            memberInfoPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberInfoPanel_1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(memberInfoPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                        .addComponent(memberName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(memberID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(memberEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(memberPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(memberDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(memberSession, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(memberBatch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(memberGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(memberBloodGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(memberTrancNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(memberFathersName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(memberMothersName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        memberInfoFooterPanel.setBackground(new java.awt.Color(0, 102, 102));

        rejectMember.setText("Reject");

        memberInfoApprove.setText("Approve");

        javax.swing.GroupLayout memberInfoFooterPanelLayout = new javax.swing.GroupLayout(memberInfoFooterPanel);
        memberInfoFooterPanel.setLayout(memberInfoFooterPanelLayout);
        memberInfoFooterPanelLayout.setHorizontalGroup(
            memberInfoFooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberInfoFooterPanelLayout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(memberInfoApprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rejectMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(418, 418, 418))
        );
        memberInfoFooterPanelLayout.setVerticalGroup(
            memberInfoFooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberInfoFooterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(memberInfoFooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberInfoApprove)
                    .addComponent(rejectMember))
                .addGap(91, 91, 91))
        );

        memberInfoPanel_2.setBackground(new java.awt.Color(108, 154, 165));

        jLabel25.setText("Present Address");

        memberPresentAddress.setEditable(false);
        memberPresentAddress.setColumns(20);
        memberPresentAddress.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        memberPresentAddress.setRows(5);
        memberPresentAddress.setEnabled(false);
        jScrollPane1.setViewportView(memberPresentAddress);

        jLabel26.setText("Permanent Address");

        memberPermanentAddress.setColumns(20);
        memberPermanentAddress.setRows(5);
        memberPermanentAddress.setEnabled(false);
        jScrollPane2.setViewportView(memberPermanentAddress);

        jLabel30.setText("Photo");

        memberPhoto.setBackground(new java.awt.Color(185, 183, 181));

        co_activy.setText("Co-activity");

        memberCoActivity.setColumns(20);
        memberCoActivity.setRows(5);
        memberCoActivity.setEditable(false);
        jScrollPane3.setViewportView(memberCoActivity);

        alumni.setText("Alumni");

        exeMember.setText("Executive Member");
        exeMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exeMemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout memberInfoPanel_2Layout = new javax.swing.GroupLayout(memberInfoPanel_2);
        memberInfoPanel_2.setLayout(memberInfoPanel_2Layout);
        memberInfoPanel_2Layout.setHorizontalGroup(
            memberInfoPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(memberInfoPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                        .addGroup(memberInfoPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, memberInfoPanel_2Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(memberInfoPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberInfoPanel_2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addContainerGap())))
                    .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                        .addGroup(memberInfoPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(co_activy, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(memberInfoPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                                .addComponent(memberPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(memberInfoPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exeMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alumni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        memberInfoPanel_2Layout.setVerticalGroup(
            memberInfoPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(memberInfoPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(memberInfoPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(co_activy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(memberInfoPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(memberInfoPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(memberPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel30)))
                        .addContainerGap())
                    .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(alumni)
                        .addGap(38, 38, 38)
                        .addComponent(exeMember)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout memberViewPanelLayout = new javax.swing.GroupLayout(memberViewPanel);
        memberViewPanel.setLayout(memberViewPanelLayout);
        memberViewPanelLayout.setHorizontalGroup(
            memberViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(memberInfoHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(memberInfoFooterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(memberViewPanelLayout.createSequentialGroup()
                .addComponent(memberInfoPanel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(memberInfoPanel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        memberViewPanelLayout.setVerticalGroup(
            memberViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberViewPanelLayout.createSequentialGroup()
                .addComponent(memberInfoHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(memberViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(memberInfoPanel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memberInfoPanel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addComponent(memberInfoFooterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainContentPanelLayout = new javax.swing.GroupLayout(mainContentPanel);
        mainContentPanel.setLayout(mainContentPanelLayout);
        mainContentPanelLayout.setHorizontalGroup(
            mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registeredListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(welcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(memberViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainContentPanelLayout.createSequentialGroup()
                    .addComponent(exeMemberInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        mainContentPanelLayout.setVerticalGroup(
            mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registeredListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(welcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(memberViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainContentPanelLayout.createSequentialGroup()
                    .addComponent(exeMemberInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sidebarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memberNameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_memberNameInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_memberNameInputMethodTextChanged

    private void exeMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exeMemberActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_exeMemberActionPerformed
 //====Don't Modify==========//
  
    
    
 //================All Event Listener Methods are here============//
    public void addVerifyListener(ActionListener ae){
        this.btnVerify.addActionListener(ae);
    }
    public void addMemberApproveListener(ActionListener ae){
        this.memberInfoApprove.addActionListener(ae);
    }
    public void addRejectMemberApproveListener(ActionListener ae){
        this.rejectMember.addActionListener(ae);
    }
    
    public void addRegisteredMemberTable(MouseListener me){
        this.registeredMemberTable.addMouseListener(me);
    }
    
    public void addExe_memberListener(ActionListener ae){
        this.exeMember.addActionListener(ae);
    }
    
    public void addExe_MemberInfoListener(ActionListener ae){
        this.exeMemberInfoBtn.addActionListener(ae);
    }
    
    public void addExe_MemberInfoCancelListener(ActionListener ae){
        this.exeMemberInfoCancelBtn.addActionListener(ae);
    }
    
 //============================================================//
    
     //--------method to show dialogue message--//
   public void showDialogueMsg(String msg){
       JOptionPane.showMessageDialog(this,msg);
   }
    
    
 //==============Methods for Adding Panel to mainContentPanel========//
    public void addWelcomePane(){
        mainContentPanel.removeAll();
        mainContentPanel.add(this.welcomePanel);
       
    }
    public void addRegisteredList(){
        mainContentPanel.removeAll();
        mainContentPanel.add(this.registeredListPanel);
    }
    public void addMemberViewPanel(){
       mainContentPanel.removeAll();
       mainContentPanel.add(this.memberViewPanel);
   } 
   
   public void addExeMemberInfoPanel(){
       mainContentPanel.removeAll();
       mainContentPanel.add(this.exeMemberInfo);
   }
   
   
   
//=========================================================//

    public void setMemberViewPanel(AssocMember memberInfo) {
        memberName.setText(memberInfo.getName());
        memberID.setText(memberInfo.getId());
        memberEmail.setText(memberInfo.getEmail());
        memberPhone.setText(memberInfo.getPhone());
        memberDepartment.setText(memberInfo.getDept());
        memberSession.setText(memberInfo.getSession());
        memberBatch.setText(memberInfo.getBatch());
        memberGender.setText(memberInfo.getGender());
        memberBloodGroup.setText(memberInfo.getBg());
        memberTrancNo.setText(memberInfo.getTranc_no());
        memberFathersName.setText(memberInfo.getFathersname());
        memberMothersName.setText(memberInfo.getMothersname());
        memberPresentAddress.setText(memberInfo.getPresent_details());
        memberPermanentAddress.setText(memberInfo.getPermanent_details());
        memberCoActivity.setText(memberInfo.getCo_activity());
        memberPhoto.setIcon(memberInfo.getPhoto(memberInfo.getPhotoByte()));
    }

    public void setRegisteredListPanel(DefaultTableModel registeredTableModel) {
        registeredMemberTable.setRowHeight(30);
        registeredMemberTable.getTableHeader().setPreferredSize(
            new Dimension(jScrollPane4.getWidth(),30));
        registeredMemberTable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 18));
        
        registeredMemberTable.setModel(registeredTableModel);
    }
        
    
    
 //==============All getter Methods are here================//
    //button
    public JButton getBtnVerify() {
        return btnVerify;
    }
    public JTable getRegisteredMemberTable() {
        return registeredMemberTable;
    }
    public JButton getMemberInfoApprove() {
        return memberInfoApprove;
    }
    public JButton getRejectMember() {
        return rejectMember;
    }

    public JButton getExeMemberInfoBtn() {
        return exeMemberInfoBtn;
    }

    public JButton getExeMemberInfoCancelBtn() {
        return exeMemberInfoCancelBtn;
    }
    
   
    //check box
    public JCheckBox getAlumni() {
        return alumni;
    }
    
    
    public JCheckBox getExeMemberCheckBox() {
        return exeMember;
    }    
    
    //label
    public JLabel getMemberEmail() {
        return memberEmail;
    }
      
    public JLabel getMemberId() {
        return memberID;
    }
    
    
    //text box
    public JTextField getExeMemberEndDate() {
        return exeMemberEndDate;
    }

    public JTextField getExeMemberPostName() {
        return exeMemberPostName;
    }

    public JTextField getExeMemberStartDate() {
        return exeMemberStartDate;
    }
    
    
    
 //========================================================//

//==============All setter Methods are here================//
    

    
//========================================================//



   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alumni;
    private javax.swing.JButton btnVerify;
    private javax.swing.JLabel co_activy;
    private javax.swing.JPanel creditPanel;
    private javax.swing.JCheckBox exeMember;
    private javax.swing.JTextField exeMemberEndDate;
    private javax.swing.JPanel exeMemberInfo;
    private javax.swing.JButton exeMemberInfoBtn;
    private javax.swing.JButton exeMemberInfoCancelBtn;
    private javax.swing.JTextField exeMemberPostName;
    private javax.swing.JTextField exeMemberStartDate;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel mainContentPanel;
    private javax.swing.JLabel memberBatch;
    private javax.swing.JLabel memberBloodGroup;
    private javax.swing.JTextArea memberCoActivity;
    private javax.swing.JLabel memberDepartment;
    private javax.swing.JLabel memberEmail;
    private javax.swing.JLabel memberFathersName;
    private javax.swing.JLabel memberGender;
    private javax.swing.JLabel memberID;
    private javax.swing.JButton memberInfoApprove;
    private javax.swing.JPanel memberInfoFooterPanel;
    private javax.swing.JLabel memberInfoHeader;
    private javax.swing.JPanel memberInfoHeaderPanel;
    private javax.swing.JPanel memberInfoPanel_1;
    private javax.swing.JPanel memberInfoPanel_2;
    private javax.swing.JLabel memberMothersName;
    private javax.swing.JLabel memberName;
    private javax.swing.JTextArea memberPermanentAddress;
    private javax.swing.JLabel memberPhone;
    private javax.swing.JLabel memberPhoto;
    private javax.swing.JTextArea memberPresentAddress;
    private javax.swing.JLabel memberSession;
    private javax.swing.JLabel memberTrancNo;
    private javax.swing.JPanel memberViewPanel;
    private javax.swing.JPanel registeredListPanel;
    private javax.swing.JTable registeredMemberTable;
    private javax.swing.JButton rejectMember;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables


}
