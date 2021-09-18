package com.comviva.selflearning.jdbc;

import java.sql.*;

public class JDBCDemo {
	
	public static void main(String[] args) {
		
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from myjava.users");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) );
			}
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}