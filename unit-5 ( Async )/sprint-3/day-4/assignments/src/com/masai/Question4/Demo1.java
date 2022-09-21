package com.masai.Question4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		
		List<Student>students=Arrays.asList(
				
				new Student(11,"Shubhra", 780, new Address("West Bengal", "Kolkata", 700102)),
			    new Student(12,"Chirag", 680, new Address("New Delhi", "Delhi", 110001)),
				new Student(13,"Soumya", 785, new Address("Bihar", "Patna", 567887)),
				new Student(14,"Subhadeep", 569, new Address("Hydrabad", "Hydrabad", 8765678)),
				new Student(15,"Sourik", 678, new Address("Andhra Pradesh", "Visakhapatnam", 500020))
				
				);
	

		try {
			
			FileOutputStream fileOutputStream = new FileOutputStream("studentdata.txt");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(students);
			objectOutputStream.flush();
			objectOutputStream.close();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		System.out.println("Serialized");
		
	}
}