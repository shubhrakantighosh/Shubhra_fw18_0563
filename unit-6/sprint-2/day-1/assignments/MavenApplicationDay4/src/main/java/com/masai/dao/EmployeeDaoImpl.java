package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		
		Employee employee2=null;
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		employee2=entityManager.find(Employee.class, employee.getEmpId());
		
		if(employee2==null) {
			
			entityManager.getTransaction().begin();
			entityManager.persist(employee);
			entityManager.getTransaction().commit();
			employee2=employee;
		}
		
		entityManager.close();
		
		return employee2;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		
		Employee employee2=null;
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		employee2=entityManager.find(Employee.class, empId);
		
		
		entityManager.close();
		
		return employee2;
		
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		Employee employee2=null;
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		employee2=entityManager.find(Employee.class, empId);
		
		if(employee2!=null) {
			
			entityManager.getTransaction().begin();
			entityManager.remove(employee2);
			entityManager.getTransaction().commit();
			
		}
		
		entityManager.close();
		
		return employee2;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		
		Employee employee2=null;
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		employee2=entityManager.find(Employee.class, employee.getEmpId());
		
		if(employee2!=null) {
			
			entityManager.getTransaction().begin();
			entityManager.merge(employee);
			entityManager.getTransaction().commit();
			
			employee2=employee;
		}
		
		entityManager.close();
		
		return employee2;
	}

}
