package com.masai.Question4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.masai.Question2.Student;

public class Main {
	public static void main(String[] args) {
		
		List<Student>list=Arrays.asList(
				
				new Student(123, "Shubhra", "skghosh@gmail.com", 470),
				new Student(580, "Chirag", "c@gmail.com", 412),
				new Student(751, "Alex", "alex@gmail.com", 570),
				new Student(951, "Putin", "putin@gmail.com", 610),
				new Student(841, "Robert", "robert@gmail.com", 210),
				new Student(611, "Steave", "stave@gmail.com", 410),
				new Student(151, "Tim", "tim@gmail.com", 310),
				new Student(151, "Tim", "tim@gmail.com", 310)
				
				);
		
		
		Comparator<Student>comparator=(s1,s2)->{
			return s1.getMarks()>s2.getMarks() ? +1:-1;
		};
		
		Set<Student>set=new TreeSet<>(comparator);
		
		list		
		.stream()
		.filter(s->s.getMarks()<500)
		.forEach(d->set.add(d));
		
		for(Student student:set) {
			System.out.println(student);
		}
		
		System.out.println("\n"+"Another Way"+"\n");
		
		List<Student>filteredList=list
				                     .stream()
				                     .filter(mark->mark.getMarks()<500)
				                     .collect(Collectors.toList());
		
		
		for(Student students:filteredList) {
			System.out.println(students);
		}
	}
}
