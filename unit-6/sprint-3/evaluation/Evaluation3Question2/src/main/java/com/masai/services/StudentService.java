package com.masai.services;

import java.util.List;
import java.util.Map;

import com.masai.Course;
import com.masai.Student;


public class StudentService {
	
	private Map<Student, Course>theMap; // inject 3 entries with valid details
	private List<Student> theList; //inject List of 5 Student object
	private String appName; //inject the AppName from the properties file
	
	
	public Map<Student, Course> getTheMap() {
		return theMap;
	}
	
	public void setTheMap(Map<Student, Course> theMap) {
		this.theMap = theMap;
	}
	
	public List<Student> getTheList() {
		return theList;
	}
	
	public void setTheList(List<Student> theList) {
		this.theList = theList;
	}
	
	public String getAppName() {
		return appName;
	}
	
	public void setAppName(String appName) {
		this.appName = appName;
	}
	

}
