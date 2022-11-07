package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.BookNotFoundException;
import com.masai.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {

	private List<Book>books=new ArrayList<>();

	public BookController() {
		
		books.add(new Book(1,"b1", "a1", 700));
		books.add(new Book(2,"b2", "a2", 600));
		books.add(new Book(3,"b3", "a3", 500));
		books.add(new Book(4,"b4", "a4", 400));
		books.add(new Book(5,"b5", "a5", 300));
		
	}
	
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks() throws BookNotFoundException{
		
		if(books.size()!=0) {
			
			return new ResponseEntity<List<Book>>(books,HttpStatus.OK);
			
		}else
			throw new BookNotFoundException("Empty.");
		
	}
	
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBook(@PathVariable("id") Integer id) throws BookNotFoundException{
		
		Book b=new Book();
		
		boolean flag=true;
		
		for(Book book:books) {
			
			if(id==book.getBookId()) {
				flag=false;
				
				b=book;
			}
			
		}
		
		if(flag)
			throw new BookNotFoundException("Not Found.");
		
		
		return new ResponseEntity<Book>(b,HttpStatus.OK);
		
	}
	
	
	@PostMapping("/books")
	public ResponseEntity<String> saveBook(@RequestBody Book book) throws BookNotFoundException{
		
		boolean flag=false;
		
		for(Book b:books) {
			
			if(b.getBookId()==book.getBookId()) {
				flag=true;
			}
			
		}
		
		if(flag) {
			throw new BookNotFoundException("Already Exits");
			
		}else
			books.add(book);
		return new ResponseEntity<String>("Added.",HttpStatus.OK);

		
	}
	
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable("id") Integer id) throws BookNotFoundException{
		
		boolean flag=books.removeIf(s->s.getBookId()==id);
		
		if(flag==false) {
			throw new BookNotFoundException("Book not exit.");
			
		}else
			return new ResponseEntity<String>("Deleted.",HttpStatus.OK);

		
	}

	
	@PutMapping("/books/{id}/{name}")
	public ResponseEntity<String> bookUpdate(@PathVariable("id") Integer id, @RequestParam("name") String name) throws BookNotFoundException{
		
		boolean flag=true;
		
		for(Book book:books) {
			
			if(id==book.getBookId()) {
				book.setName(name);
				flag=false;
			}
			
		}
		
		if(flag)
			throw new BookNotFoundException("Not Found.");
		
		
		return new ResponseEntity<String>("Updated",HttpStatus.OK);
		
	}
		
	
	
}
