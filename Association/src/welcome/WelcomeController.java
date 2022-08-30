/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nayeem
 */
public class WelcomeController {
    private WelcomeModel model;
    private WelcomeHomeView view;
    private RegisteredListModel regModel = new RegisteredListModel();
    
    private ExecutiveMember exeMemberInfo;
    public WelcomeController(WelcomeModel model,WelcomeHomeView view)
    {
        this.model = model;
        this.view = view;
        // add click action listener on verify button
        this.view.addVerifyListener(new CustomAction());
        this.view.addRegisteredMemberTable(new CustomAction());
        this.view.addMemberApproveListener(new CustomAction());
        this.view.addRejectMemberApproveListener(new CustomAction());
        this.view.addExe_memberListener(new CustomAction());
        this.view.addExe_MemberInfoListener(new CustomAction());
        this.view.addExe_MemberInfoCancelListener(new CustomAction());
    }
    
    public void start(){
        view.addWelcomePane();
        view.setVisible(true);
    }
    
    public void stop(){
        
    }
    
    
    //---------- for welcomeHomeView-----------//
    public DefaultTableModel getRegisteredTableModel(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Student ID");
        model.addColumn("E-mail");
        ArrayList<String[]> rows = this.regModel.getRegisteredMemberList();
        for(String[] row:rows){
            model.addRow(row);
        }
        return model;
    }
    

    //============Control event listener here==============//
    
    class CustomAction implements ActionListener, MouseListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
        //================ If clicked on verify button add registered list panel=================//
            if(ae.getSource() == view.getBtnVerify())
            {
                try{
                    view.setRegisteredListPanel(WelcomeController.this.getRegisteredTableModel());
                    view.addRegisteredList();
                    view.repaint();
                }
                catch(Exception e)
                {
                    view.showDialogueMsg(e.toString());
                }
            }
        //================admin approve a member=================//
            else if(ae.getSource()==view.getMemberInfoApprove()){
                regModel.markAsVerified(view.getMember_id().getText(), view.getMember_email().getText(),
                        view.getAlumni().isSelected(), view.getExe_member().isSelected());
                
                //=====store executive member information in DB=================//
                if(view.getExe_member().isSelected()){
                    exeMemberInfo.setStudentId(view.getMember_id().getText());
                    exeMemberInfo.setEmail(view.getMember_email().getText());
                    regModel.exeMemberInfo(exeMemberInfo);
                }
                //======store alumni information in DB=================//
                if(view.getAlumni().isSelected()){
                    regModel.alumniInfo(view.getMember_id().getText(),view.getMember_email().getText());
                }
                view.setRegisteredListPanel(WelcomeController.this.getRegisteredTableModel());
                view.addRegisteredList();
                view.repaint();
            }
        //================admin reject a member=================//
            else if(ae.getSource() == view.getRejectMember()){
                regModel.deleteMemberRow(view.getMember_email().getText());
                view.setRegisteredListPanel(WelcomeController.this.getRegisteredTableModel());
                view.addRegisteredList();
                view.repaint();
            }
        //================if executive member check box marked=================//
            else if(ae.getSource() == view.getExe_member()){
                view.addExeMemberInfoPanel();
                view.repaint();
            }
        //================executive member info add or cancel=================//
            else if(ae.getSource() == view.getExeMemberInfoBtn() || ae.getSource()==view.getExeMemberInfoCancelBtn()){
                if(ae.getSource() == view.getExeMemberInfoBtn()){
                    exeMemberInfo.setPostName(view.getExeMemberPostName().getText());
                    exeMemberInfo.setStartDate(view.getExeMemberStartDate().getText());
                    exeMemberInfo.setEndDate(view.getExeMemberEndDate().getText());
                }
                
                view.addMemberViewPanel();
                view.repaint();
            }
        }

        @Override
        public void mouseClicked(MouseEvent me) {
            if(me.getSource()==view.getRegisteredMemberTable()){
                JTable target = (JTable) me.getSource();
                String email = target.getModel().getValueAt(target.getSelectedRow(), 2).toString();
                AssocMember member = WelcomeController.this.regModel.getAssocMemberInfo(email);
                view.setMemberViewPanel(member);
                view.addMemberViewPanel();
                view.repaint();
            }
        }

        @Override
        public void mousePressed(MouseEvent me) {
            
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            
        }

        @Override
        public void mouseExited(MouseEvent me) {
            
        }
        
    }
    
    
    
    
    //============Control event listener here--------//

    
}
