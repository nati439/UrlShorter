package model;

import db.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public void testQuery() {
        String sql = "SELECT 1";

        try (Connection con = DatabaseConnection.getConnection();
 //Calls your utility method to open a physical socket connection to MySQL.
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                System.out.println("UserDAO Query Success! Output: " + rs.getInt(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}