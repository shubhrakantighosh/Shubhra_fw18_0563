package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCConnection {
	
	public static void main(String[] args) {
		
		
		try {
			Driver driver=new Driver();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/db1";
		
		try (Connection connection=DriverManager.getConnection(url,"root","root")){
			
			System.out.println("It's connected to Database db1");
			
			Statement statement=connection.createStatement();
			
			int x=statement.executeUpdate("insert into employee values(1,'Shubhra','Kolkata',56000)");
			if(x>0)System.out.println("It's connected to Employee Table");
			else System.out.println("Wrong");
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}
