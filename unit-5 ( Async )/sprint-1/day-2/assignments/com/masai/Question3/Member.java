package com.masai.Question3;

public class Member {
	
	private String memberName;
	private int membershipNo;
	private String membershipEnddate;
	
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMembershipNo() {
		return membershipNo;
	}
	public void setMembershipNo(int membershipNo) {
		this.membershipNo = membershipNo;
	}
	public String getMembershipEnddate() {
		return membershipEnddate;
	}
	public void setMembershipEnddate(String membershipEnddate) {
		this.membershipEnddate = membershipEnddate;
	}
	
	
	public Member(String memberName, int membershipNo, String membershipEnddate) {
		super();
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		this.membershipEnddate = membershipEnddate;
	}
	
	
	@Override
	public String toString() {
		return "Member [memberName=" + memberName + ", membershipNo=" + membershipNo + ", membershipEnddate="
				+ membershipEnddate + "]";
	}
	
}
