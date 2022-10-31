package com.masai.usecases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.masai.Course;
import com.masai.Student;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class AppConfig {
	
	@Bean
	public Map<Student, Course> getTheMap() {
		
		HashMap<Student, Course>map=new HashMap<>();
		
		map.put(student1, null)
		
		return map;
		
	}
	
	@Bean
	public List<Student> getTheList() {
		
		List<Student>list=new ArrayList<>();
		
		list.add(new Student("N1","A1","E1",900));
		list.add(new Student("N2","A1","E1",400));
		list.add(new Student("N3","A1","E1",300));
		list.add(new Student("N4","A1","E1",700));
		list.add(new Student("N5","A1","E1",9900));
		
		return list;
		
	}
	

}
