package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDaoImpl;

public class WithdrawAmount {
	
	public void withdraw() {
		
		try {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Account ID : ");
			int useraccountID=scanner.nextInt();
			System.out.println("Enter Withdraw Ammount :");
			double userWithdrawAmount=scanner.nextInt();
			
			
			String result=new AccountDaoImpl().withdraw(userWithdrawAmount, useraccountID);
			
			System.out.println(result);
			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
		
	}
	
}
