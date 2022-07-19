package com.cg.client;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.util.DBUtil;

public class Client {
	
public static void main(String[] args) throws SQLException {
		
		Connection connection =DBUtil.getconnection();
		
		//checking the connection establishment
		if(connection !=null) {
			System.out.println("JDBC: Connection is established");
		}
		
		GetEmployee();
	}
		//Create Operation
		private static void addEmployee() throws SQLException 
		{
			Connection connection =DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqlinsert = "insert into employee(name,salary,bonus)" + "values('kapil',5000.00,900.00)";
			int executeupdate = stmt.executeUpdate(sqlinsert);
			if(executeupdate==1) {
				System.out.println("Entry is added");
			}
		}
		//Update Operation
		private static void UpdateEmployee() throws SQLException 
		{
			Connection connection =DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqlupdate = "update employee set bonus =100.00 where id=4";
			int executeupdate = stmt.executeUpdate(sqlupdate);
			if(executeupdate==1) {
				System.out.println("Update is successfull");
			}
		}
		//Delete Operation
		private static void DeleteEmployee() throws SQLException 
		{
			Connection connection =DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqldelete = "delete from employee where id =4";
			int executeupdate = stmt.executeUpdate(sqldelete);
			if(executeupdate==1) {
				System.out.println("Delete is successfull");
			}
		}
		
		//Retrieve Operation
		private static void GetEmployee() throws SQLException {
			Connection connection =DBUtil.getconnection();
			Statement stmt = connection.createStatement();
			String sqlretrieve="Select * from employee";
			ResultSet rs = stmt.executeQuery(sqlretrieve);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name= rs.getString("Name");
				Double salary = rs.getDouble("salary");
				Double bonus = rs.getDouble("bonus");
				System.out.println(id+" "+ name + " " + salary + " " + bonus);
			}
			
		}
		//RetrieveById Operation
		private static void RetrieveByIdEmployee() throws SQLException {
		Connection connection = DBUtil.getconnection();
		Statement stmt = connection.createStatement();
		String sqlretrieve = "select * from employee where id =3";
		ResultSet rs = stmt.executeQuery(sqlretrieve);
		if(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			Double salary = rs.getDouble("Salary");
			Double bonus = rs.getDouble("bonus");
			System.out.println(id + " " + name + " "+ salary +" "+ bonus);
		}
		else {
			System.out.println("Employee is not available with the mentioned ID...");
		}
	}

}
