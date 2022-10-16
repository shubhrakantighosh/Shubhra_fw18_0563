package com.masai.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.dao.exceptions.EmployeeException;
import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public String saveEmployee(Employee employee) throws EmployeeException {
		String message="Not added.";
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		if(employee!=null) {
			
			entityManager.getTransaction().begin();
			entityManager.persist(employee);
			entityManager.getTransaction().commit();
			
			message="Added";
			
		}else throw new EmployeeException("Don't enter null value.");
	
		
		entityManager.close();
		
		return message;
	}

	@Override
	public Set<Address> getAddresses(int cid) throws EmployeeException {
		Set<Address>addresses=new HashSet<>();
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		Employee employee=entityManager.find(Employee.class, cid);
		
		if(employee!=null) {
			
			TypedQuery<Employee> typedQuery=entityManager.createQuery("from Employee where cid=:cid",Employee.class);
			typedQuery.setParameter("cid", cid);
			
			employee=typedQuery.getSingleResult();
			
			addresses=employee.getAddresses();
			
		}else throw new EmployeeException("Not exists.");
		
//		entityManager.close();
		
		return addresses;
	}


}
