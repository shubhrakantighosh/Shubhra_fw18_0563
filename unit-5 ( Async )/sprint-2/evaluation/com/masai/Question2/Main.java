package com.masai.Question2;

import java.util.function.*;

public class Main {
	
	
	public static void main(String[] args) {
		Predicate<Student>marksLessThan=student ->(student.getMarks()<500);
		
		System.out.println(marksLessThan.test(new Student(21, "Shubhra", 400)));
		
		Consumer<Student>details=System.out::println;
		details.accept(new Student(35, "Soumya", 400));
		
		Supplier<Student>studentget=() -> new Student(91, "Chirag", 500);
		
		System.out.println(studentget.get());
		
		Function<String, Integer> stringNumber=string->Integer.parseInt(string);
		System.out.println(stringNumber.apply("67"));
	}
	
}
