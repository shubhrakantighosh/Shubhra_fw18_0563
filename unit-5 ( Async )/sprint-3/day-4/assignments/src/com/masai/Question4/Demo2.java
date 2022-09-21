package com.masai.Question4;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {

		ArrayList<Student>students=new ArrayList<>();

		try {
			
			FileInputStream fileInputStream=new FileInputStream("studentdata.txt");
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			
			Object object=objectInputStream.read();
			
			objectInputStream.read();
			
			fileInputStream.close();
			objectInputStream.close();
			
		} catch (Exception e) {

			e.printStackTrace();
		}

		
		
	}

}
