package com.masai.Question4;

import java.util.Comparator;

public class Student implements Comparator {
	
	private int roll;
	private String name;
	private int marks;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		return ((Student)o1).getMarks()>((Student)o2).getMarks() ? +1:-1;
	}

}
