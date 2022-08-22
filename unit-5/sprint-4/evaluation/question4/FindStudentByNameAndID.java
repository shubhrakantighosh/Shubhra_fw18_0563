package question4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class FindStudentByNameAndID {
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter RollNo");
		int rollNo=scanner.nextInt();
		System.out.println("Enter Student Name");
		String name=scanner.next();
				
		
		try {
			Driver driver=new Driver();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/Shubhradb";
		
		try (Connection connection=DriverManager.getConnection(url,"root","root")){
			
			Statement statement=connection.createStatement();
			 PreparedStatement preparedStatement=connection.prepareStatement(" select * from  "
			 		+ "ABCdatabase where Rollno=? && StudentName=?");
			 preparedStatement.setInt(1, rollNo);
			 preparedStatement.setString(2,name);
			 
			 ResultSet resultSet=preparedStatement.executeQuery();
			 
			 if(resultSet.next()) {
				 
				 System.out.println("Roll No "+resultSet.getInt("rollNo")+" Name "+resultSet.getString("StudentName")+
						 " Standard "+resultSet.getString("Standard")+
						 " Date Of Birth "+resultSet.getString("Date_Of_Birth")+" Fees "+resultSet.getInt("fees"));
				 
			 }
			 
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
