package com.comviva.exceptionhandling.bank;

import com.comviva.exceptionhandling.bank.exception.AccountNotFound;
import com.comviva.exceptionhandling.bank.exception.InvalidTransaction;

public class BankOperation {

	// show balance
	public double showBalance(Account account) throws AccountNotFound {
		if(account == null) {
			throw new AccountNotFound("Account Not Found");
		}
		return account.balance;
	}

	// withdraw amount
	public double withdrawAmount(Account account, double amount) {

		if (amount < account.balance && amount > 0) {
			
			// account.balance = account.balance - amount;
			account.balance -= amount;
		} else {
			throw new InvalidTransaction("Insufficient Balance");
		}
		return account.balance;
	}

	// deposit amount
	public double depositeAmount(Account account, double amount) throws AccountNotFound {
       double dayLimit =1000;
       if(account == null) {
    	   throw new AccountNotFound("Account Not Found");
       }
		if (amount < dayLimit && amount > 0) {
			// account.balance = account.balance + amount;
			account.balance += amount;
		} else {
			System.out.println("Invalid amount for withdraw");
		}
		return account.balance;
	}

}
