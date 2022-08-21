package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCQuestion6 {

	public static void main(String[] args) {
		
		try {
			Driver driver=new Driver();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/db2";
		
		try (Connection connection=DriverManager.getConnection(url,"root","root")){
			
			Statement statement=connection.createStatement();
			
			PreparedStatement preparedStatement=connection.prepareStatement("select * from employee2 where salary<80000");
			
			ResultSet resultSet= preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				int eid=resultSet.getInt("eid");
				String name=resultSet.getString("name");
				String address=resultSet.getString("address");
				int salary=resultSet.getInt("salary");
				
				System.out.println("ID "+eid+" Name "+name+" Address "+address+" Salary "+salary);
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
