package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.model.Teacher;
import com.masai.utility.EMUtil;

public class Main {

	public static void main(String[] args) {
		
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		
		Student student1=new Student();
		student1.setName("Ram");
		student1.setMobile("8676");
		student1.setEmail("ram@gmail.com");
		
		
		Student student2=new Student();
		student2.setName("Ravi");
		student2.setMobile("76776");
		student2.setEmail("ravi@gmail.com");
		
		
		Course course1=new Course();
		course1.setCourseName("Java");
		course1.setDuration("30Days");
		course1.setFee("200000");
	
		
		Course course2=new Course();
		course2.setCourseName("MySQL");
		course2.setDuration("25Days");
		course2.setFee("150000");
		
		
		student1.getCourses().add(course1);
		student1.getCourses().add(course2);
		
		
		student1.getCourses().add(course2);
		
		
		course1.getStudents().add(student1);
		
		course2.getStudents().add(student1);
		course2.getStudents().add(student2);
		
		
		Teacher teacher=new Teacher();
		teacher.setEmail("ratan@gamil.com");
		teacher.setNoYearOfExperince(13);
		teacher.setTeacherName("Ratan");
		teacher.getCourses().add(course1);
		teacher.getCourses().add(course2);
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(teacher);
		entityManager.getTransaction().commit();
		
		
		entityManager.close();
		
	}

}
