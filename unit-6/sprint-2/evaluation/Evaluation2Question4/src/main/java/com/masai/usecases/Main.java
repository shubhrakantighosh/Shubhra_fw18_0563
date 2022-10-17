package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.model.ConractualEmployee;
import com.masai.model.SalariedEmployee;
import com.masai.utility.EMUtil;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		SalariedEmployee salariedEmployee1=new SalariedEmployee();
		salariedEmployee1.setEmpName("Ravi");
		salariedEmployee1.setEmail("ravi@gmail.com");
		salariedEmployee1.setSalary(90000);
		
		SalariedEmployee salariedEmployee2=new SalariedEmployee();
		salariedEmployee2.setEmpName("Shyam");
		salariedEmployee2.setEmail("shyam@gmail.com");
		salariedEmployee2.setSalary(85000);
		
		SalariedEmployee salariedEmployee3=new SalariedEmployee();
		salariedEmployee3.setEmpName("Sita");
		salariedEmployee3.setEmail("sita@gmail.com");
		salariedEmployee3.setSalary(100000);
		
		SalariedEmployee salariedEmployee4=new SalariedEmployee();
		salariedEmployee4.setEmpName("Lakhasman");
		salariedEmployee4.setEmail("lakhasman@gmail.com");
		salariedEmployee4.setSalary(75000);
		
		
		ConractualEmployee conractualEmployee1=new ConractualEmployee();
		conractualEmployee1.setEmpName("Chirag");
		conractualEmployee1.setMobileNumber("9889");
		conractualEmployee1.setNoOfWorkingDays(2);
		conractualEmployee1.setCostofperday(900);
		
		ConractualEmployee conractualEmployee2=new ConractualEmployee();
		conractualEmployee2.setEmpName("Shubhra");
		conractualEmployee2.setMobileNumber("8774");
		conractualEmployee2.setNoOfWorkingDays(4);
		conractualEmployee2.setCostofperday(1000);
		
		ConractualEmployee conractualEmployee3=new ConractualEmployee();
		conractualEmployee3.setEmpName("Soumya");
		conractualEmployee3.setMobileNumber("78237");
		conractualEmployee3.setNoOfWorkingDays(8);
		conractualEmployee3.setCostofperday(750);
		
		ConractualEmployee conractualEmployee4=new ConractualEmployee();
		conractualEmployee4.setEmpName("Subhadeep");
		conractualEmployee4.setMobileNumber("78993");
		conractualEmployee4.setNoOfWorkingDays(4);
		conractualEmployee4.setCostofperday(850);
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(salariedEmployee1);
		entityManager.persist(salariedEmployee2);
		entityManager.persist(salariedEmployee3);
		entityManager.persist(salariedEmployee4);
		entityManager.persist(conractualEmployee1);
		entityManager.persist(conractualEmployee2);
		entityManager.persist(conractualEmployee3);
		entityManager.persist(conractualEmployee4);
		entityManager.getTransaction().commit();
		
		entityManager.close();
	}
	
}
