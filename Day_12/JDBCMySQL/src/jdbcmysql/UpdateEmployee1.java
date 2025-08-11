package jdbcmysql;
import java.sql.*;
public class UpdateEmployee1 {
	public void updateRecords() {
        JDBCConnection db = new JDBCConnection();
        try {
        	Connection con = db.getConnection();
            Statement st = con.createStatement();
            st.executeUpdate("UPDATE employee1 SET empSal = 900000 WHERE empId IN (1002, 1004)");
            st.executeUpdate("UPDATE employee1 SET empSal = 900000, empName = 'Martin Miller' WHERE empId = 1002");

            System.out.println("Employee1 records updated.");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
