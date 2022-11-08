package com.masai.exceptions;

import java.time.LocalDateTime;

public class MyError {
	
	private LocalDateTime dateTime;
	private String message;
	private String description;
	
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
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
	
	
	public MyError(LocalDateTime dateTime, String message, String description) {
		super();
		this.dateTime = dateTime;
		this.message = message;
		this.description = description;
	}
	
	
	public MyError() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "MyError [dateTime=" + dateTime + ", message=" + message + ", description=" + description + "]";
	}

}
