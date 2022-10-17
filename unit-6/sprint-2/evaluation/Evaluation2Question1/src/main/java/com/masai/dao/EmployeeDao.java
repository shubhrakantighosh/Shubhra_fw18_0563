package com.masai.dao;

import java.util.List;

import com.masai.exceptions.DepartmentExcpetion;
import com.masai.exceptions.EmployeeException;
import com.masai.model.Department;
import com.masai.model.Employee;

public interface EmployeeDao {
	
	public void addDepartment(Department dept);
	public void addEmployee(Employee emp);
	public void registerEmployeeTODepartment(int empId, int deptId);
	public List<Employee> getAllEmployeeWithDeptName(String deptName)throws EmployeeException;
	public Department getDepartmentDetailsByEmployeeId(int empId)throws DepartmentExcpetion;
	
}
