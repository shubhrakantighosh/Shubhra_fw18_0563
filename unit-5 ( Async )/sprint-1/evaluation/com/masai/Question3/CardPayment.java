package com.masai.Question3;

public class CardPayment implements Payment{

	private int amount;
	
	@Override
	public void doPayment() {
		
		System.out.println("Payment done using Card "+amount);
	}

}
