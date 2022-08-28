/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
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
        member_name = new javax.swing.JLabel();
        member_email = new javax.swing.JLabel();
        member_batch = new javax.swing.JLabel();
        member_mother_name = new javax.swing.JLabel();
        member_id = new javax.swing.JLabel();
        member_session = new javax.swing.JLabel();
        member_blood_group = new javax.swing.JLabel();
        member_father_name = new javax.swing.JLabel();
        member_phone = new javax.swing.JLabel();
        member_gender = new javax.swing.JLabel();
        member_department = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        member_tranc_no = new javax.swing.JLabel();
        memberInfoFooterPanel = new javax.swing.JPanel();
        memberInfoApprove = new javax.swing.JButton();
        memberInfoCancel = new javax.swing.JButton();
        memberInfoPanel_2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        member_present_address = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        member_permanent_address = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        member_photo = new javax.swing.JLabel();
        co_activy = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        member_co_activity = new javax.swing.JTextArea();
        alumni = new javax.swing.JCheckBox();
        exe_member = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(Toolkit.getDefaultToolkit().getScreenSize());
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
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
                .addGap(0, 499, Short.MAX_VALUE)
                .addComponent(creditPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout welcomePanelLayout = new javax.swing.GroupLayout(welcomePanel);
        welcomePanel.setLayout(welcomePanelLayout);
        welcomePanelLayout.setHorizontalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 734, Short.MAX_VALUE)
        );
        welcomePanelLayout.setVerticalGroup(
            welcomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
        registeredListPanelLayout.setVerticalGroup(
            registeredListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registeredListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE))
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

        member_name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        member_name.setText("Student Name");
        member_name.setText("dynamic hobe");
        member_name.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                member_nameInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        member_email.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        member_email.setText("Email");

        member_batch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        member_batch.setText("Batch");

        member_mother_name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        member_mother_name.setText("Mother's Name");

        member_id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        member_id.setText("Student ID");

        member_session.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        member_session.setText("Session");

        member_blood_group.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        member_blood_group.setText("Blood Group");

        member_father_name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        member_father_name.setText("Father's Name");

        member_phone.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        member_phone.setText("Phone");

        member_gender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        member_gender.setText("Gender");

        member_department.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        member_department.setText("Department");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel27.setText("Transaction Number");

        member_tranc_no.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        member_tranc_no.setText("01700000000");

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
                    .addComponent(member_father_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(member_blood_group, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(member_gender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(member_batch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(member_session, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(member_department, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(member_phone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(member_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(member_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(member_email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(member_tranc_no, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(member_mother_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        memberInfoPanel_1Layout.setVerticalGroup(
            memberInfoPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, memberInfoPanel_1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(memberInfoPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(memberInfoPanel_1Layout.createSequentialGroup()
                        .addComponent(member_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(member_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(member_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(member_phone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(member_department, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(member_session, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(member_batch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(member_gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(member_blood_group, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(member_tranc_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(member_father_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(member_mother_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(20, 20, 20))
        );

        memberInfoFooterPanel.setBackground(new java.awt.Color(0, 102, 102));

        memberInfoApprove.setText("Approve");

        memberInfoCancel.setText("Cancel");

        javax.swing.GroupLayout memberInfoFooterPanelLayout = new javax.swing.GroupLayout(memberInfoFooterPanel);
        memberInfoFooterPanel.setLayout(memberInfoFooterPanelLayout);
        memberInfoFooterPanelLayout.setHorizontalGroup(
            memberInfoFooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberInfoFooterPanelLayout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addComponent(memberInfoApprove, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(memberInfoCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(417, 417, 417))
        );
        memberInfoFooterPanelLayout.setVerticalGroup(
            memberInfoFooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(memberInfoFooterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(memberInfoFooterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberInfoApprove)
                    .addComponent(memberInfoCancel))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        memberInfoPanel_2.setBackground(new java.awt.Color(108, 154, 165));

        jLabel25.setText("Present Address");

        member_present_address.setEditable(false);
        member_present_address.setColumns(20);
        member_present_address.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        member_present_address.setRows(5);
        member_present_address.setEnabled(false);
        jScrollPane1.setViewportView(member_present_address);

        jLabel26.setText("Permanent Address");

        member_permanent_address.setColumns(20);
        member_permanent_address.setRows(5);
        member_permanent_address.setEnabled(false);
        jScrollPane2.setViewportView(member_permanent_address);

        jLabel30.setText("Photo");

        member_photo.setBackground(new java.awt.Color(185, 183, 181));

        co_activy.setText("Co-activity");

        member_co_activity.setColumns(20);
        member_co_activity.setRows(5);
        member_co_activity.setEditable(false);
        jScrollPane3.setViewportView(member_co_activity);

        alumni.setText("Alumni");

        exe_member.setText("Executive Member");

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
                                .addComponent(member_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(memberInfoPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exe_member, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(member_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel30)))
                        .addContainerGap())
                    .addGroup(memberInfoPanel_2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(alumni)
                        .addGap(38, 38, 38)
                        .addComponent(exe_member)
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
                .addGroup(memberViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(memberViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE))
        );
        mainContentPanelLayout.setVerticalGroup(
            mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registeredListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(welcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(memberViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE))
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

    private void member_nameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_member_nameInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_member_nameInputMethodTextChanged
 //====Don't Modify==========//
  
    
    
 //================All Event Listener Methods are here============//
    public void addVerifyListener(ActionListener ae){
        this.btnVerify.addActionListener(ae);
    }
    public void addMemberApproveListener(ActionListener ae){
        this.memberInfoApprove.addActionListener(ae);
    }
    public void addMemberCancelApproveListener(ActionListener ae){
        this.memberInfoCancel.addActionListener(ae);
    }
    
    public void addRegisteredMemberTable(MouseListener me){
        this.registeredMemberTable.addMouseListener(me);
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
   
//=========================================================//

    public void setMemberViewPanel(AssocMember memberInfo) {
        member_name.setText(memberInfo.getName());
        member_id.setText(memberInfo.getId());
        member_email.setText(memberInfo.getEmail());
        member_phone.setText(memberInfo.getPhone());
        member_department.setText(memberInfo.getDept());
        member_session.setText(memberInfo.getSession());
        member_batch.setText(memberInfo.getBatch());
        member_gender.setText(memberInfo.getGender());
        member_blood_group.setText(memberInfo.getBg());
        member_tranc_no.setText(memberInfo.getTranc_no());
        member_father_name.setText(memberInfo.getFathersname());
        member_mother_name.setText(memberInfo.getMothersname());
        member_present_address.setText(memberInfo.getPresent_details());
        member_permanent_address.setText(memberInfo.getPermanent_details());
        member_co_activity.setText(memberInfo.getCo_activity());
        member_photo.setIcon(memberInfo.getPhoto(memberInfo.getPhotoByte()));
    }

    public void setRegisteredListPanel(DefaultTableModel registeredTableModel) {
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
    public JButton getMemberInfoCancel() {
        return memberInfoCancel;
    }
    
    //check box
    public JCheckBox getAlumni() {
        return alumni;
    }
    public JCheckBox getExe_member() {
        return exe_member;
    }    
    
    //label
    public JLabel getMember_email() {
        return member_email;
    }

    public JLabel getMember_id() {
        return member_id;
    }
    
 //========================================================//
    



   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alumni;
    private javax.swing.JButton btnVerify;
    private javax.swing.JLabel co_activy;
    private javax.swing.JPanel creditPanel;
    private javax.swing.JCheckBox exe_member;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel mainContentPanel;
    private javax.swing.JButton memberInfoApprove;
    private javax.swing.JButton memberInfoCancel;
    private javax.swing.JPanel memberInfoFooterPanel;
    private javax.swing.JLabel memberInfoHeader;
    private javax.swing.JPanel memberInfoHeaderPanel;
    private javax.swing.JPanel memberInfoPanel_1;
    private javax.swing.JPanel memberInfoPanel_2;
    private javax.swing.JPanel memberViewPanel;
    private javax.swing.JLabel member_batch;
    private javax.swing.JLabel member_blood_group;
    private javax.swing.JTextArea member_co_activity;
    private javax.swing.JLabel member_department;
    private javax.swing.JLabel member_email;
    private javax.swing.JLabel member_father_name;
    private javax.swing.JLabel member_gender;
    private javax.swing.JLabel member_id;
    private javax.swing.JLabel member_mother_name;
    private javax.swing.JLabel member_name;
    private javax.swing.JTextArea member_permanent_address;
    private javax.swing.JLabel member_phone;
    private javax.swing.JLabel member_photo;
    private javax.swing.JTextArea member_present_address;
    private javax.swing.JLabel member_session;
    private javax.swing.JLabel member_tranc_no;
    private javax.swing.JPanel registeredListPanel;
    private javax.swing.JTable registeredMemberTable;
    private javax.swing.JPanel sidebarPanel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables


}
