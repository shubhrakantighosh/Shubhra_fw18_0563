package com.masai.Question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("start of main..");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1");
		String message = null;
		try {
			int num1 = sc.nextInt();
			System.out.println("Enter num2");
			int num2 = sc.nextInt();
			
			if(num2==0) {
				
				System.out.println("num2 should not be 0");
				
			}else {
				
			int num3 = num1/num2;
			if(num3 > 10){
				message = "Welcome to Exception Handling ";
				}
			}
			
		} catch (Exception e) {
			System.out.println("Please enter valid number");
		}
		
		System.out.println("Message is :"+message.toUpperCase());
		System.out.println("end of main");
	}

}
