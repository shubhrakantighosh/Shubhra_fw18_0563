package com.masai.Question3;

public class Demo {
	
	public static void main(String[] args) {
		
		//Using External Or Separate class
		int number1=new FunA().convetStringToNumber("8");
		System.out.println(number1);


		//Anonymous
		FunA anonymous=new FunA() {
            @Override
            public int convetStringToNumber(String name) {
                return Integer.parseInt(name);
            }
        };


        int number2=anonymous.convetStringToNumber("7");
        System.out.println(number2);


		//Lambda
        FunA lambda=lambda ->Integer.parseInt(lambda);
        
        
		
	}
	
}
