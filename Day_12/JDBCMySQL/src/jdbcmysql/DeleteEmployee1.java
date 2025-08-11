package jdbcmysql;
import java.sql.*;
public class DeleteEmployee1 {
	public void deleteRecord() {
        JDBCConnection db = new JDBCConnection();
        try {
        	 Connection con = db.getConnection();
             Statement st = con.createStatement();

            st.executeUpdate("DELETE FROM employee1 WHERE empId = 1005");
            System.out.println("Deleted  record from employee1 where empId = 1005.");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
