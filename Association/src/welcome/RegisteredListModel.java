/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome;

import database.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * RegisteredListModel the model class containing all registered but unverified members List
 * @author Nayeem
 */
public class RegisteredListModel {
    
    private List<AssocMember>registeredList = new ArrayList<>();
    public RegisteredListModel(){
        // retrieve all the registered members List from DB
        
        //extract a single result from ResultSet
        // for loop:
        //      registeredList.add(new AssocMember(result));
        
        
        
        try {
            DatabaseConnection conn = new DatabaseConnection();
            Statement stmt= conn.getStatement();
            ResultSet rs =  stmt.executeQuery("SELECT * FROM members");
            rs.next();
        }
        catch (SQLException e) {
//            System.out.println(e);
            throw new RuntimeException(e.toString()+"\nProblem with executing query.");
        }
    }
}
