package com.masai.Question1;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	
	private int empId;
	private String name;
	private int salary;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getSalary()>o2.getSalary() ? -1 : +1;
	}
	

}
