package com.chatapp.exception;

import java.time.LocalDateTime;

public class ErrorDetails {

	 private String error;
	 private String message;
	 private LocalDateTime timeStamp;
	 
	 
	   public ErrorDetails() {
		// TODO Auto-generated constructor stub
	  }
	 
    	public ErrorDetails(String error, String message, LocalDateTime timeStamp) {
		super();
		this.error = error;
		this.message = message;
		this.timeStamp = timeStamp;
	}

		public String getError() {
			return error;
		}

		public void setError(String error) {
			this.error = error;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public LocalDateTime getTimeStamp() {
			return timeStamp;
		}

		public void setTimeStamp(LocalDateTime timeStamp) {
			this.timeStamp = timeStamp;
		}
	 
	 
}
