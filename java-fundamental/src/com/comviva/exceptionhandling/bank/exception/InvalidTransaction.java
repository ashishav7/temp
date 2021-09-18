package com.comviva.exceptionhandling.bank.exception;

// unchecked exception
public class InvalidTransaction extends RuntimeException {
	
	String message;

	public InvalidTransaction(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String toString() {
		return "Invalid Transaction [message=" + message + "]";
	}
	
}
