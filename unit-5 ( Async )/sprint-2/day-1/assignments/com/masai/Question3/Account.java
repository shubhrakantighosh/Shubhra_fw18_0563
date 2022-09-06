package com.masai.Question3;

public class Account {
	
	String accountNumber;
	double balance;
	
	public void deposit(double amount){
		this.balance=amount;
		System.out.println("INR "+this.balance+" has been credited to your A/C "+this.accountNumber);
	}
	
	
	public double withdraw(double amount)throws InsufficientFundsException {
		double blanceUpdate=0;
		
		if(this.balance>=amount) {
			
			this.balance=(this.balance-amount);
			blanceUpdate=this.balance;
			
		}else { 
			
			InsufficientFundsException ife=new InsufficientFundsException("You account blance is "+this.balance+
					" and you are trying to withdraw "+amount);
			throw ife;
		}
		
		
		return blanceUpdate;
	}
}
