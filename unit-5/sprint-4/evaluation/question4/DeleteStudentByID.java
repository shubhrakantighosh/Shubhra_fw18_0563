package question4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class DeleteStudentByID {
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter RollNo");
		int rollNo=scanner.nextInt();
				
		
		try {
			Driver driver=new Driver();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/Shubhradb";
		
		try (Connection connection=DriverManager.getConnection(url,"root","root")){
			
			Statement statement=connection.createStatement();
			 PreparedStatement preparedStatement=connection.prepareStatement("delete from ABCdatabase where rollNo=?");
			 preparedStatement.setInt(1, rollNo);
			 
			 int x=preparedStatement.executeUpdate();
			 if(x>0) System.out.println(rollNo+" Deleted From The Table");
			 
			 
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
