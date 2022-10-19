package com.masai.usecases;



import javax.persistence.EntityManager;

import com.masai.model.College;
import com.masai.model.Student;
import com.masai.utility.EMUtil;

public class Save {

	public static void main(String[] args) {
		
		
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		
		College college1=new College();
		college1.setCollegeName("TIU");
		college1.setCollegeAddress("Kolkata");
		
		College college2=new College();
		college2.setCollegeName("Masai");
		college2.setCollegeAddress("Bangalore");
		
		Student student1=new Student();
		student1.setStudentName("Shubhra");
		student1.setMobileNumber("7066");
		student1.setEmail("shubhra@gmail.com");
		student1.setCollege(college1);
		
		Student student2=new Student();
		student2.setStudentName("Chirag");
		student2.setMobileNumber("8765");
		student2.setEmail("chirag@gmail.com");
		student2.setCollege(college1);
		
		
		Student student3=new Student();
		student3.setStudentName("Soumya");
		student3.setMobileNumber("9876");
		student3.setEmail("soumya@gmail.com");
		student3.setCollege(college1);
		
		Student student4=new Student();
		student4.setStudentName("Subhadeep");
		student4.setMobileNumber("874");
		student4.setEmail("subhadeep@gmail.com");
		student4.setCollege(college1);
		
		
		Student student5=new Student();
		student5.setStudentName("Yatin");
		student5.setMobileNumber("9876");
		student5.setEmail("yatin@gmail.com");
		student5.setCollege(college2);
		
		
		Student student6=new Student();
		student6.setStudentName("Gautam");
		student6.setMobileNumber("4567");
		student6.setEmail("gautam@gmail.com");
		student6.setCollege(college2);
		
		
		Student student7=new Student();
		student7.setStudentName("vaibhav");
		student7.setMobileNumber("3456");
		student7.setEmail("vaibhav@gmail.com");
		student7.setCollege(college2);
		
		
		Student student8=new Student();
		student8.setStudentName("Karishma");
		student8.setMobileNumber("234");
		student8.setEmail("karishma@gmail.com");
		student8.setCollege(college2);
		
		college1.getStudents().add(student1);
		college1.getStudents().add(student2);
		college1.getStudents().add(student3);
		college1.getStudents().add(student4);
		college2.getStudents().add(student5);
		college2.getStudents().add(student6);
		college2.getStudents().add(student7);
		college2.getStudents().add(student8);
		
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(college1);
		entityManager.persist(college2);
		entityManager.getTransaction().commit();
		
		
		entityManager.close();

	}

}
