package com.masai.Question1;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			
			FileWriter fileWriter=new FileWriter("abc.txt");
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter name");
			String name=scanner.next();
			fileWriter.write(name);
			fileWriter.write("\n");
			System.out.println("Enter address");
			String address=scanner.next();
			fileWriter.write(address);
			
			fileWriter.flush();
			fileWriter.close();
			
			System.out.println("done");
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}
}
