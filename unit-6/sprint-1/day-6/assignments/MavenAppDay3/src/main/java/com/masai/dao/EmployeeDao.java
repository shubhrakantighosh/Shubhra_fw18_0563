package com.masai.dao;

import com.masai.entities.Employee;
import com.masai.exceptions.EmployeeException;

public interface EmployeeDao {
	
	 public void save(Employee emp) throws EmployeeException;
	 public String getAddressOfEmployee(int empId) throws EmployeeException;
	 public String giveBonusToEmployee(int empId, int bonus) throws EmployeeException;
	 public boolean deleteEmployee(int empId) throws EmployeeException;
	 
}
