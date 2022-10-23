package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class Demo1 {

	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		Course course1=new Course();
		course1.setCourseName("Java");
		course1.setDuration("30 Days");
		course1.setFee("250000");
		
		
		Course course2=new Course();
		course2.setCourseName("C++");
		course2.setDuration("45 Days");
		course2.setFee("300000");
		
		Student student1=new Student();
		student1.setName("Ram");
		student1.setEmail("shubhra@gmail.com");
		student1.setMobile("98765");
		
		
		Student student2=new Student();
		student2.setName("Shyam");
		student2.setEmail("shyam@gmail.com");
		student2.setMobile("567");
		
		Student student3=new Student();
		student3.setName("Lakhsman");
		student3.setEmail("lakhasman@gmail.com");
		student3.setMobile("3456");
		
		
		course1.getStudents().add(student1);
		course2.getStudents().add(student1);
		
		course2.getStudents().add(student2);
		
		course1.getStudents().add(student3);
		course2.getStudents().add(student3);
		
		student1.getCourses().add(course1);
		student1.getCourses().add(course2);
		
		
		student2.getCourses().add(course2);
		
		student3.getCourses().add(course1);
		student3.getCourses().add(course2);
		
		entityManager.getTransaction().begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.getTransaction().commit();
		
		
		entityManager.close();

	}

}
