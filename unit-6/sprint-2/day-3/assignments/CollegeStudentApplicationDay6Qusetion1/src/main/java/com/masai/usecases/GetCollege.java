package com.masai.usecases;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class GetCollege {
	
	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		TypedQuery<Student> typedQuery1=entityManager.createQuery("from Student where studentRoll=:studentRoll", Student.class);
		typedQuery1.setParameter("studentRoll", 2);
		
		Student student=typedQuery1.getSingleResult();
		
		
		System.out.println(student.getCollege().getCollegeId());
		System.out.println(student.getCollege().getCollegeName());
		System.out.println(student.getCollege().getCollegeAddress());
		
		
		entityManager.close();
		
	}
	
}
