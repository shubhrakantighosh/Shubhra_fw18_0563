package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDaoImpl;

public class DepositAmount {
	
	public void deposit() {
			
		try {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Account ID : ");
			int useraccountID=scanner.nextInt();
			System.out.println("Enter Deposit Ammount :");
			double userDepositAmount=scanner.nextInt();
			
			
			String result=new AccountDaoImpl().deposit(userDepositAmount, useraccountID);
			
			System.out.println(result);
			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	
}
