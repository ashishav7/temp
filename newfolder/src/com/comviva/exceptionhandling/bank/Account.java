package com.comviva.exceptionhandling.bank;

public class Account {
    
	public long id;
	public long accNo;
	public double balance;
	public String username;
	public String bankName;
	
	//default, zero argument constructor
	Account() { };
	
	// one parameter constructor
	Account(long id) {
		this.id  = id;
	}

	public Account(String username, String bankName) {
		this.username = username;
		this.bankName = bankName;
	}
	
	public Account(long id, long accNo, double balance, String username, String bankName) {
		this.id = id;
		this.accNo = accNo;
		this.balance = balance;
		this.username = username;
		this.bankName = bankName;
	}

	
	
	
	
}
