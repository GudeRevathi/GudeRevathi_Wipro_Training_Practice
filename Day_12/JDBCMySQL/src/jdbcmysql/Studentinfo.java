package jdbcmysql;
import java.sql.*;

public class Studentinfo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_selenium";
        String username = "root";
        String password = "Qiscet@1920";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, username, password);
            Statement st = c.createStatement();
            String createTable = "CREATE TABLE student (" +
                    "id INT," +
                    "name VARCHAR(50)," +
                    "age INT," +
                    "gender VARCHAR(10)," +
                    "email VARCHAR(100)," +
                    "phone VARCHAR(15)," +
                    "address VARCHAR(255)," +
                    "dob DATE," +
                    "branch VARCHAR(50)," +
                    "gpa DOUBLE)";
            st.executeUpdate(createTable);
            System.out.println("Table created successfully.");

            String insertData = "INSERT INTO student VALUES " +
                    "(1, 'Alice', 20, 'F', 'alice@example.com', '1234567890', 'City A', '2005-01-15', 'CSE', 8.5)," +
                    "(2, 'Bob', 21, 'M', 'bob@example.com', '1234567891', 'City B', '2004-03-12', 'ECE', 7.9)," +
                    "(3, 'Charlie', 22, 'M', 'charlie@example.com', '1234567892', 'City C', '2003-07-22', 'EEE', 8.1)," +
                    "(4, 'David', 23, 'M', 'david@example.com', '1234567893', 'City D', '2002-11-18', 'MECH', 7.5)," +
                    "(5, 'Eve', 20, 'F', 'eve@example.com', '1234567894', 'City E', '2005-06-30', 'CSE', 8.8)," +
                    "(6, 'Fiona', 21, 'F', 'fiona@example.com', '1234567895', 'City F', '2004-04-25', 'CSE', 9.0)," +
                    "(7, 'George', 22, 'M', 'george@example.com', '1234567896', 'City G', '2003-02-14', 'CIVIL', 7.7)," +
                    "(8, 'Hannah', 23, 'F', 'hannah@example.com', '1234567897', 'City H', '2002-08-19', 'ECE', 8.3)," +
                    "(9, 'Ivan', 21, 'M', 'ivan@example.com', '1234567898', 'City I', '2004-10-10', 'MECH', 7.2)," +
                    "(10, 'Judy', 22, 'F', 'judy@example.com', '1234567899', 'City J', '2003-12-05', 'EEE', 8.9)";
            int inserted = st.executeUpdate(insertData);
            System.out.println("Inserted " + inserted + " records.");
            String deleteQuery = "DELETE FROM student WHERE id IN (2, 4)";
            int deleted = st.executeUpdate(deleteQuery);
            System.out.println("Deleted " + deleted + " records.");
            String updateQuery = "UPDATE student SET name='Eve Adams', email='eve.adams@example.com', gpa=9.2 WHERE id=5";
            int updated = st.executeUpdate(updateQuery);
            System.out.println("Updated " + updated + " record(s).");
            String selqry="select * from student";
            ResultSet rs = st.executeQuery(selqry);
            try {
            		while(rs.next()) {
            			System.out.println(rs.getInt("id")+","+rs.getString("name")+","+rs.getInt("age")+","+rs.getString("gender")+","+rs.getString("email"));
            		}
            	}catch(SQLException ex) {
            		ex.printStackTrace();
            	}
            st.close();
            c.close();
            System.out.println("Database operations completed successfully.");

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
        }
    }
}

