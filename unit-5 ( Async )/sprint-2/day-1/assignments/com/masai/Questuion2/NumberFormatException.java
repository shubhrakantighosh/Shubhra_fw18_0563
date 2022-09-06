package com.masai.Questuion2;

public class NumberFormatException extends Exception{

	public NumberFormatException(String string) {
		super("Entered input is not a valid format for an integer.");
	}
}
