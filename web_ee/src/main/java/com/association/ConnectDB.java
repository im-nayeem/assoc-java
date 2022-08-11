package com.association;

import java.sql.*;

public class ConnectDB {
    public static void main(String[] args) {
        String url="jdbc:mysql://127.0.0.1:3306/association";
        String uname="root";
        String pass="";
        String query="select name,id from student where id=11908002";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection conn = DriverManager.getConnection(url, uname, pass);

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
//            req.setAttribute("hello", rs.getString("name"));

            st.close();
            conn.close();
        }
        catch (SQLException e)
        {
            System.out.println("");
        }

    }
}

