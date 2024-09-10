package practice.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
	private static String JDBC_URL = "jdbc:mysql://localhost:3306/exam";
	private static String JDBC_USER = "root";
	private static String JDBC_PASS = "admin";
	private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
public static void main(String[] args) {
	Connection c;
	Statement s;
	ResultSet r;
	try {
		Class.forName(JDBC_DRIVER);
		c = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
		System.out.println("Database Connected Successfully");
		s = c.createStatement();
		String query = "select * from exam.students limit 10";
		r = s.executeQuery(query);
		while(r.next()) {
			System.out.println(r.getString("sapid")+" "+r.getString("firstName")+" "+r.getString("lastName"));
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
