package com.association;

import com.association.database.DatabaseConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created on 08-Sep-22
 *
 * @author Nayeem
 */
public class UserAccount {
    private String email;
    private  String key;
    private String salt;
    private  String role;

    public UserAccount(){

    }
    public UserAccount(String email,String password,String role){
        this.email = email;
        this.salt = SecurePassword.generateSalt(512).get();
        this.key  = SecurePassword.hashPassword(password,this.salt).get();
        this.role = role;
    }

    public UserAccount(String email, String key, String salt, String role) {
        this.email = email;
        this.key = key;
        this.salt = salt;
        this.role = role;
    }

    /**
     * Constructor
     * @param email the email used to retrieve an account from DB
     * @param role the role used to retrieve an account from DB
     */
    public UserAccount(String email,String role){
        try{
            DatabaseConnection conn = new DatabaseConnection();
            PreparedStatement pstmt = conn.getPreparedStatement("Select * from account where email=? and role=?");
            pstmt.setString(1,email);
            pstmt.setString(2,role);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            this.key = rs.getString("pass");
            this.salt = rs.getString("salt");
            this.email = email;
            this.role = role;

        }catch (Exception e){
            throw  new RuntimeException(e);
        }
    }

    /**======Methods======================*/
    public void storeAccount(){
            try{
                DatabaseConnection conn = new DatabaseConnection();
                PreparedStatement pstmt = conn.getPreparedStatement("INSERT into account (email,pass,salt,role) values(?,?,?,?)");
                pstmt.setString(1,this.email);
                pstmt.setString(2,this.key);
                pstmt.setString(3,this.salt);
                pstmt.setString(4,this.role);
                pstmt.execute();
            }catch (Exception e){
                throw  new RuntimeException(e);
            }
    }


    /**=======Getter==================*/
    public String getEmail() {
        return email;
    }

    public String getKey() {
        return key;
    }

    public String getSalt() {
        return salt;
    }

    public String getRole() {
        return role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
