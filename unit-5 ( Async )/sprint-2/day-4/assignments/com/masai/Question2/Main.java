package com.masai.Question2;

import java.util.Arrays;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		
		List<Student>list=Arrays.asList(
				
				new Student(123, "Shubhra", "skghosh@gmail.com", 870),
				new Student(580, "Chirag", "c@gmail.com", 910),
				new Student(751, "Alex", "alex@gmail.com", 770),
				new Student(951, "Putin", "putin@gmail.com", 810),
				new Student(841, "Robert", "robert@gmail.com", 510)
				
				);
		Student maxMarks=list
				.stream()
				.max((s1,s2)->s1.getMarks()>s2.getMarks() ? + 1 : -1)
				.get();
		
		System.out.print(maxMarks);

	}

}
