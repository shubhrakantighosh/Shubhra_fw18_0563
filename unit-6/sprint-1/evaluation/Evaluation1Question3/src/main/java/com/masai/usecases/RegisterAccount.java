package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class RegisterAccount {
	public void saveaccount() {
		
		try {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Account ID : ");
			int useraccountID=scanner.nextInt();
			System.out.println("Enter Email ID : ");
			String userEmailID=scanner.next();
			System.out.println("Enter Address : ");
			String userAddress=scanner.next();
			System.out.println("Enter Balance Amount : ");
			double userBalance=scanner.nextInt();
			
			Account account=new Account(useraccountID,userEmailID,userAddress,userBalance); 
			String result=new AccountDaoImpl().save(account);
			
			System.out.println(result);
			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
	}
}
