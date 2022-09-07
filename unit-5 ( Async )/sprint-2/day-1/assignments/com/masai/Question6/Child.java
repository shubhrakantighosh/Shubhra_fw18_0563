package com.masai.Question6;

class Child extends Parent{

	Child() throws Exception {
		super();
	}
	
	public static void main(String[] args) {
		try {
			new Parent().fun1();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
}