package com.jsp.servlet_simple_crud_operation.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentConnection {
	
	public static Connection getConnection() {
        Connection connection = null;
        String url="jdbc:/mysql:/localhost:3306:student";
        String user = "root";
        String pass = "root";
        try {
            // Load the JDBC driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database");
            e.printStackTrace();
        }
        return connection;
    }
}