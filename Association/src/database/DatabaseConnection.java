
package database;


import association.Association;
import java.sql.*;

public class DatabaseConnection {
    
    //do manually for current use,it will be updated later
    private final String dbAddr = "jdbc:mysql://"+Association.prefs.get("dbAddr", "")+"?allowMultiQueries=true";
    private final String uname = Association.prefs.get("dbUserName", "");
    private final String pass = Association.prefs.get("dbPass", "");
    private Connection conn;
    private  Statement statement;
    private  PreparedStatement preparedStatement;


    /** Constructor **/
    public DatabaseConnection(){

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbAddr, uname, pass);
        }
        catch(ClassNotFoundException | SQLException e) {
            System.out.println(dbAddr+" \n"+uname+"\n"+pass);
            System.out.println(e);
//            throw new RuntimeException(e+"\nCouldn't Connect With Database");
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
            throw new RuntimeException(e.toString()+"\nCouldn't Create Statement");
        }
        return statement;
    }

    /***
     * Getter method for preparedStatement
     * @return preparedStatement
     * @param query ...
     */
    public PreparedStatement getPreparedStatement(String query) {
        try {
            preparedStatement = conn.prepareStatement(query);
        } catch (SQLException e) {
        }
        return preparedStatement;
    }
    public void close(){
        try 
        {
            conn.close();
        } 
        catch (SQLException ex) 
        {
            throw new RuntimeException(ex.toString()+"...");
        }
    }

/**=====================================**/

}

