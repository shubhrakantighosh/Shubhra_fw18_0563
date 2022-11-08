package com.masai.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {

	
	@ExceptionHandler(AccountException.class)
	public ResponseEntity<MyError> myError(AccountException accountException, WebRequest request){
		
		MyError error=new MyError();
		error.setDateTime(LocalDateTime.now());
		error.setMessage(accountException.getMessage());
		error.setDescription(request.getDescription(false));
		
		return new ResponseEntity<MyError>(error,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(InstantiationException.class)
	public ResponseEntity<MyError> myError(InstantiationException instantiationException, WebRequest request){
		
		MyError error=new MyError();
		error.setDateTime(LocalDateTime.now());
		error.setMessage(instantiationException.getMessage());
		error.setDescription(request.getDescription(false));
		
		return new ResponseEntity<MyError>(error,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyError> myError(Exception exception, WebRequest request){
		
		MyError error=new MyError();
		error.setDateTime(LocalDateTime.now());
		error.setMessage(exception.getMessage());
		error.setDescription(request.getDescription(false));
		
		return new ResponseEntity<MyError>(error,HttpStatus.BAD_REQUEST);
	}
	
}
