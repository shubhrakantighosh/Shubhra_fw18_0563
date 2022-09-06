package com.masai.Question3;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your account number");
		String accountNumber=scanner.next();
		System.out.println("Enter the amount want to deposit in your account");
		double accountDeposit=scanner.nextDouble();
		
		if(accountDeposit>=500) {
			
			System.out.println("Enter the withdraw amount");
			double withdrawAmount=scanner.nextDouble();
			
			Account account=new Account();
			account.accountNumber=accountNumber;
			account.deposit(accountDeposit);
			
			double currentBlance;
			try {
				
				currentBlance = account.withdraw(withdrawAmount);
				System.out.println("Your current blance is "+currentBlance);
				System.out.println("Withdraw amount is "+withdrawAmount);
				
			} catch (InsufficientFundsException ife) {
				
				System.out.println(ife.getMessage());
				
			}
			
		}else System.out.println("Minimum deposit should be INR 500 or above");
		
		
	}

}
