package com.masai.Question2;

import java.util.Comparator;

public class StudentMarksSort implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return ((Student) o1).getMarks()>((Student)o2).getMarks() ? -1:+1;
	}
	
}
