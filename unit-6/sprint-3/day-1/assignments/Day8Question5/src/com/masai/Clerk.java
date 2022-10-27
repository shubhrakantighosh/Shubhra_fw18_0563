package com.masai;

public class Clerk implements CEO{
	
	public void registerStudent(){
		 System.out.println("Enroll the Student in College.");
		}

	@Override
	public void call() {
		registerStudent();
		
	}
	
}
