package com.masai.dao;

import java.util.Set;

import com.masai.dao.exceptions.EmployeeException;
import com.masai.model.Address;
import com.masai.model.Employee;

public interface EmployeeDao {
	
	public Employee saveEmployee(Employee employee) throws EmployeeException;
	public Set<Address> addresses(Employee employee) throws EmployeeException;
	
}
