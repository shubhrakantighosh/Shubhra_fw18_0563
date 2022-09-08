package com.masai.Question2;

public class MyPredicate implements Predicate<Student>{

	@Override
	public boolean test(Student t) {
		return t.getMarks()>500;
	}

}
