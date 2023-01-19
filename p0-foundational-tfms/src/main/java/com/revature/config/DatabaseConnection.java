package com.revature.config;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class DatabaseConnection {
	
	
	private static Connection connection= null;
	
	private DatabaseConnection() {
		
	}
	
	
	public static Connection getConnection() {
		if(connection == null) {

//		ResourceBundle resourceBundle=ResourceBundle.getBundle("tfms");
//
//		String driver=resourceBundle.getString("driver"); 
//		String dburl=resourceBundle.getString("dbur1");
//		String username = resourceBundle.getString("username");
//		String password=resourceBundle.getString("password");
		String dburl="jdbc:mysql://localhost:3306/tfms";
		String driver="com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="root";

		try {

		Class.forName (driver); 
		connection=DriverManager.getConnection (dburl, username, password);
		System.out.println("Connection Succesful");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		}
		return connection;
		
	}
	
	
}
	

	