package com.masai.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void save(Employee emp) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("empUnit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Employee employee=entityManager.find(Employee.class, emp.getEmpId());
		
		if(employee==null) {
			
			entityManager.getTransaction().begin();
			entityManager.persist(emp);
			entityManager.getTransaction().commit();
			
			entityManager.close();
			
			System.out.println("Employee added.");
			
		}else System.out.println("Employee Already Exit.");
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		
		String message="Not Found";
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("empUnit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Employee employee=entityManager.find(Employee.class, empId);
		
		if(employee!=null) {
			message=employee.getAddress();
		}
		
		return message;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String message="Not Added";
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("empUnit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Employee employee=entityManager.find(Employee.class, empId);
		
		if(employee!=null) {
			
			entityManager.getTransaction().begin();
			employee.setSalary(employee.getSalary()+bonus);
			entityManager.getTransaction().commit();
			
			message="Bonus added";
		}
		
		entityManager.close();
		
		return message;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		
		boolean message=false;
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("empUnit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Employee employee=entityManager.find(Employee.class, empId);
		
		if(employee!=null) {
			
			entityManager.getTransaction().begin();
			entityManager.remove(employee);
			entityManager.getTransaction().commit();
			
			message=true;
		}
		
		entityManager.close();
		
		
		return message;
	}

}
