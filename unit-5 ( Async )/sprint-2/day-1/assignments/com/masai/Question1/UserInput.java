package com.masai.Question1;

import java.util.Scanner;

public class UserInput {
	

	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an integer");
		
		String string=scanner.next();
		
		try {
			
			int number=Integer.parseInt(string);
			number=number*number;
			System.out.println("The square value is "+number);
			
		} catch (NumberFormatException nfe) {
			
			System.out.println("Entered input is not a valid format for an integer.");
		}
		
		System.out.println("The work has been done successfully");
		
	}

}
