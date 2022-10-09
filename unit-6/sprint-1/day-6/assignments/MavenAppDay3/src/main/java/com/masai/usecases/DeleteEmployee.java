package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;

public class DeleteEmployee {
	
	public void deleteEmployee() {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Employee ID : ");
		int empId=scanner.nextInt();
		
		try {
			Boolean result=new EmployeeDaoImpl().deleteEmployee(empId);
			
			if(result) {
				System.out.println("Removed.");
				
			}else System.out.println("Not Removed.");
			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
	}

}
