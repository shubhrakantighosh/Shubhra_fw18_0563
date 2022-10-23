package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class Demo3 {

	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		TypedQuery<Student>typedQuery=entityManager.createQuery("from Student where roll=:roll",Student.class);
		typedQuery.setParameter("roll", 1);
		
		List<Student>courses=typedQuery.getResultList();
		
		courses.forEach(students->students.getCourses().forEach(System.out::println));
		
		entityManager.close();

	}

}
