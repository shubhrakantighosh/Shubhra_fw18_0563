package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.ConractualEmployee;
import com.masai.utility.EMUtil;

public class Demo2 {
	
	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		Query query=entityManager.createQuery("From ConractualEmployee");
		
		List<ConractualEmployee>list=query.getResultList();
		
		for(ConractualEmployee conractualEmployee:list) {
			
			System.out.println("============================");
			
			
			System.out.println(conractualEmployee.getEmpId());
			System.out.println(conractualEmployee.getEmpName());
			System.out.println(conractualEmployee.getCostofperday());
			System.out.println(conractualEmployee.getNoOfWorkingDays());
			System.out.println(conractualEmployee.getMobileNumber());
			
			System.out.println("============================");
		}
		
		
		entityManager.close();
	}
	
}
