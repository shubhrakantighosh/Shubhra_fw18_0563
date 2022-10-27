package com.masai;

public class College {
	
	private CEO ceo;

	public void setCeo(CEO ceo) {
		this.ceo = ceo;
	}


	public void doJob(){
		
		ceo.call();
		
		System.out.println("Job is started.");	
		
	}

}
