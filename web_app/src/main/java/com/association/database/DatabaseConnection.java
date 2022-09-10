package com.association.database;

import java.sql.*;

public class DatabaseConnection {

    private final String dbAddr = "jdbc:mysql://127.0.0.1:3306/association?allowMultiQueries=true";
    private final String uname = "root";
    private final String pass = "";
    private Connection conn;
    private ResultSet rs;
    private PreparedStatement preparedStatement;

    /**
     * Constructor
     */
    public DatabaseConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbAddr, uname, pass);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e + "\nCouldn't Connect With Database");
        }

    }

     /** ============Methods==============*/
    public void execute(String query){
        try {
            Statement st = conn.createStatement();
             st.execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e.toString() + "\nCouldn't Create Statement");
        }
    }

    public ResultSet executeQuery(String query) {

        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery(query);
        } catch (SQLException e) {
            throw new RuntimeException(e.toString() + "\nCouldn't Create Statement");
        }
        return rs;
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
            rs.next();
                return rs.getString(requiredFieldName);
            } catch (Exception e) {
            throw new RuntimeException(e);
            }

    }
}
