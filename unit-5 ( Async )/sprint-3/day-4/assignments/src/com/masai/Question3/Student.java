package com.masai.Question3;

import java.io.Serializable;

public class Student implements Serializable{
	
	int roll;
	String name;
	int marks;
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

}
