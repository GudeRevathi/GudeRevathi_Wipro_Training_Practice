package jdbcmysql;
import java.sql.*;
public class DisplayEmployee1 {
	public void displayAll() {
        JDBCConnection db = new JDBCConnection();
        try {
        	 Connection con = db.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM employee1")) {

            System.out.println("EmpId   |    EmpName      | EmpSal");
            System.out.println("------------------------------------");
            while (rs.next()) {
            	System.out.println(rs.getInt("empid")+","+rs.getString("empname")+","+rs.getInt("empsal"));
            }con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
}
