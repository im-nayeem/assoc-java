package com.association.database;

import java.sql.*;

public class DatabaseConnection {
    private final String dbAddr = "jdbc:mysql://127.0.0.1:3306/association";
    private final String uname = "root";
    private final String pass = "";
    private Connection conn;
    private  Statement statement;
    private  PreparedStatement preparedStatement;


   /** Constructor **/
    public DatabaseConnection() {

            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection(dbAddr, uname, pass);
            }
            catch(ClassNotFoundException e) {

            }
            catch(SQLException e) {

            }

    }

/**============Getter Methods==============*/
    Connection getConn() {
        return conn;
    }

    public Statement getStatement() {

        try {
            statement = conn.createStatement();
        }
        catch (SQLException e) {
        }
        return statement;
    }

    /***
     * Getter method for preparedStatement
     * @return preparedStatement
     */
    public PreparedStatement getPreparedStatement() {
        try {
            preparedStatement = conn.prepareStatement("");
        } catch (SQLException e) {
        }
        return preparedStatement;
    }

/**=====================================**/

}

