package com.masai.model;

public class Employee {
	
	private int eid;
	private String ename;
	private Address address;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Employee(int eid, String ename, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}
	
	
	public Employee() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}


}
