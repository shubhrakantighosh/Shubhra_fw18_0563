package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.SalariedEmployee;
import com.masai.utility.EMUtil;

public class Demo1 {
	
	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		Query query=entityManager.createQuery("From SalariedEmployee");
		
		List<SalariedEmployee>list=query.getResultList();
		
		for(SalariedEmployee salariedEmployee:list) {
			
			System.out.println("============================");
			
			System.out.println(salariedEmployee.getEmpId());
			System.out.println(salariedEmployee.getEmpName());
			System.out.println(salariedEmployee.getEmail());
			System.out.println(salariedEmployee.getSalary());
			
			System.out.println("============================");
			
		}
		
		
		entityManager.close();
	}
	
}
