package com.masai.Question1;

import java.util.Scanner;

public class UserInput {
	
	public void SqureNumber(String string) throws NumberFormatException {
		
		int number=0;
		
		try {
			
			number=Integer.parseInt(string);
			System.out.println("The square value is "+number*number);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
			
		if(number==0){
			
			NumberFormatException nfe=new NumberFormatException("Entered input is not a valid format for an integer."+string);
			throw nfe;
			
		}

		System.out.println("The work has been done successfully");
	}
	

	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter an integer");
		
		String string=scanner.next();
		try {
			
			new UserInput().SqureNumber(string);
			
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		}
		
	}

}
