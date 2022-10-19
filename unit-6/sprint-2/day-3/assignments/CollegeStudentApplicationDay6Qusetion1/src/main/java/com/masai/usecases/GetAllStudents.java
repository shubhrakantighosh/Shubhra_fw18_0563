package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.College;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class GetAllStudents {
	
	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		
		Query query1=entityManager.createQuery("from College where collegeId=:collegeId");
		query1.setParameter("collegeId", 1);
		
		
		List<College>students1=query1.getResultList();
		
		students1.forEach(student->student.getStudents().forEach(System.out::println));
		
		
		System.out.println("=======================================================================================================");

		
		Query query2=entityManager.createQuery("from Student where college=6");
//		query2.setParameter("college", 1);
		
		List<Student>students2=query2.getResultList();
	

		students2.forEach(System.out::println);
		
		entityManager.close();
		
	}

}
