package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.model.Course;
import com.masai.utility.EMUtil;

public class Demo2 {

	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		TypedQuery<Course>typedQuery=entityManager.createQuery("from Course where courseName=:courseName",Course.class);
		typedQuery.setParameter("courseName", "Java");
		
		List<Course>courses=typedQuery.getResultList();
		
		courses.forEach(students->students.getStudents().forEach(System.out::println));
		
		entityManager.close();

	}

}
