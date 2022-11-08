package com.masai.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<MyError> myError(EmployeeException emp,WebRequest request){
		
		MyError myError=new MyError();
		myError.setLocalDateTime(LocalDateTime.now());
		myError.setMessage(emp.getMessage());
		myError.setDescription(request.getDescription(false));
		
		return new ResponseEntity<MyError>(myError,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyError> myError(Exception exception,WebRequest request){
		
		MyError myError=new MyError();
		myError.setLocalDateTime(LocalDateTime.now());
		myError.setMessage(exception.getMessage());
		myError.setDescription(request.getDescription(false));
		
		return new ResponseEntity<MyError>(myError,HttpStatus.BAD_REQUEST);
		
	}
	

}
