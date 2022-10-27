package com.masai;

public class Teacher implements CEO{
	
	public void teaches(){
		 System.out.println("Teacher teaches.");
		}

	@Override
	public void call() {
		teaches();
		
	}

}
