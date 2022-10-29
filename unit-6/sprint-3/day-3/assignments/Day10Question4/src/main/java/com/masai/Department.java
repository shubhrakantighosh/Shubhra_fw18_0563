package com.masai;

public class Department {

	private int deptId;
	private int deptName;
	private int location;
	
	
	public Department(int deptId, int deptName, int location) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.location = location;
	}
	
	
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", location=" + location + "]";
	}

	
}
