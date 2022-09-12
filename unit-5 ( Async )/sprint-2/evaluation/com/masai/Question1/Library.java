package com.masai.Question1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Library {

	Set<Book>map=new HashSet<>();
	
	public void addBook(Book book)throws BookException{
		
		boolean flag=false;
		for(Book books:map) {
			if(books.getIsbn()==book.getIsbn()) {
				flag=true;
				break;
			}
		}			
		
		if(flag) {
			BookException be=new BookException("Its Already added in this list");
			throw be;
		}else {
			map.add(book);
			System.out.println("Book added into the libary");
		}
		
	}
	
	public List viewAllBooks()throws BookException {
		List<Book>list=new ArrayList<>();
		if(map.isEmpty()) {
			BookException be=new BookException("No books is there");
			throw be;
		}else {
			for(Book book:map) {
				list.add(book);
			}
		}

		return list;
	}

		public List viewBooksByAuthor(String author)throws BookException{
			List<Book>books=new ArrayList<>();
			
			for(Book book:map) {
				if(book.getAuthor().equals(author)) {
					books.add(book);
				}
			}
			
			if(books.isEmpty()) {
				BookException be=new BookException("No books is the with name author name of "+author);
				throw be;
			}
			
			return books;
		}
		
		public Book getBookByISBN(int isbn)throws BookException{
			Book book=new Book();
			boolean flag=true;
			for(Book books:map) {
				if(books.getIsbn()==isbn) {
					book=books;
					flag=false;
					break;
				}
			}	
			
			if(flag) {
				BookException be=new BookException("No books is the with ISBN number of "+isbn);
				throw be;
			}
			
			return book;
		}
	
}
