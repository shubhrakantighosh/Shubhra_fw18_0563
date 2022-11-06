package com.masai.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Book;

@RestController
@RequestMapping("/bookservice")
public class MyController {
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		return Arrays.asList(
				
				new Book(11,"name1","author1","publication1","category1",100,700,"G567"),
				new Book(12,"name2","author2","publication2","category2",200,800,"G568"),
				new Book(13,"name3","author3","publication3","category3",300,900,"G569"),
				new Book(14,"name4","author4","publication4","category4",400,1000,"G570"),
				new Book(15,"name5","author5","publication5","category5",500,1100,"G5671"),
				new Book(16,"name6","author6","publication6","category6",600,1200,"G5672"),
				new Book(17,"name7","author7","publication7","category7",700,1300,"G5673"),
				new Book(18,"name8","author8","publication8","category8",800,1400,"G5674"),
				new Book(19,"name9","author9","publication9","category9",900,1500,"G5675"),
				new Book(20,"name10","author10","publication10","category10",1000,1600,"G579")
				
				);
		
	}
	
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") Integer id) {
		
		Book book=new Book();
		
		List<Book>listOfBooks=Arrays.asList(
				
				new Book(11,"name1","author1","publication1","category1",100,700,"G567"),
				new Book(12,"name2","author2","publication2","category2",200,800,"G568"),
				new Book(13,"name3","author3","publication3","category3",300,900,"G569"),
				new Book(14,"name4","author4","publication4","category4",400,1000,"G570"),
				new Book(15,"name5","author5","publication5","category5",500,1100,"G5671"),
				new Book(16,"name6","author6","publication6","category6",600,1200,"G5672"),
				new Book(17,"name7","author7","publication7","category7",700,1300,"G5673"),
				new Book(18,"name8","author8","publication8","category8",800,1400,"G5674"),
				new Book(19,"name9","author9","publication9","category9",900,1500,"G5675"),
				new Book(20,"name10","author10","publication10","category10",1000,1600,"G579")
				
				);
		
		
		for(Book books:listOfBooks) {
			
			if(id==books.getBookId()) {
				book=books;
			}
			
		}
		
		return book;
		
	}
	
	
	
	
	

}


