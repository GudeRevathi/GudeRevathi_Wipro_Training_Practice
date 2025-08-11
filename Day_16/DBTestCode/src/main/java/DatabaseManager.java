package main.java;

import java.sql.*;


public class DatabaseManager {
    private Connection con;

    // Connect to the database
    public void connect() throws SQLException {
    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_selenium", "root", "Qiscet@1920");

    }

    // 1. Insert data
    public int insertData(int id, String name) throws SQLException {
        String query = "INSERT INTO student (id, name) VALUES (?, ?)";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(1, id);
        stmt.setString(2, name);
        return stmt.executeUpdate();
    }

    // 2. Update data
    public int updateData(int id, String newName) throws SQLException {
        String query = "UPDATE users SET name = ? WHERE id = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, newName);
        stmt.setInt(2, id);
        return stmt.executeUpdate();
    }

    // 3. Delete data
    public int deleteData(int id) throws SQLException {
        String query = "DELETE FROM users WHERE id = ?";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(1, id);
        return stmt.executeUpdate();
    }

    // Close connection
    public void closeConn() throws SQLException {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }
}
