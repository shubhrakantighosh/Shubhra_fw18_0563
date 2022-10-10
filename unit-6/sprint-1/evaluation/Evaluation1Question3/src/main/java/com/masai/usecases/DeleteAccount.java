package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDaoImpl;

public class DeleteAccount {
	
	public void deleteAccountByID() {
		
		try {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Account ID : ");
			int useraccountID=scanner.nextInt();
			
		
			String result=new AccountDaoImpl().deleteAccountById(useraccountID);
			
			System.out.println(result);
			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	
}
