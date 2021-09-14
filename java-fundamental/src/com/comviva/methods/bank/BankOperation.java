package com.comviva.methods.bank;

public class BankOperation {

	// show balance
	public double showBalance(Account account) {
		return account.balance;
	}

	// withdraw amount
	public double withdrawAmount(Account account, double amount) {

		if (amount < account.balance && amount > 0) {
			
			// account.balance = account.balance - amount;
			account.balance -= amount;
		} else {
			System.out.println("Invalid amount for withdraw");
		}
		return account.balance;
	}

	// deposit amount
	public double depositeAmount(Account account, double amount) {
       double dayLimit =1000;
       
		if (amount < dayLimit && amount > 0) {
			// account.balance = account.balance + amount;
			account.balance += amount;
		} else {
			System.out.println("Invalid amount for withdraw");
		}
		return account.balance;
	}

}
