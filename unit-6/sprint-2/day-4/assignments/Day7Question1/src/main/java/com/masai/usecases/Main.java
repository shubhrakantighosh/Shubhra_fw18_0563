package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		Employee employee1=new Employee();
		employee1.setName("Shubhra");
		employee1.setSalary(90000);
		employee1.setHome(new Address("WB", "Kolkata", "700102"));
		employee1.setOffice(new Address("WB", "Katwa", "713130"));
		
		Employee employee2=new Employee();
		employee2.setName("Ram");
		employee2.setSalary(85000);
		employee2.setHome(new Address("MH", "Pune", "456789"));
		employee2.setOffice(new Address("KA", "Bangalore", "65876"));
		
		Employee employee3=new Employee();
		employee3.setName("Sita");
		employee3.setSalary(100000);
		employee3.setHome(new Address("KA", "Bngalore", "654456"));
		employee3.setOffice(new Address("DL", "new Delhi", "11001"));
		
		Employee employee4=new Employee();
		employee4.setName("Lakhasman");
		employee4.setSalary(65000);
		employee4.setHome(new Address("TN", "Tamil Nadu", "44098"));
		employee4.setOffice(new Address("PN", "Chandhighar", "98765"));
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityManager.persist(employee3);
		entityManager.persist(employee4);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
	}
	
}
