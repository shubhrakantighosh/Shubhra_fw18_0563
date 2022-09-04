package com.masai.Question3;


import java.util.HashMap;

public class BookMain {
	
	
	HashMap<Integer,Book>booksLibary=new HashMap<>();
	
	public void storeBook(int bookId, Book book) {
		
		if(booksLibary.containsKey(bookId)) {
			
			System.out.println("BookId already exits.");
			
		}else {
			
			booksLibary.put(bookId, book);
			
			System.out.println("Book added in the library. Book Name : "+book.getBookName()+"\n"
			+"Book Author : "+book.getBookAuthor());
		}
		
	}
	
	

	public static void main(String[] args) {
		
		BookMain bookMain=new BookMain();
		
		bookMain.storeBook(1, new Book("Gitajali", "Rabindra Nath Tagore"));
		bookMain.storeBook(2, new Book("The Home and the World", "Rabindra Nath Tagore"));
		bookMain.storeBook(1, new Book("Kabuliwala", "Rabindra Nath Tagore"));
		bookMain.storeBook(3, new Book("Agnibeena", "Kazi Nazrul Islam"));
		
	}

}
