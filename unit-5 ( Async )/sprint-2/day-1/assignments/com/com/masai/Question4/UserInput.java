package com.masai.Question4;

import java.util.Scanner;

public class UserInput {
	
	public int divided(int number1, int number2)throws ArithmeticException {
		int diff=0;
		
		if(number1>number2) {
			diff=number1/number2;
			
		}else {
			ArithmeticException ae=new ArithmeticException("DivideByZeroException caught");
			throw ae;
		}
		
		return diff;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First Number");
		int number1=scanner.nextInt();
		System.out.println("Enter Secound Number");
		int number2=scanner.nextInt();
		
		try {
			int diff=new UserInput().divided(number1, number2);
			System.out.println("The quotient of "+number1+"/"+number2+" "+diff );
			
		} catch (ArithmeticException ae) {
			
			System.out.println(ae.getMessage());
			
		} finally {
			System.out.println("Inside finally block");
		}
	}
}
