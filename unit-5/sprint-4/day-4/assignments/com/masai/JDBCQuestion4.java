package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class JDBCQuestion4 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee ID");
		int eid=scanner.nextInt();
		System.out.println("Enter Employee Name");
		String name=scanner.next();
		System.out.println("Enter Employee Address");
		String address=scanner.next();
		System.out.println("Enter Employee Salary");
		int salary=scanner.nextInt();
		
		try {
			Driver driver=new Driver();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/db2";
		
		try(Connection connection=DriverManager.getConnection(url,"root","root")) {
			
			Statement statement=connection.createStatement();
			PreparedStatement preparedStatement=connection.prepareStatement("insert into employee2 values(?,?,?,?)");
			preparedStatement.setInt(1, eid);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, address);
			preparedStatement.setInt(4, salary);
			
			int x=preparedStatement.executeUpdate();
			
			if(x>0) System.out.println(x+" Record Updated");
			else System.out.println("Wrong Input");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
