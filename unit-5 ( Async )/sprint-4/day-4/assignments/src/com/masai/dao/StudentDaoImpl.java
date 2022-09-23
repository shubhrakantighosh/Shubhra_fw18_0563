package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.masai.model.Student;
import com.masai.utlity.DBUtil;

public class StudentDaoImpl implements StudentDao{

	@Override
//	public String insertStudentDetails(int roll, String name, String address, int marks) {
	public String insertStudentDetails(Student student {
		String result="Not inserted.......";
		
		
		try(Connection con=DBUtil.provideConnection()) {
			
			
			PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
			
//			ps.setInt(1, roll);
//			ps.setString(2, name);
//			ps.setString(3, address);
//			ps.setInt(4, marks)
			
			ps.setInt(1, student.getRoll());
			ps.setString(2, student.getName());
			ps.setString(3, student.getAddress());
			ps.setInt(4, student.getMarks());
			
			int x=ps.executeUpdate();
			
			if(x>0) System.out.println("inserted sucessfully");

			
		} catch (Exception e) {

			result=e.getMessage();
		}
		
		return result;
	}
	
	

}
