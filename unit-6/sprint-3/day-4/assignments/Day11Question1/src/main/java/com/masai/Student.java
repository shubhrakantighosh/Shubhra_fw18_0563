package com.masai;

public class Student {
	
	private int roll;
	private String name;
	private int maeks;
	
	
	public Student(int roll, String name, int maeks) {
		super();
		this.roll = roll;
		this.name = name;
		this.maeks = maeks;
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", maeks=" + maeks + "]";
	}

}
