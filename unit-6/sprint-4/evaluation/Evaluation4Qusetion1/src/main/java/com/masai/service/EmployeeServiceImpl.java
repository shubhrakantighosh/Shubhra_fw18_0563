package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.masai.EmployeeController;
import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	private EmployeeController employeeController;
	
	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {
		
		return employeeController.registerEmployee(emp);
		
	}

	@Override
	public ResponseEntity<Employee> getEmployeeById(Integer empId) throws EmployeeException {
		
		return employeeController.getEmployee(empId);
		
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		
		return employeeController.getAllEmployee();
		
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {

		return employeeController.deeleteEmployee(empId);
		
	}

	@Override
	public Employee loginEmployee(String email, String password) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		
		return employeeController.updateEmployee(emp);
		
	}

	@Override
	public String getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {

		return employeeController.getNameAndAddressOfEmplyeeById(empId);
		
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		
		return employeeController.getNameAddressSalaryOfAllEmployee();
		
	}

}
