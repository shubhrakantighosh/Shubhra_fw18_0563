package com.masai.Question4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

public class IndianMobileNumber {
	public static void main(String[] args) throws FileNotFoundException{
		
		BufferedWriter bufferedWriter=new BufferedWriter(new PrintWriter("IndiaNumber.txt"));
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("mobileNumber.txt"))) {
			
			String read=bufferedReader.readLine();
			
			while(read!=null) {
				
				boolean find=Pattern.matches("[6789]{1}\\d{9}", read);
				
				if(find) {
					bufferedWriter.write(read);
					bufferedWriter.newLine();
				}

				read=bufferedReader.readLine();
			}
			
			bufferedReader.close();
			bufferedWriter.close();
			
			
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
		
	}
}
