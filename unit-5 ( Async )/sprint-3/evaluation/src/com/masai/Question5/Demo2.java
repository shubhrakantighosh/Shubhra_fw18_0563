package com.masai.Question5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		
		
		try {
			
			List<Student>students=new ArrayList<>();
			
			FileInputStream fileInputStream = new FileInputStream("studentdata.txt");
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			
			Object objects=objectInputStream.readObject();
			
			List<Student>oldStudents=(List<Student>)objects;
			
			for(Student student:oldStudents) {
				students.add(student);
			}
			
			System.out.println("Deserialize Done");
	
			fileInputStream.close();
			objectInputStream.close();
			
			
			students.add(new Student(10, "Ram", 780, "ram@gmail.com", "6789", new Address("West Bengal", "Kolkata", "700064")));
			
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
