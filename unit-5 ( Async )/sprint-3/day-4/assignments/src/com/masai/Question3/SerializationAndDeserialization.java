package com.masai.Question3;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

public class SerializationAndDeserialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		List<Student>students=Arrays.asList(
				
				new Student(10, "Shubhra", 780),
				new Student(11, "Soumya", 689),
				new Student(13, "Chirag", 784),
				new Student(14, "Subhadeep", 608)
				
				);
		
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("Serialization.txt"));
		objectOutputStream.writeObject(students);
		objectOutputStream.flush();
		objectOutputStream.close();
		
		
		
		ObjectInputStream obInputStream=new ObjectInputStream(new FileInputStream("Serialization.txt"));
		List<Student>list=(List<Student>)obInputStream.readObject();
		
		for(Student s1:list) {
			System.out.print("Student Roll : "+s1.roll+" ");
			System.out.print("Student Name :"+s1.name+" ");
			System.out.print("Student Marks :"+s1.marks);
			System.out.println("\n");
		}
		
		obInputStream.close();
	}
	
}

