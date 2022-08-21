package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCQuestion3 {

	public static void main(String[] args) {
		
		try {
			Driver driver=new Driver();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/db2";
		
		try (Connection connection=DriverManager.getConnection(url,"root","root")){
			
			Statement statement=connection.createStatement();
			
			PreparedStatement preparedStatement=connection.prepareStatement("update employee2 set salary=salary+500");
			
			int salaryBouns=preparedStatement.executeUpdate();
			
			if(salaryBouns>0)System.out.println("Salary Bonus Updated");
			else System.out.println("Wrong");
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
