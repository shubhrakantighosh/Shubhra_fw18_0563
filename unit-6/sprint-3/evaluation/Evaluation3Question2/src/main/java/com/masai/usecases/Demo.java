package com.masai.usecases;

import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.Course;
import com.masai.Student;
import com.masai.utility.EMUtil;

public class Demo {
	
	public void printMap(){
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		TypedQuery<Student>typedQuery=entityManager.createQuery("from Student", Student.class);
		
		List<Student> students=typedQuery.getResultList();
		
		for(Student student:students) {
			
			System.out.println(student);
			
		}
		
		entityManager.close();
		
	}
	
	
	public void printList(){

		HashMap<Integer, Student> hashMap=new HashMap<>();
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		TypedQuery<Student>typedQuery=entityManager.createQuery("from Student", Student.class);
		
		List<Student> students=typedQuery.getResultList();
		
		for(Student student:students) {
			
			hashMap.put(student.getMarks(), student);
			
		}
		
		
		hashMap.forEach((key,value)->{System.out.println(value);});
		
		entityManager.close();
		
		
	}
	
	public void printAppName(){
		//print the injected appName
	
		System.out.println("StudentUnit");
	
	}

	
	

	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		Student student1=new Student();
		student1.setName("Shubhra");
		student1.setAddress("Kol");
		student1.setEmail("s@gmail.com");
		student1.setMarks(900);
		
		Course course1=new Course();
		course1.setCourseName("Java");
		course1.setDuration("30Days");
		course1.setFee(30000);
		
		
		Student e=entityManager.find(Student.class,2);
		
		
		Course s=entityManager.find(Course.class, 1);
		s.getStudents().add(e);
		
		e.getCourses().add(s);
		
		
//		entityManager.getTransaction().begin();
//		entityManager.persist(course1);
//		entityManager.persist(student1);
//		entityManager.getTransaction().commit();
//		
		
		entityManager.close();
		
		new Demo().printList();

	}

}
