package com.masai.Question3;

public class CashPayment implements Payment{

	private int amount;
	
	@Override
	public void doPayment() {
		
		System.out.println("Payment done using Cash "+amount);
		
	}

}
