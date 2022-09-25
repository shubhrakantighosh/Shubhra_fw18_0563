package com.masai.Question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class DeleteFromTable {
	
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Enter the query based on the employee table it will delete");
			String inputUser=scanner.nextLine();
				try {
					new Driver();
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
			
			String url="jdbc:mysql://localhost:3306/day3";
			
			try (Connection connection=DriverManager.getConnection(url,"root","root")) {
				
				PreparedStatement preparedStatement=connection.prepareStatement(inputUser);
               
				if(preparedStatement.executeUpdate()>0)
					System.out.println("Done..");
				else
					System.out.println("Check your syntax");
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		
	}

}
