package com.masai.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Employee extends Person{
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "state",column = @Column(name = "homeAdderss_state")),
		@AttributeOverride(name = "city",column = @Column(name = "homeAdderss_city")),
		@AttributeOverride(name = "pincode",column = @Column(name = "homeAdderss_pincode")),
	})
	private Address home;
	
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "state",column = @Column(name = "officeAddress_state")),
		@AttributeOverride(name = "city",column = @Column(name = "officeAddress_city")),
		@AttributeOverride(name = "pincode",column = @Column(name = "officeAddress_pincode")),
	})
	private Address office;
	
	private int salary;
	
	public Address getHome() {
		return home;
	}
	public void setHome(Address home) {
		this.home = home;
	}
	public Address getOffice() {
		return office;
	}
	public void setOffice(Address office) {
		this.office = office;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
		

}
