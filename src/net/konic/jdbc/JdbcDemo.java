package net.konic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) throws Exception {
// Step 1: Load driver
		Class.forName("com.mysql.cj.jdbc.Driver");
// Step 2: Create connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "Admin", "Haneef@123");
// Step 3: Create statement
		Statement stmt = con.createStatement();
// Step 4: Execute query
		ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
// Step 5: Process result
		while (rs.next()) {
			System.out.println(rs.getInt("empno") + " " + rs.getString("ename"));
		}
// Step 6: Close connection
		con.close();
	}
}