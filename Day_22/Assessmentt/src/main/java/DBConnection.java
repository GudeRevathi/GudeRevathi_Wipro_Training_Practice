package main.java;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static String url  = "jdbc:mysql://localhost:3306/java_selenium";
	   
    static String username = "root";

    static String password = "Qiscet@1920";
    public static Connection getConnection() {
        Connection conn=null;
        try {
            conn = DriverManager.getConnection(url ,username,password);
//            System.out.println("Database Connected Successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}


