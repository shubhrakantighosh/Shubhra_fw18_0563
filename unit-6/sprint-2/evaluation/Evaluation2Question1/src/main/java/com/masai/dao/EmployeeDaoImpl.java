package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.exceptions.DepartmentExcpetion;
import com.masai.exceptions.EmployeeException;
import com.masai.model.Department;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void addDepartment(Department dept) {
		EntityManager entityManager=EMUtil.provideEntityManager();
	
		entityManager.getTransaction().begin();
		entityManager.persist(dept);
		entityManager.getTransaction().commit();	
			
		System.out.println("Added Department : "+dept.getDeptName()+".");
			
		
		entityManager.close();
	}

	@Override
	public void addEmployee(Employee emp) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(emp);
		entityManager.getTransaction().commit();	
			
		System.out.println("Employee Added : "+emp.getEmpName()+".");
			
		
		entityManager.close();
		
	}

	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		Employee employee=entityManager.find(Employee.class, empId);
		Department department=entityManager.find(Department.class, deptId);
		
		System.out.println(employee);
		System.out.println(department);
		
		entityManager.close();
		
		
		
	}

	@Override
	public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentExcpetion {
		// TODO Auto-generated method stub
		return null;
	}

}
