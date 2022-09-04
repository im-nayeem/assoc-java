package com.association.database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {

    private final String dbAddr = "jdbc:mysql://127.0.0.1:3306/association";
    private final String uname = "root";
    private final String pass = "";
    private Connection conn;
    private Statement statement;
    private PreparedStatement preparedStatement;

    /**
     * Constructor *
     */
    public DatabaseConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbAddr, uname, pass);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e + "\nCouldn't Connect With Database");
        }

    }

    /**
     * ============Getter Methods==============
     */
    Connection getConn() {
        return conn;
    }

    public Statement getStatement() {

        try {
            statement = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e.toString() + "\nCouldn't Create Statement");
        }
        return statement;
    }

    /**
     * *
     * Getter method for preparedStatement
     *
     * @return preparedStatement
     */
    public PreparedStatement getPreparedStatement(String query) {
        try {
            preparedStatement = conn.prepareStatement(query);
        } catch (SQLException e) {
        }
        return preparedStatement;
    }

    public void close(){
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * =====================================*
     */
    public String getColumnValueByKey(String tableName, String requiredFieldName, String key, String value) {
        String query = "Select " + requiredFieldName + " FROM " + tableName + " WHERE " + key + " = '" + value + "';";
        try {
            ResultSet rs = this.getPreparedStatement(query).executeQuery();
            if (rs.next()) {
                return rs.getString(requiredFieldName);
            } else {
                return "no record";
            }
        } catch (SQLException ex) {
            return "Error! " + ex.getMessage();
//            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
