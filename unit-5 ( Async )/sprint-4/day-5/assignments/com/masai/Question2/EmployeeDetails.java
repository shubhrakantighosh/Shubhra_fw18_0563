package com.masai.Question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		
		try {
			new Driver();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/day3";

		try (Connection connection=DriverManager.getConnection(url,"root","root")) {
			
			PreparedStatement preparedStatement=connection.prepareStatement("select * from employee where deptid in(select did from department where employee.deptid=department.did);");
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				int employeeId=resultSet.getInt("empld");
				String employeeName=resultSet.getString("ename");
				String employeeAddress=resultSet.getString("address");
				String employeeMobileNumber=resultSet.getString("mobile");
				int employeeDepartmentId=resultSet.getInt("deptid");
				
				System.out.println("Employee ID :"+employeeId+" ,Name : "+employeeName+" , Address : "+employeeAddress+" , Mobile Number : "+employeeMobileNumber+" ,DepartmentID : "+employeeDepartmentId);
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

}
