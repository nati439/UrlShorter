//This code creates a reusable method that connects your Java program to your MySQL nati database using the database URL, username, and password, then returns the connection.
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/nati";
    //URL stores the JDBC connection URL, which tells Java where the MySQL database is located.
    private static final String USER = "nati";
    private static final String PASSWORD = "nati123";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    //DriverManager.getConnection(...) attempts to connect using the URL, username, and password, then returns the Connection object.
}