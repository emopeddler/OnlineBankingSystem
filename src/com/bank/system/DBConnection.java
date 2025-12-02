// DBConnection.java
package com.bank.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/bank_db";
    private static final String USER = "root";
    private static final String PASSWORD = "mypass6299"; // <-- UPDATE WITH YOUR PASSWORD!

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("❌ DATABASE CONNECTION FAILED!");
            System.err.println("Error Message: " + e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        System.out.println("--- TESTING DATABASE CONNECTION ---");
        Connection testConn = getConnection();

        if (testConn != null) {
            System.out.println("✅ TEST SUCCESS: Database connection established.");
        } else {
            System.out.println("❌ TEST FAILURE: Could not connect to the database.");
        }

        try {
            if (testConn != null) testConn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}