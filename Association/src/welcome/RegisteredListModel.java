/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;

import association.Association;
import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;

/**
 * RegisteredListModel the model class containing all registered but unverified members List
 * @author Nayeem
 */
public class RegisteredListModel {
    
    private List<AssocMember>registeredList = new ArrayList<>();
    public RegisteredListModel(){
        // retrieve all the registered members List from DB
        try {
            DatabaseConnection conn = new DatabaseConnection();
            Statement stmt= conn.getStatement();
            ResultSet rs =  stmt.executeQuery("SELECT * FROM members");
            rs.next();
        }
        catch (Exception e) {
            throw new RuntimeException(e.toString()+"\nProblem with executing query.");
        }
    }
//==============================store in DB=================================//    
    public String markAsVerified(String id, String email, boolean alumni, boolean ex_member){
        String query = "INSERT INTO verified VALUES(?,?,?,?,?);";
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            pstmnt.setString(1,id);
            pstmnt.setString(2,email);
            pstmnt.setBoolean(3,alumni);
            pstmnt.setBoolean(4,ex_member);
            pstmnt.setBoolean(5,ex_member);
            pstmnt.execute();
        } catch (SQLException e) {
            return "something wrong!!";
        }
        return "Thanks for approve.";
    }
    
    public String exeMemberInfo(ExecutiveMember exeMemberInfo){
        String query = "INSERT INTO exec_member VALUES(?,?,?,?,?);";
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            pstmnt.setString(1,exeMemberInfo.getStudentId());
            pstmnt.setString(2,exeMemberInfo.getEmail());
            pstmnt.setString(3,exeMemberInfo.getPostName());
            pstmnt.setString(4,exeMemberInfo.getStartDate());
            pstmnt.setString(5,exeMemberInfo.getEndDate());
            pstmnt.execute();
        } catch (Exception e) {
            return e.getMessage();
        }
        
        return "done";
    }
    
    public String alumniInfo(String id, String email){
        String query = "INSERT INTO alumni(id,email) VALUES(?,?);";
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            pstmnt.setString(1, id);
            pstmnt.setString(2,email);
            pstmnt.execute();
        } catch (Exception e) {
            return e.getMessage();
        }
        
        return "done";
    }
//--------------------------------------------------------------------------//

//=============================retrieve from DB ==========================//    
    public ArrayList<String[]> getRegisteredMemberList(){
        ArrayList<String[]> rows = new ArrayList<>();
        String query = "SELECT * FROM members WHERE NOT EXISTS "
			+ "(SELECT id FROM verified WHERE verified.id=members.id);";
        Preferences prefs=Preferences.userNodeForPackage(Association.class);
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            
            ResultSet rs = pstmnt.executeQuery();
            while(rs.next()){
                String row[] = new String[3];
                row[0] = rs.getString("name");
                row[1] = rs.getString("id");
                row[2] = rs.getString("email");
                rows.add(row);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());   
            return rows;
        }
        return rows;
    }
    
    public AssocMember getAssocMemberInfo(String email){
        AssocMember memberInfo = new AssocMember();
        String query = "SELECT * FROM members WHERE members.email='"+email+"';";
        Preferences prefs=Preferences.userNodeForPackage(Association.class);
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            
            ResultSet rs = pstmnt.executeQuery();
            while(rs.next()){
                memberInfo.setName(rs.getString("name"));
                memberInfo.setId(rs.getString("id"));
                memberInfo.setEmail(rs.getString("email"));
                memberInfo.setPhone(rs.getString("phone"));
                memberInfo.setDept(rs.getString("dept"));
                memberInfo.setSession(rs.getString("session"));
                memberInfo.setBatch(rs.getString("batch"));
                memberInfo.setGender(rs.getString("gender"));
                memberInfo.setBg(rs.getString("bg"));
                memberInfo.setPhotoByte(rs.getBytes("photo"));
                memberInfo.setCo_activity(rs.getString("co_activity"));
                memberInfo.setFathersname(rs.getString("fathersname"));
                memberInfo.setMothersname(rs.getString("mothersname"));
                memberInfo.setPresent_area(rs.getString("present_area"));
                memberInfo.setPresent_details(rs.getString("present_details"));
                memberInfo.setPermanent_upazila(rs.getString("permanent_upazila"));
                memberInfo.setPermanent_details(rs.getString("permanent_details"));
                memberInfo.setTranc_no(rs.getString("tranc_no"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());   
            return memberInfo;
        }
        
        return memberInfo;
    }
//----------------------------------------------------------------------------//
    
//===============================Delete from DB===============================//
    public String deleteMemberRow(String email){
        String query = "DELETE FROM members WHERE email='"+email+"';";
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            pstmnt.execute();
        } catch (Exception e) {
            return e.toString();
        }
        return "done";
    }
}
