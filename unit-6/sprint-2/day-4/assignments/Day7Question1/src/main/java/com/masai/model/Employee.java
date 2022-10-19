package com.masai.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Employee extends Person{
	
	@Embedded
	private Address homeAddress;
	@Embedded
	private Address officeAddress;
	private int salary;
	
	
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
