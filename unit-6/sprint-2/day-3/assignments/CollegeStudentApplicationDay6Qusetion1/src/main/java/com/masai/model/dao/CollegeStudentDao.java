package com.masai.model.dao;

import com.masai.model.College;

public interface CollegeStudentDao {
	
	public String save(College college);
	public void getAllStudentsByCollegeID();

}
