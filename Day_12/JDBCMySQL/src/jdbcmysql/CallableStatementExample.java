package jdbcmysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class CallableStatementExample {
   static Connection con=null;
	public static void main(String args[]) throws Exception {
	try {
		// Replace with your database name
       String url="jdbc:mysql://localhost:3306/java_selenium";
 
       // Replace with your MySQL username
       String username = "root";
 
       // Replace with your MySQL password
       String password = "Qiscet@1920";
 
	
       // Load MySQL Type-4 driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
 
         // Establish connection
         con = DriverManager.getConnection(url, username, password);
	  //Preparing a CallableStateement
      CallableStatement cstmt = con.prepareCall("{call myProcedure(?, ?, ?)}");
 
      String[] names = {"Harry", "Tom", "Potter"};
      int[] salaries = {2000, 6000, 1000};
      int[] ids = {101, 102, 103};

      for (int i = 0; i < names.length; i++) {
          cstmt.setString(1, names[i]);
          cstmt.setInt(2, salaries[i]);
          cstmt.setInt(3, ids[i]);
          cstmt.execute();
      }

      System.out.println("Rows inserted successfully.");
      
	}catch(SQLException se) {se.printStackTrace();}
	}
}
