package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;

public class BonusToEmployee {
	
	public void giveBonusToEmployee() {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Employee ID : ");
		int empId=scanner.nextInt();
		System.out.println("Enter Employee Bouns: ");
		int bonus=scanner.nextInt();
		
		try {
			String result=new EmployeeDaoImpl().giveBonusToEmployee(empId, bonus);
			System.out.println(result);
			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
		
	}

}
