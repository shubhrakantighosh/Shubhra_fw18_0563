package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class JDBCQuestion1 {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Employee ID");
		int id=scanner.nextInt();
		
		try {
			Driver driver=new Driver();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/db2";
		
		try (Connection connection=DriverManager.getConnection(url,"root","root")){
			
			
			Statement statement=connection.createStatement();
			
			PreparedStatement preparedStatement=connection.prepareStatement("select * from employee2 where eid="+id+"");
			
			ResultSet resultSet=preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				
				int eid=resultSet.getInt("eid");
				String name=resultSet.getString("name");
				String address=resultSet.getString("address");
				int salary=resultSet.getInt("salary");
				
				System.out.println("Employee ID "+eid+" Name "+name+" Address "+address+" Salary "+salary);
				
			}else System.out.println("Wrong Input");
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}
