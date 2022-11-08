package com.masai.exceptions;

import java.time.LocalDateTime;

public class MyError {
	
	private LocalDateTime localDateTime;
	private String message;
	private String description;
	
	
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public MyError(LocalDateTime localDateTime, String message, String description) {
		super();
		this.localDateTime = localDateTime;
		this.message = message;
		this.description = description;
	}
	
	
	public MyError() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "MyError [localDateTime=" + localDateTime + ", message=" + message + ", description=" + description
				+ "]";
	}
	
	

}
