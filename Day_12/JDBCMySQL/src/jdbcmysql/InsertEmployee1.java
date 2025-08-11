package jdbcmysql;
import java.sql.*;
public class InsertEmployee1 {
	public void insertRecords() {
        JDBCConnection db = new JDBCConnection();
        
        try {
        	Connection con = db.getConnection(); 
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO employee1 VALUES (1001, 'Smith', 200000)");
            st.executeUpdate("INSERT INTO employee1 VALUES (1002, 'Martin', 300000)");
            st.executeUpdate("INSERT INTO employee1 VALUES (1003, 'Alex', 400000)");
            st.executeUpdate("INSERT INTO employee1 VALUES (1004, 'Turner', 500000)");
            st.executeUpdate("INSERT INTO employee1 VALUES (1005, 'Steve', 600000)");
            st.executeUpdate("INSERT INTO employee1 VALUES (1006, 'Kavin', 700000)");
            st.executeUpdate("INSERT INTO employee1 VALUES (1007,'Tom', 800000)");
            st.executeUpdate("INSERT INTO employee1 VALUES (1008, 'Harry', 950000)");

            System.out.println("Employee1 records inserted.");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
