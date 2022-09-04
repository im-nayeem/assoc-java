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
    
    private List<AssocMember>registeredList ;
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

//=============================retrieve from DB ==========================//    
    public List<AssocMember> getRegisteredMemberListFromDB(){ 
        String query = "SELECT * FROM members WHERE NOT EXISTS "
			+ "(SELECT id FROM verified WHERE verified.id=members.id) ORDER BY members.id;";
        registeredList = new ArrayList<>();
        Preferences prefs=Preferences.userNodeForPackage(Association.class);
        try {
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmnt = conn.getPreparedStatement(query);
            ResultSet rs = pstmnt.executeQuery();
            
            while(rs.next()){
//                get value row by row and add to registered list
                AssocMember memberInfo = new AssocMember(rs);
                registeredList.add(memberInfo);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());   
            return registeredList;
        }
        return registeredList;
    }
//----------------------------------------------------------------------------//
}
