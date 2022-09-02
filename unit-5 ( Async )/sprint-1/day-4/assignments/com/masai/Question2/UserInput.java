package com.masai.Question2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Your Date Of Birth as Format dd-MM-yyyy");
		String inputUserDateOfBirth=scanner.next();
		LocalDate localDate=LocalDate.now();
		
		try {
			LocalDate checkUserBirth=LocalDate.parse(inputUserDateOfBirth,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			if(localDate.getYear()<=checkUserBirth.getYear()) {
				System.out.println("Date should not be in Future");
				
			}else System.out.println("Your age is "+(localDate.getYear()-checkUserBirth.getYear()));
			
		} catch (Exception e) {
			System.out.println("Please enter the date in correct format");
		}
		
		
	}
	
}
