package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AccountDaoImpl;
import com.masai.entities.Account;

public class FindAccount {
	
	public void searchAccount() {
		
		try {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter Account ID : ");
			int userInput=scanner.nextInt();
			
			Account result=new AccountDaoImpl().findById(userInput);
			
			if(result==null) {
				System.out.println("Not Exists.");
				
			}else System.out.println(result);
			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
		
		
		
	}
	
}
