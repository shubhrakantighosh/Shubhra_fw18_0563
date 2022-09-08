package com.masai.Question2;

public class Demo {
	public static void main(String[] args) {
		MyPredicate myPredicate=new MyPredicate();
		System.out.println(myPredicate.test(new Student(123, "Shubhra", "skghosh@gmail.com", 670)));
	}
}
