package com.masai.Question2;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		TreeMap<Student, String>treeMap=new TreeMap<>(new StudentMarksSort());
		
		treeMap.put(new Student(1, "Shubhra", 700), "West Bengal");
		treeMap.put(new Student(2, "Chirag", 670), "Delhi");
		treeMap.put(new Student(3, "Soumya", 580), "Bihar");
		treeMap.put(new Student(4, "Subhadeep", 980), "Hydrabad");
		treeMap.put(new Student(5, "Sourik", 850), "Visakhapatnam");
		
		Set<Entry<Student,String>>entries=treeMap.entrySet();
		
		for(Entry<Student, String> student:entries) {
			System.out.println("State Name : "+student.getValue()+" "+",  Student Details : "+student.getKey());
		}
		
	}

}
