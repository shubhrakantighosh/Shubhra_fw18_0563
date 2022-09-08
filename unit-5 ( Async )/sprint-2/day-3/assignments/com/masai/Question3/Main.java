package com.masai.Question3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	
	
	public Map<String, Student> sortMapUsingStudentName(Map<String,Student>originalMap){
		
		LinkedHashMap<String, Student>map=new LinkedHashMap<>();
		
		Comparator<Map.Entry<String, Student>>comparator=(s1,s2)->{
			return s2.getValue().getName().compareTo(s1.getValue().getName());
		};
		
		
		Set<Map.Entry<String, Student>>sets=originalMap.entrySet();
		
		Set<Map.Entry<String, Student>>sortedList=new TreeSet<>(comparator);
		sortedList.addAll(sets);
		
		for(Map.Entry<String, Student>student:sortedList) {
			map.put(student.getKey(), student.getValue());
		}
		
		return map;
	}
	
	public static void main(String[] args) {
		
		Map<String,Student> listOfStudents=new HashMap<>();
		
		listOfStudents.put("India",new Student(123, "Shubhra", "skghosh@gmail.com", 870));
		listOfStudents.put("USA",new Student(580, "Chirag", "c@gmail.com", 910));
		listOfStudents.put("UK",new Student(751, "Alex", "alex@gmail.com", 770));
		listOfStudents.put("Russia",new Student(951, "Putin", "putin@gmail.com", 810));
		listOfStudents.put("Australia",new Student(841, "Robert", "robert@gmail.com", 510));
		
		Map<String,Student> map=new Main().sortMapUsingStudentName(listOfStudents);
	
		map.forEach((country,student)->System.out.printf(country+" "+student+"\n"));	
	}

}
