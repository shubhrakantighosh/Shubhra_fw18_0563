package com.masai.Question3;

public class Book {

	
	private String bookName;
	private String BookAuthor;
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	
	
	public Book(String bookName, String bookAuthor) {
		super();
		this.bookName = bookName;
		BookAuthor = bookAuthor;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", BookAuthor=" + BookAuthor + "]";
	}

	
}
