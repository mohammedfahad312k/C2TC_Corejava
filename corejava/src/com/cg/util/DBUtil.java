package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
	private static final String db_driverclass="com.mysql.cj.jdbc.Driver";
	private static final String db_username="root";
	private static final String db_password="root";
	private static final String db_url="jdbc:mysql://localhost:3306/jdbcdb";
	private static Connection con;
	
	static {
	      try {
		        Class.forName(db_driverclass);  //Driver loading and Registering
		        con = DriverManager.getConnection(db_url,db_username,db_password); //Connection Establishment
	          } 
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
	}
	
	public static Connection getconnection() {
		return con; //Returns the established connection

	
	}

}
