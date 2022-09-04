package com.masai.Question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
		
		System.out.println("<<--My Own Without Generics-->>");
		
		MyGenerics generics=new MyGenerics();
		
		generics.add(1);
		
		System.out.println(generics.get());
		
		generics.add("two");
		
		System.out.println(generics.get());
		
		generics.add(new Student(1, "Shubhra", 670));
		
		System.out.println(generics.get());
		
		generics.add(null);
		
		System.out.println(generics.get());
		
		
		System.out.println("<<--My Own With Generics-->>");
		
		MyGenerics<Integer>myGenerics1=new MyGenerics();
		myGenerics1.add(1);
		System.out.println(myGenerics1.get());
		
		
		MyGenerics<String>myGenerics2=new MyGenerics();
		myGenerics2.add("two");
		System.out.println(myGenerics2.get());
		
		
		MyGenerics<Student>myGenerics3=new MyGenerics();
		myGenerics3.add(new Student(1, "Chirag", 780));
		System.out.println(myGenerics3.get());
		
		
		System.out.println("Without Generics");
		
		List list=new ArrayList<>();
		
		list.add(1);
		list.add("two");
		list.add(new Student(2, "Subhadeep", 970));
		list.add(null);
		
		list.forEach(System.out::println);
		
		
		System.out.println("With Generics");
		
		List<Integer>integers=new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		
		integers.forEach(System.out::println);
		
		
	}

}

class MyGenerics<T>{
	T t;
	
	public void add(T t) {
		this.t=t;
	}
	
	public T get() {
		return this.t;
	}
}