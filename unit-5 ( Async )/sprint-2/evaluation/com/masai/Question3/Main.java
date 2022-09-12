package com.masai.Question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Employee>employees=new ArrayList<>();
		
		List<Student>students=Arrays.asList(
				
				new Student(11, "Ram", 780, "Kolkata"),
				new Student(12, "Chirag", 588, "Delhi"),
				new Student(13, "Shubhra", 913, "Kolkata"),
				new Student(14, "Soumya", 469, "Patna"),
				new Student(15, "Subhadeep", 830, "Hydrabad")
				
				);
		
		
		students
		        .stream()
		        .filter(s->s.getMarks()>500)
		        .forEach(student->employees.add(new Employee(student.getRoll(), student.getName(), student.getMarks()*10000, student.getAddress())));
		
		
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		   
	}

}
