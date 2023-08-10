package com.association.database;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DatabaseConnection {

    private Connection conn;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;

    /**
     * Constructor
     */
    public DatabaseConnection() {

        try {
            Properties prop = new Properties();
            prop.load(DatabaseConnection.class.getClassLoader().getResourceAsStream("dbConfig.properties"));

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(prop.getProperty("db.url")+"?allowMultiQueries=true&characterEncoding=utf8",
                                                    prop.getProperty("db.username"),
                                                            prop.getProperty("db.password"));

        } catch (ClassNotFoundException | SQLException | IOException e) {
            throw new RuntimeException(e + "\nCouldn't Connect With Database");
        }

    }

     /** ============Methods==============*/
    public void execute(String query){
        try {
            Statement st = conn.createStatement();
             st.execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e + "\nCouldn't Create Statement");
        }
    }

    public ResultSet executeQuery(String query) {

        try {
            Statement st = conn.createStatement();
            resultSet = st.executeQuery(query);
        } catch (SQLException e) {
            throw new RuntimeException(e + "\nCouldn't Create Statement");
        }
        return resultSet;
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
