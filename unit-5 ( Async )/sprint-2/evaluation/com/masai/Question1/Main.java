package com.masai.Question1;

import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Library library=new Library();
		
		while(true) {
			
			System.out.println("1.Add Book");
			System.out.println("2.Display all book details");
			System.out.println("3.Search Book by author");
			System.out.println("4.Search book by ISBN");
			System.out.println("5.Exit");
			
			int userInput=scanner.nextInt();
			
			if(userInput==5) {
				System.out.println("Output: Thank You..!!");
				break;
			}

			if(userInput==1) {
				
				System.out.println("Enter the isbn no:");
				int isbn=scanner.nextInt();
				System.out.println("Enter the book name:");
				String name=scanner.next();
				System.out.println("Enter the author name:");
				String author=scanner.next();
				
				try {
					library.addBook(new Book(isbn, name, author));
				} catch (BookException be) {
					System.out.println(be.getMessage());
				}
				
			}else if(userInput==2) {
				try {
					List<Book>books=library.viewAllBooks();
					
					for(Book book:books) {
						System.out.println(book);
					}
					
				} catch (BookException be) {
					System.out.println(be.getMessage());
				}
				
			}else if(userInput==3) {
				
				System.out.println("Enter Author name");
				String author=scanner.next();
				try {
					List<Book>books=library.viewBooksByAuthor(author);
					
					for(Book book:books) {
						System.out.println(book);
					}
					
				} catch (BookException be) {
					System.out.println(be.getMessage());
				}
				
			}else if(userInput==4) {
				
				System.out.println("Enter ISBN no");
				int isbn=scanner.nextInt();
				try {
					
					Book book=library.getBookByISBN(isbn);
					System.out.println(book);
	
				} catch (BookException be) {
					System.out.println(be.getMessage());
				}
				
			}else System.out.println("Don't enter wrong key");

		}
		
	}
}
