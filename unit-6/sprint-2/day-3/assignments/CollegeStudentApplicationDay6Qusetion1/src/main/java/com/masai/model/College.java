package com.masai.model;

public class College {
	
	private int collegeId;
	private String collegeName;
	private String collegeAddress;
	
	
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	
	
	public College(int collegeId, String collegeName, String collegeAddress) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
	}
	
	
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeAddress=" + collegeAddress
				+ "]";
	}
	
	
	public College() {
		
		
	}

	
}
