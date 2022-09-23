package com.masai.dao;

import com.masai.model.Student;

public interface StudentDao {
	
//	public String insertStudentDetails(int roll, String name, String address, int marks);
	
	public String insertStudentDetails(Student student);
	
}
