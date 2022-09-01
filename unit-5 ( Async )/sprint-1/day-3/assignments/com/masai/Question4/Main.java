package com.masai.Question4;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.masai.Question2.Student;

public class Main {

	public static void main(String[] args) {
		HashMap<String,Student>treeMap=new HashMap<>();
		
		treeMap.put("West Bengal" ,new Student(1, "Shubhra", 700));
		treeMap.put("Delhi", new Student(2, "Chirag", 670));
		treeMap.put("Bihar", new Student(3, "Soumya", 580));
		treeMap.put("Hydrabad", new Student(4, "Subhadeep", 980));
		treeMap.put("Visakhapatnam", new Student(5, "Sourik", 850));
		
		for(Entry<String, Student>student:treeMap.entrySet()) {
			System.out.println(student.getKey()+" "+student.getValue());
		}
	}

}
