package com.masai.Question1;


public class Student implements Comparable<Student>{
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}


	@Override
	public int compareTo(Student o) {
		return o.id>id ? -1 : +1;
	}
	

}
