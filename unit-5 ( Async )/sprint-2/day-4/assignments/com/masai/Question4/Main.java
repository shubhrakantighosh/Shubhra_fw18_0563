package com.masai.Question4;

import java.util.Arrays;
import java.util.List;

import com.masai.Question2.Student;

public class Main {
	public static void main(String[] args) {
		
		List<Student>list=Arrays.asList(
				
				new Student(123, "Shubhra", "skghosh@gmail.com", 470),
				new Student(580, "Chirag", "c@gmail.com", 310),
				new Student(751, "Alex", "alex@gmail.com", 570),
				new Student(951, "Putin", "putin@gmail.com", 210),
				new Student(841, "Robert", "robert@gmail.com", 210),
				new Student(611, "Steave", "stave@gmail.com", 410),
				new Student(151, "Tim", "tim@gmail.com", 310)
				
				);
		
		int c=0;
		
		long r=list
				
		.stream()
		.filter(s->s.getMarks()<500).count();
		
		System.out.println(r);
		
	}
}
