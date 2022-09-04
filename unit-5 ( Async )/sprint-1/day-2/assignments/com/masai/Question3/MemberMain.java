package com.masai.Question3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;


public class MemberMain {
	
	HashMap<Integer,Member>memberList=new HashMap<>();
	
	public void MemberCheck(int memberId, Member member) {
		
		boolean flag=false;
		
		Collection collection=memberList.values();
		
		List<Member>listMember=new ArrayList<>(collection);
		
		for(Member list:listMember) {
			if(list.getMembershipNo()==member.getMembershipNo()) {
				flag=true;
				break;
			}
		}
		
		if(memberList.containsKey(memberId) || flag) {

			System.out.println("Member Id or MemberShip alreday exits");
			
		}else {
			
			memberList.put(memberId, member);
			
			System.out.println("Member Added "+member.getMemberName());
			
		}

		
	}

	
	public static void main(String[] args) {
		
		MemberMain memberMain=new MemberMain();
		memberMain.MemberCheck(1, new Member("Shubhra",123, "12/09/22"));
		memberMain.MemberCheck(2, new Member("Chirag",123, "12/09/22"));
		memberMain.MemberCheck(1, new Member("Subhadeep",124, "10/09/24"));
		memberMain.MemberCheck(3, new Member("Soumya",125, "22/12/2025"));
		
		
	}

}
