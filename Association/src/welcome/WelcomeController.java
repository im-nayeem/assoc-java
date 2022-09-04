/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;

import ExecutiveController.ExecutiveMember;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
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
    
    private ExecutiveMember exeMemberInfo = new ExecutiveMember();
    private List<AssocMember>registeredList ;
    private int selectedIndexOfRegisteredList;
    public WelcomeController(WelcomeModel model,WelcomeHomeView view)
    {
        this.model = model;
        this.view = view;
        // add click action listener on verify button
        this.view.addVerifyListener(new CustomAction());
        this.view.addRegisteredMemberTable(new CustomAction());
        this.view.addMemberApproveListener(new CustomAction());
        this.view.addRejectMemberApproveListener(new CustomAction());
        this.view.addExeMemberListener(new CustomAction());
        this.view.addExeMemberInfoListener(new CustomAction());
        this.view.addExeMemberInfoCancelListener(new CustomAction());
    }
    
    public void start(){
        view.addWelcomePane();
        view.setVisible(true);
    }
    
    public void stop(){
        
    }
    
    
    //---------- for welcomeHomeView-----------//
    public DefaultTableModel getRegisteredTableModel(){
        view.getAlumni().setSelected(false);
        view.getExeMemberCheckBox().setSelected(false);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Student ID");
        model.addColumn("E-mail");
        
        if(registeredList==null || registeredList.size()==0){
            registeredList = this.regModel.getRegisteredMemberListFromDB();
        }
        for(AssocMember row:registeredList){
            String basicInfo[] = {row.getName(),row.getId(),row.getEmail()};
            model.addRow(basicInfo);
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
                try {
                    new AssocMember().markAsVerified(view.getMemberId().getText(), view.getMemberEmail().getText(),
                    view.getAlumni().isSelected(), view.getExeMemberCheckBox().isSelected());

                    //=====store executive member information in DB=================//
                    if(view.getExeMemberCheckBox().isSelected()){
                        try{
                            exeMemberInfo.setStudentId(view.getMemberId().getText());
                            exeMemberInfo.setEmail(view.getMemberEmail().getText());
                            exeMemberInfo.storeExeMemberInfo(exeMemberInfo);
                        }
                        catch(Exception e){
                            view.showDialogueMsg("Executive member can not be empty");
                            return;
                        }
                    }
                    //======store alumni information in DB=================//
                    if(view.getAlumni().isSelected()){
                        new AssocMember().storeAlumniInfo(view.getMemberId().getText(),view.getMemberEmail().getText());
                    }
//                    approved row remove from registeredList
                    WelcomeController.this.registeredList.remove(selectedIndexOfRegisteredList);
                    view.setRegisteredListPanel(WelcomeController.this.getRegisteredTableModel());
                    view.addRegisteredList();
                    view.repaint();
                } catch (Exception e) {
                    view.showDialogueMsg(e.toString());
                }
            }
        //================admin reject a member=================//
            else if(ae.getSource() == view.getRejectMember()){
                try {
                    new AssocMember().deleteMemberRow(view.getMemberEmail().getText());
                    
//                    rejected row remove from registeredList
                    WelcomeController.this.registeredList.remove(selectedIndexOfRegisteredList);
                    view.setRegisteredListPanel(WelcomeController.this.getRegisteredTableModel());
                    view.addRegisteredList();
                    view.repaint();
                } catch (Exception e) {
                    view.showDialogueMsg(e.toString());
                }
            }
        //================if executive member check box marked=================//
            else if(ae.getSource() == view.getExeMemberCheckBox()){
                view.addExeMemberInfoPanel();
                view.repaint();
            }
        //================executive member info add or cancel=================//
            else if(ae.getSource() == view.getExeMemberInfoBtn() || ae.getSource()==view.getExeMemberInfoCancelBtn()){
                if(ae.getSource() == view.getExeMemberInfoBtn()){
                    String postName = view.getExeMemberPostName().getText();
                    String startDate = view.getExeMemberStartDate().getText();
                    String endDate = view.getExeMemberEndDate().getText();
                    if(postName==null || postName.length()==0 || startDate==null || startDate.length()==0 || endDate==null || endDate.length()==0){
                        view.showDialogueMsg("Please fill out all fields or cancel");
                        return;
                    }
                    try{
                        exeMemberInfo.setPostName(postName);
                        exeMemberInfo.setStartDate(startDate);
                        exeMemberInfo.setEndDate(endDate);
                    }
                    catch(Exception e){
                        view.showDialogueMsg(e.getMessage());
                        view.addExeMemberInfoPanel();
                        view.repaint();
                        return;
                    }
                }
                else{
                    view.getExeMemberCheckBox().setSelected(false);
                }
                view.addMemberViewPanel();
                view.repaint();
            }
        }

        @Override
        public void mouseClicked(MouseEvent me) {
            if(me.getSource()==view.getRegisteredMemberTable()){
                try {
                    JTable target = (JTable) me.getSource();
                    DefaultTableModel tableModel = (DefaultTableModel) target.getModel();
                    String email = tableModel.getValueAt(target.getSelectedRow(), 2).toString();
                    AssocMember member = new AssocMember();

//                    get all information of a member using email
//                    linear search
                    for(int i=0; i<WelcomeController.this.registeredList.size(); i++){
                        if(WelcomeController.this.registeredList.get(i).getEmail().equals(email)){
                            selectedIndexOfRegisteredList = i;
                            break;
                        }   
                    }
                    member = WelcomeController.this.registeredList.get(selectedIndexOfRegisteredList);
                    if(member.getPhotoByte()==null){
                        view.showDialogueMsg("error "+member.getName());
                    }
                    else{
                        view.setMemberViewPanel(member);
                        view.addMemberViewPanel();
                        view.repaint();
                    }

                } catch (Exception e) {
                    view.showDialogueMsg("mouse click "+e.toString());
                }
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
