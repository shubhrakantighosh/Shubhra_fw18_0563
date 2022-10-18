package com.masai.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.College;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class CollegeStudentsDaoImpl implements CollegeStudentDao{

	@Override
	public String save(College college) {
		
		String message="Not Register.";
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		Student student1=new Student();
		student1.setStudentName("Ram");
		student1.setMobileNumber("789");
		student1.setEmail("shu@gmail.com");
		
		Student student2=new Student();
		student2.setStudentName("Shyam");
		student2.setMobileNumber("987");
		student2.setEmail("shyam@gmail.com");
		
		
		Student student3=new Student();
		student3.setStudentName("Arjun");
		student3.setMobileNumber("7654");
		student3.setEmail("arjun@gmail.com");
		
		
		Student student4=new Student();
		student4.setStudentName("Lakhasman");
		student4.setMobileNumber("67876");
		student4.setEmail("lakhasman@gmail.com");
		
		
		College college1=new College();
		college1.setCollegeName("TIU");
		college1.setCollegeAddress("Kolkata");
		college1.getStudents().add(student1);
		college1.getStudents().add(student2);
		
		College college2=new College();
		college2.setCollegeName("Masai");
		college2.setCollegeAddress("Bangalore");
		college2.getStudents().add(student3);
		college2.getStudents().add(student4);
		
		
		student1.setCollege(college1);
		student2.setCollege(college1);
		student3.setCollege(college2);
		student4.setCollege(college2);
//		
//		
//		entityManager.getTransaction().begin();
//		entityManager.persist(college1);
//		entityManager.persist(college2);
//		entityManager.getTransaction().commit();
		
		
		entityManager.close();
		
		return message;
	}

	@Override
	public void getAllStudentsByCollegeID() {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		TypedQuery<College> query=entityManager.createQuery("from College", College.class);
//		query.setParameter("collegeId", 1);
		
		Object colleges=query.getResultList();
		
		System.out.println(colleges);;
		
		entityManager.close();
		
	}

}
