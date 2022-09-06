package com.masai.Questuion2;

public class CheckedAndUncheckedExceptions {
	
	public void CheckedEException() {
	
		System.out.println("Checked Exception Start");
		
		try {
			
			System.out.println(10/0);
			
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		
		System.out.println("Checked Exception End");

	}
	
	
	public void UnCheckedEException() throws ClassNotFoundException {
		
		
		Object obj=new Student;

		
	}
	
	public static void main(String[] args) {
		
		new CheckedAndUncheckedExceptions().CheckedEException();
		
		
		System.out.println("UnChecked Exception Start");
		
		try {
			
			new CheckedAndUncheckedExceptions().UnCheckedEException();
			
		} catch (ClassNotFoundException cnf) {
			
			System.out.println(cnf.getMessage());
		}
		
		System.out.println("UnChecked Exception End");
		
	}
}
