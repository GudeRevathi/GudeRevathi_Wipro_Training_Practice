package jdbcmysql;
 
import java.sql.*;
public class PreparedStatementEx1{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/java_selenium"; // Replace with your DB URL
        String user = "root";
        String password = "Qiscet@1920";
 
        String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
        String delSQL ="delete from users where name=?";
        //String updSQL="update users set name=? where name='Harry Potter'";
        String updSQL="update users set NAME=? where id=8";
        try(
        		Connection conn = DriverManager.getConnection(url, user, password);
        		PreparedStatement pstmtIns = conn.prepareStatement(insertSQL);
        		PreparedStatement pstmtDel = conn.prepareStatement(delSQL);
        		PreparedStatement pstmtUpd= conn.prepareStatement(updSQL);
        	) 	
        	{
            // Set values for the placeholders
        	pstmtIns.setString(1, "Adam");
        	pstmtIns.setString(2, "adam@example.com");
        	pstmtIns.addBatch();
        	pstmtIns.setString(1, "Kavin");
        	pstmtIns.setString(2, "kavin@example.com");
        	pstmtIns.addBatch();
        	pstmtIns.setString(1, "Miller");
        	pstmtIns.setString(2, "miller@example.com");
        	pstmtIns.addBatch();
        	pstmtIns.executeBatch();
        	//conn.commit();
        	System.out.println("Batch Executed Successfully");

          
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
