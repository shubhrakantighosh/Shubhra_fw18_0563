package com.masai.Question3;

import java.util.Arrays;

public class ExceptionHandling {
	public static void main(String[] args) {
		
		try {
			
//			(1) In this case its Arithmetic issue so will get ArithmeticException.
			int first=100;
			int secound=0;
			int third=first/secound;
			System.out.println(third);
			
			
//			(2) In this case its a nullpointer Exception case string defined is null.
			String string=null;
			System.out.println(string.length());
			
			
			
//			(3) Here we will get number normat exception case we are trying to string to integer but is a string it can not be converted into integer.
			int number=Integer.parseInt("h");
			System.out.println(number);
			
			
//			(4) Its a array index out exceptio case we defined array size 2 and we are trying insert three value.
			int[] arr=new int[2];
			arr[0]=1;
			arr[1]=2;
			arr[3]=7;
			System.out.println(Arrays.toString(arr));
			
			
//			(5) and the last one is the parent of the all exception if any of exception can not be handle by them it can handle by his parent that is exception.
			
			
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException aiobe ) {
			aiobe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
