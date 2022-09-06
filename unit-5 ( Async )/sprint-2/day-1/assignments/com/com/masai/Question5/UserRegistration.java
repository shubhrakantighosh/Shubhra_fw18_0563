package com.masai.Question5;

import java.util.Scanner;

public class UserRegistration{

	public void UserRegistration(String username, String userCountry) throws InvalidCountryException{
		
		if(userCountry.equalsIgnoreCase("India")) {
		
			System.out.println("User registration done successfully");
			
		}else {
			InvalidCountryException ice=new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Your Country Name");
		String userCountry=scanner.next();
		System.out.println("Enter Your Name");
		String userName=scanner.next();
		
		
		try {
			new UserRegistration().UserRegistration(userName, userCountry);
		} catch (InvalidCountryException ice) {
			
			System.out.println(ice.getMessage());
			
		}
		
		System.out.println("Thank You!");
	}
	
}
