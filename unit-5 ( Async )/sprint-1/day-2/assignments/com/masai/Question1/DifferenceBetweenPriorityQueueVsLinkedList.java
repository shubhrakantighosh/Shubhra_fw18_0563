package com.masai.Question1;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class DifferenceBetweenPriorityQueueVsLinkedList {
	
	public static void main(String[] args) {
		
		PriorityQueue<Student>priorityQueue=new PriorityQueue<>();
		
		
		priorityQueue.add(new Student(3));
		priorityQueue.add(new Student(2));
		priorityQueue.add(new Student(1));

		System.out.println(priorityQueue);

		
		LinkedList<Student>linkedList=new LinkedList<>();
		
		linkedList.add(new Student(3));
		linkedList.add(new Student(2));
		linkedList.add(new Student(1));
		
		System.out.println(linkedList);
		
	}

}
