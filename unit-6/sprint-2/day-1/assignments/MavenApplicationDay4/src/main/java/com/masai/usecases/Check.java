package com.masai.usecases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;

public class Check {
	
	public static void main(String[] args) throws EmployeeException {
		
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		
		Employee employee=new Employee();
		employee.setEmpId(2);
		employee.setName("ram");
		employee.setAddress("Asia");
		employee.setSalary(900);
		
		Employee employee2=employeeDao.updateEmployee(employee);
		System.out.println(employee2);
	}
	
}
