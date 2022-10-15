package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;

public class GetEmployee {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		try {
			
			System.out.println("Enter Employee ID :");
			int employeeID=scanner.nextInt();
			EmployeeDao employeeDao=new EmployeeDaoImpl();

			Employee employee= employeeDao.getEmployeeById(employeeID);
			
			System.out.println(employee);
			
		} catch (EmployeeException employeeException) {
			
			System.out.println(employeeException.getMessage());
		}
	}
}
