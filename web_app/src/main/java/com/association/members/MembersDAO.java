package com.association.members;

import com.association.database.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 * Created on 07-Sep-22
 *
 * @author Nayeem
 */
public class MembersDAO {
    private DatabaseConnection conn;

    public MembersDAO() {
        conn = new DatabaseConnection();

    }
    
    private Vector<AssocMember>assocMemberList = new Vector<>();

    
    public Vector<AssocMember> getAssocMemberList() {
        try {
            ResultSet rs = conn.executeQuery("SELECT * FROM members WHERE id IN(SELECT id FROM verified);");
            
            while(rs.next()){
                AssocMember assocMember = new AssocMember();
                assocMember.setName(rs.getString("name"));
                assocMember.setId(rs.getString("id"));
                assocMember.setEmail(rs.getString("email"));
                assocMember.setPhone(rs.getString("phone"));
                assocMember.setDept(rs.getString("dept"));
                assocMember.setSession(rs.getString("session"));
                assocMember.setBatch(rs.getString("batch"));
                assocMember.setGender(rs.getString("gender"));
                assocMember.setBloodGroup(rs.getString("bg"));
                assocMember.setPhoto(rs.getBinaryStream("photo"));
                assocMember.setCoActivity(rs.getString("co_activity"));
                assocMember.setFathersName(rs.getString("fathersname"));
                assocMember.setMothersName(rs.getString("mothersname"));
                assocMember.setPresentArea(rs.getString("present_area"));
                assocMember.setPresentDetails(rs.getString("present_details"));
                assocMember.setPermanentUpazila(rs.getString("permanent_upazila"));
                assocMember.setPermanentDetails(rs.getString("permanent_details"));
                assocMember.setTrancNo(rs.getString("tranc_no"));
                
                assocMemberList.add(assocMember);

            }
            
            return assocMemberList;
        } catch (SQLException ex) {
            throw  new RuntimeException(ex.getMessage());
        }
    }
    
    public Vector<AssocMember> getAssocMemberList(Vector<String>key, Vector<String> value){
        try {
            DatabaseConnection conn = new DatabaseConnection();
            String query = "SELECT * FROM members WHERE id IN(SELECT id FROM verified)";
            for(int i=0; i<key.size(); i++){
                query += " AND members."+key.get(i)+" = "+value.get(i);
            }
            query+=";";
            
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            ResultSet rs = pstmnt.executeQuery();
            
            while(rs.next()){
                AssocMember assocMember = new AssocMember();
                assocMember.setName(rs.getString("name"));
                assocMember.setId(rs.getString("id"));
                assocMember.setEmail(rs.getString("email"));
                assocMember.setPhone(rs.getString("phone"));
                assocMember.setDept(rs.getString("dept"));
                assocMember.setSession(rs.getString("session"));
                assocMember.setBatch(rs.getString("batch"));
                assocMember.setGender(rs.getString("gender"));
                assocMember.setBloodGroup(rs.getString("bg"));
                assocMember.setPhoto(rs.getBinaryStream("photo"));
                assocMember.setCoActivity(rs.getString("co_activity"));
                assocMember.setFathersName(rs.getString("fathersname"));
                assocMember.setMothersName(rs.getString("mothersname"));
                assocMember.setPresentArea(rs.getString("present_area"));
                assocMember.setPresentDetails(rs.getString("present_details"));
                assocMember.setPermanentUpazila(rs.getString("permanent_upazila"));
                assocMember.setPermanentDetails(rs.getString("permanent_details"));
                assocMember.setTrancNo(rs.getString("tranc_no"));
                
                assocMemberList.add(assocMember);

            }
            
            return assocMemberList;
        } catch (Exception ex) {
            throw  new RuntimeException(ex.getMessage());
        }
    }
    
    public MemberFilterValue getMemberFilterValue(){
        MemberFilterValue memberFilterValue = new MemberFilterValue();
        String query = "SELECT DISTINCT dept FROM members WHERE id IN(SELECT id FROM verified);";
        
        try {
            DatabaseConnection conn = new DatabaseConnection();
            
//            retrieve unique dept name list 
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            ResultSet rs = pstmnt.executeQuery();
            while(rs.next()){
                memberFilterValue.addToDeptList(rs.getString("dept"));
            }
            
//            retrieve unique session year list 
            query = "SELECT DISTINCT session FROM members WHERE id IN(SELECT id FROM verified);;";
            pstmnt = conn.getPreparedStatement(query);
            rs = pstmnt.executeQuery();
            while(rs.next()){
                memberFilterValue.addToSessionList(rs.getString("session"));
            }
            
//            retrieve unique present area list
            query = "SELECT DISTINCT present_area FROM members WHERE id IN(SELECT id FROM verified);";
            pstmnt = conn.getPreparedStatement(query);
            rs = pstmnt.executeQuery();
            while(rs.next()){
                memberFilterValue.addToPresentAreaList(rs.getString("present_area"));
            }
            
//            retrieve unique permanent Area list
            query = "SELECT DISTINCT permanent_upazila FROM members WHERE id IN(SELECT id FROM verified);";
            pstmnt = conn.getPreparedStatement(query);
            rs = pstmnt.executeQuery();
            while(rs.next()){
                memberFilterValue.addToPermanentUpazilaList(rs.getString("permanent_upazila"));
            }
            return memberFilterValue;
            
        } catch (SQLException ex) {
            throw  new RuntimeException("error eita "+ex.getMessage());
        }
        
    }
    
    
}
