package com.masai.Question2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args){
		
		try {
			
			BufferedReader bufferedReader=new BufferedReader(new FileReader("studentdata.txt"));
			String read=bufferedReader.readLine();
			while(read!=null) {
				System.out.println(read);
				read=bufferedReader.readLine();
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
