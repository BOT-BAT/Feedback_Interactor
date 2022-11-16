package com.example.softwarequality.SoftwareQuality.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class MySQLDataConnection {
    String connectionUrl = "jdbc:mysql://localhost:3306/questionairesystem?useSSL=false";

    public Connection getConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(connectionUrl,"root","admin");
            Statement stmt=con.createStatement();
            return con;
        }
        catch (Exception ex)
        {
            System.out.println("" + ex);
        }
        return null;
    }
}
