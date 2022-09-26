package com.masai.Question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentMumbai {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/day3";
		
		try (Connection connection=DriverManager.getConnection(url,"root","root")) {
			
			PreparedStatement preparedStatement=connection.prepareStatement("select did,dname,location from department JOIN employee on employee.deptid=department.did AND address='Mumbai';");
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				int did=resultSet.getInt("did");
				String dname=resultSet.getString("dname");
				String location=resultSet.getString("location");
				
				System.out.println("Department ID :"+did+" ,Name : "+dname+" , Address : "+location);
				
			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}
}
