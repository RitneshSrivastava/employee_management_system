package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {
    private static final String URL = "jdbc:mysql://localhost:3306/employeesdb?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "Calcium@0";
    private static Connection connection = null;

    public static Connection getConnection() {
        if(connection == null){
            try {
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Successfully established the connection...");
            } catch (SQLException ex){
                System.out.println("Error while establishing connection: " + ex.getMessage());
                ex.printStackTrace(); // Print the full stack trace for debugging
                System.out.println(ex);
            }

        }
        return connection;
    }

}
