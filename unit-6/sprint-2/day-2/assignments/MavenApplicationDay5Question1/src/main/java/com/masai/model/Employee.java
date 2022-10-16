package com.masai.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String name;
	private String mobileNumber;
	private String email;
	
	@ElementCollection
	@Embedded
	@JoinTable(name = "addresses",joinColumns = @JoinColumn(name = "emp_cid"))
	Set<Address> addresses=new HashSet<>();

	
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	

	public Employee(int cid, String name, String mobileNumber, String email, Set<Address> addresses) {
		super();
		this.cid = cid;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.addresses = addresses;
	}

	public Employee() {

	}

	@Override
	public String toString() {
		return "Employee [cid=" + cid + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", addresses=" + addresses + "]";
	}

	
}
