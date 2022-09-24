package com.masai.Question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class InsertEmployee {
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Enter Employee ID ");
			int employeeId=scanner.nextInt();
			System.out.println("Enter Employee Name ");
			String employeeName=scanner.next();
			System.out.println("Enter Employee Address ");
			String employeeAddress=scanner.next();
			System.out.println("Enter Employee Mobile Number ");
			String employeeMobileNumber=scanner.next();
			System.out.println("Enter Employee Department ID ");
			int employeeDepartmentId=scanner.nextInt();
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			
			String url="jdbc:mysql://localhost:3306/day3";
			
			try (Connection connection=DriverManager.getConnection(url,"root","root")) {
				
				PreparedStatement preparedStatement=connection.prepareStatement("insert into Employee values (?,?,?,?,?)");
				
				preparedStatement.setInt(1, employeeId);
				preparedStatement.setString(2, employeeName);
				preparedStatement.setString(3, employeeAddress);
				preparedStatement.setString(4, employeeMobileNumber);
				preparedStatement.setInt(5, employeeDepartmentId);
				
				if(preparedStatement.executeUpdate()>0)
					System.out.println("Updated");
				else
					System.out.println("Not Updated");
				
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		
	}

}
