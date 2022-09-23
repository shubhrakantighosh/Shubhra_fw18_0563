package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDaoImpl;

public class InsertStudent {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Your Roll Number");
		int roll=scanner.nextInt();
		System.out.println("Enter Your Name");
		String name=scanner.next();
		System.out.println("Enter Your Address");
		String address=scanner.next();
		System.out.println("Enter Your Marks");
		int marks=scanner.nextInt();
		
		StudentDaoImpl dao=new StudentDaoImpl();
		
		String result=dao.insertStudentDetails(roll, name, address, marks);
		System.out.println(result);
		
	}

}
