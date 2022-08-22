package question4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class InsertStudentRecordsToTheTable {
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter RollNo");
		int rollNo=scanner.nextInt();
		System.out.println("Enter Name");
		String name=scanner.next();
		System.out.println("Enter Standard");
		String standard=scanner.next();
		System.out.println("Enter Date Of Birth as DD/MM/YYYY Format");
		String date_Of_Birth=scanner.next();
		System.out.println("Enter Fees");
		int fees=scanner.nextInt();
		
		
		
		try {
			Driver driver=new Driver();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/Shubhradb";
		
		try (Connection connection=DriverManager.getConnection(url,"root","root")){
			
			Statement statement=connection.createStatement();
			 PreparedStatement preparedStatement=connection.prepareStatement("insert into ABCdatabase values"
			 		+ "("+rollNo+","+name+","+standard+","+date_Of_Birth+","+fees+")");
			 
			 int x=preparedStatement.executeUpdate();
			 
			 if(x>0)System.out.println("Updated");
			 else System.out.println("Wrong Input");
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
