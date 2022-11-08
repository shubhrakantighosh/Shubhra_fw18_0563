package com.masai.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;

public interface EmployeeService {

	public Employee registerEmployee(Employee emp)throws EmployeeException;
	public ResponseEntity<Employee> getEmployeeById(Integer empId)throws EmployeeException;
	public List<Employee> getAllEmployeeDetails()throws EmployeeException;
	public Employee deleteEmployeeById(Integer empId)throws EmployeeException;
	public Employee loginEmployee(String email, String password)throws EmployeeException;
	public List<Employee> getEmployeeDetailsByAddress(String address)throws EmployeeException;
	public Employee updateEmployee(Employee emp)throws EmployeeException;
	public String getNameAndAddressOfEmplyeeById(Integer empId)throws EmployeeException;
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee()throws EmployeeException;
	
}
