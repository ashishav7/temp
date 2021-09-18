package com.comviva.collections.map.bank;

public class Account {
	
	public long id;
	public String accId;
	public double balance;
	public String email;
	public long fd;
	public Account(long id, String accId, double balance, String email,long fd) {
		super();
		this.id = id;
		this.accId = accId;
		this.balance = balance;
		this.email = email;
		this.fd = fd;
	}
	public Account() {
		super();
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", accId=" + accId + ", balance=" + balance + ", email=" + email + "]";
	}
	
}
