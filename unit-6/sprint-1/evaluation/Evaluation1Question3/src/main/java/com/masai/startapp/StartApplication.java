package com.masai.startapp;

import java.util.Scanner;

import com.masai.usecases.DeleteAccount;
import com.masai.usecases.DepositAmount;
import com.masai.usecases.FindAccount;
import com.masai.usecases.RegisterAccount;
import com.masai.usecases.WithdrawAmount;

public class StartApplication {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try {
			
			while(true) {
				
				System.out.println("Find Account By Account ID , Enter : 1.");
				System.out.println("Register a New Account , Enter : 2.");
				System.out.println("Delete Account By Account ID , Enter : 3.");
				System.out.println("Withdraw Ammount By Account ID , Enter : 4.");
				System.out.println("Deposit Ammount By Account ID , Enter : 5.");
				
				int userInput=scanner.nextInt();
				
				switch(userInput) {
				
				case 1 :
					new FindAccount().searchAccount();
					break;
					
				case 2 :
					new RegisterAccount().saveaccount();
					break;	
				
				case 3 :
					new DeleteAccount().deleteAccountByID();
					break;
					
				case 4 :
					new WithdrawAmount().withdraw();
					break;
					
				case 5 :
					new DepositAmount().deposit();
					break;
					
				default:
					System.out.println("Don't Enter Wrong Key.");
					break;
				
				}
				
				System.out.println("To Exit Enter : 'Yes'.");
				String userExitOrNot=scanner.next();
				
				if(userExitOrNot.equalsIgnoreCase("Yes")) {
					break;
				}
				
				
			}
			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	
}
