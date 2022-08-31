package com.masai.Question3;

public class Members {
	
	private int memberId;
	private String memberName;
	private int membershipNo;
	private String membershipEnddate;
	
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
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
	
	
	public Members(int memberId, String memberName, int membershipNo, String membershipEnddate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		this.membershipEnddate = membershipEnddate;
	}
	
	
	@Override
	public String toString() {
		return "Members [memberId=" + memberId + ", memberName=" + memberName + ", membershipNo=" + membershipNo
				+ ", membershipEnddate=" + membershipEnddate + "]";
	}

}
