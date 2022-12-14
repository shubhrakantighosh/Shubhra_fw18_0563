package com.masai.startapp;

import java.util.Scanner;

import com.masai.usecases.AddressOfEmployee;
import com.masai.usecases.BonusToEmployee;
import com.masai.usecases.DeleteEmployee;
import com.masai.usecases.SaveEmployee;

public class StartApp {
	
	public static void main (String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try {
			
			while(true) {
				
				System.out.println("Save Employee Enter : 1 ");
				System.out.println("Find Address Of Employee : 2 ");
				System.out.println("GiveBonus To Employee Enter : 3");
				System.out.println("Delete Employee Enter : 4");
				
				int userInput=scanner.nextInt();
				
				switch(userInput) {
				
				case 1:
					new SaveEmployee().save();
					break;
				
				case 2:
					new AddressOfEmployee().getAddressOfEmployee();
					break;	
				
				case 3:
					new BonusToEmployee().giveBonusToEmployee();
					break;	
					
				case 4:
					new DeleteEmployee().deleteEmployee();
					break;	
				
				default:
					System.out.println("Don't Enter Wrong Key .");
					break;
					
				}

				
				System.out.println("If you want to exit then Type : Yes");
				String userInputExitOrNot=scanner.next();
				
				if(userInputExitOrNot.equalsIgnoreCase("Yes")) {
					break;
				}
				
			}
			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
		
	}
	
}
