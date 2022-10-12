package com.masai.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.dao.exceptions.EmployeeException;
import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public Employee saveEmployee(Employee employee) throws EmployeeException {
		Employee employee2=null;
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
		employee2=employee;
		
		entityManager.close();
		
		return employee2;
	}

	@Override
	public Set<Address> addresses(Employee employee) throws EmployeeException {
		Set<Address>addresses=new HashSet<>();
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		String jpql="select city,pincode,state,type from employee_addresses where employee_cid=1;";
		
		Query query=entityManager.createQuery(jpql);
//		query.setParameter("cid", employee.getCid());
		
//		List<Object>list=query.getResultList();
		
//		list.forEach(System.out::println);
		
		return addresses;
	}

}
