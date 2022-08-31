package com.masai.Question3;

import java.util.Scanner;
import java.util.Stack;


public class Main {

	public static void main(String[] args) {
		Stack<Members>stack=new Stack<>();
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Member ID");
			int memberId=scanner.nextInt();
			System.out.println("Enter Member Name");
			String memberName=scanner.next();
			System.out.println("Enter Membership Number");
			int membershipNo=scanner.nextInt();
			System.out.println("Enter Membership End Date");
			String membershipEnddate=scanner.next();
			
			stack.add(new Members(memberId, memberName, membershipNo, membershipEnddate));
			
			System.out.println("Would you like to add more members");
			String inputUser=scanner.next();
			if(inputUser.equalsIgnoreCase("No")) {
				break;
			}
			
		}
		
		while(stack.size()!=0){
			System.out.println(stack.peek());
			stack.pop();
		}

	}

}
