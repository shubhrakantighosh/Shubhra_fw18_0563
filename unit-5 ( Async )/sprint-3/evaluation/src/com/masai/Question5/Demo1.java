package com.masai.Question5;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		List<Student>students=Arrays.asList(
				
				new Student(11, "Shubhra", 780, "shubhra@gmail.com", "1234", new Address("West Bengal", "Kolkata", "700102")),
				new Student(12, "Chirag", 670, "chirag@gmail.com", "2345", new Address("Bihar", "Patna", "800001")),
				new Student(13, "Subhadeep", 590, "subhadeep@gmail.com", "3456", new Address("New Delhi", "Delhi", "11001")),
				new Student(14, "Soumya", 890, "soumya@gmail.com", "4567", new Address("Hydrabad", "Hydrabad", "500001")),
				new Student(15, "Sourik", 770, "sourik@gmail.com", "5678", new Address("Andhrapadradeh", "Visakhapatnam", "530001"))
				
				);
		
		try {
			
			FileOutputStream fileOutputStream=new FileOutputStream("studentdata.txt");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(students);
			
			fileOutputStream.close();
			objectOutputStream.close();
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		System.out.println("Serialize Done");
		
	}

}
