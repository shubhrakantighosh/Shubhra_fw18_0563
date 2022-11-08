package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.repo.EmployeeRepo;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@PostMapping("employee")
	public Employee registerEmployee(@Valid @RequestBody Employee employee){
		
		 employeeRepo.save(employee);
		
		return employee;
		
	}
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("empId") Integer empId) throws EmployeeException {
		
		Optional<Employee>optional=employeeRepo.findById(empId);
		
		Employee employee=optional.get();
		
		if(employee==null) {
			
			throw new EmployeeException("Employee not exists");
			
		}
		
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployee() throws EmployeeException {
		
		List<Employee>employees=employeeRepo.findAll();
		
		if(employees.size()==0) {
			throw new EmployeeException("Employees not exists");
		}
		
		return employees;
		
	}
	
	@DeleteMapping("/remove/{empId}")
	public Employee deeleteEmployee(@PathVariable("empId") Integer empId) throws EmployeeException {
		
		Employee employee=employeeRepo.findById(empId).get();
		
		if( employee!= null) {

			employeeRepo.deleteById(empId);

		}else {
			throw new EmployeeException("Employee not exists");
		}
		
		
		return employee;
		
	}
	
	
	@PutMapping("/employeeupdate")
	public Employee updateEmployee(@Valid @RequestBody Employee employee) {
		
		employeeRepo.save(employee);
		
		return employee;
		
	}
	
	
	@GetMapping("employee/address/{empId}")
	public String getNameAndAddressOfEmplyeeById(@PathVariable("empId") Integer empId) throws EmployeeException {
		
		Employee employee=employeeRepo.findById(empId).get();
		
		if(employee==null) {
			throw new EmployeeException("Employee not exists");
		}
		
		return employee.getAddress();
	}
	
	
	@GetMapping("/employeesNameAddressSalary")
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		
		List<Employee>employees=employeeRepo.findAll();
		
		List<EmployeeDTO>employeeDTOs=new ArrayList<>();
	
		EmployeeDTO dto=new EmployeeDTO();
		
		for(Employee employee:employees) {
			
			dto.setName(employee.getEmpName());
			dto.setAddress(employee.getAddress());
			dto.setSalary(employee.getSalary());
			
			employeeDTOs.add(dto);
			
		}
		
		if(employeeDTOs.size()==0) {
			throw new EmployeeException("Employees not exists");
		}
		
		return employeeDTOs;
		
	}
	
}
