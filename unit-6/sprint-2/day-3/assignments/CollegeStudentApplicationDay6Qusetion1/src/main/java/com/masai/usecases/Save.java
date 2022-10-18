package com.masai.usecases;


import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.College;
import com.masai.model.Student;
import com.masai.model.dao.CollegeStudentsDaoImpl;
import com.masai.utility.EMUtil;

public class Save {

	public static void main(String[] args) {
		
	EntityManager entityManager=EMUtil.provideEntityManager();
		
		Query query=entityManager.createQuery("from Student");
//		query.setParameter("collegeId", 1);
		
//		List<Student>colleges=query.getResultList();
//		
//		for(Student h:colleges) {
//			System.out.println(h.getStudentRoll());
//			System.out.println(h.getStudentName());
//			System.out.println(h.getMobileNumber());
//			System.out.println(h.getEmail());
//			System.out.println(h.getCollege());
//		}
		
//		TypedQuery<Student>query2=entityManager.createQuery("from Student where studentRoll=2",Student.class);
//		
//		Student h=query2.getSingleResult();
//		
//		System.out.println(h.getStudentRoll());
//		System.out.println(h.getStudentName());
//		System.out.println(h.getMobileNumber());
//		System.out.println(h.getEmail());
//		System.out.println(h.getCollege());
		
		
		Query query2=entityManager.createQuery("from College where collegeId=1");
		
		Object d= query2.getSingleResult();
		College f=(College)d;
		
		f.getStudents().forEach(System.out::println);;
		
		
		entityManager.close();

	}

}
