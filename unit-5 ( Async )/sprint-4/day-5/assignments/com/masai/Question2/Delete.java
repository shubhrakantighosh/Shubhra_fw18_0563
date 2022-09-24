package com.masai.Question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {
	
	public static void main(String[] args) {
		
//		try (Scanner scanner = new Scanner(System.in)) {
//			
//			System.out.println("Enter the query based on the employee table it will delete");
//			String inputUser=scanner.next();
//
//			
//			try {
//				Class.forName("com.mysql.jdbc.Driver");
//			} catch (ClassNotFoundException e1) {
//
//				e1.printStackTrace();
//			}
			
			String url="jdbc:mysql://localhost:3306/day3";
			
			try (Connection connection=DriverManager.getConnection(url,"root","root")) {
				
				Statement statement=connection.createStatement();
               statement.executeUpdate("select * from employee where emplid=102;");
//				if(>0)
//					System.out.println("Done..");
//				else
//					System.out.println("Check your syntax");
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		
//	}

}
