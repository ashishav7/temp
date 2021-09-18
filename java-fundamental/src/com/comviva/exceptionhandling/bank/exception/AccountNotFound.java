package com.comviva.exceptionhandling.bank.exception;

// create a checked exception
public class AccountNotFound extends Exception{

	String message;
	public AccountNotFound(String message){
		super(message);
		this.message = message;
	}
	@Override
	public String toString() {
		return "Account Not Found [message=" + message + "]";
	}
}
