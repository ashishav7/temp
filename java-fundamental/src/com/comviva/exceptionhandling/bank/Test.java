package com.comviva.exceptionhandling.bank;

import com.comviva.exceptionhandling.bank.exception.AccountNotFound;
import com.comviva.exceptionhandling.bank.exception.InvalidTransaction;

public class Test {

	public static void main(String[] args) {

		// create a account object
		Account account = new Account(10001, 10001, 2000.20, "Iron man", "Iron Bank");

		// create a bank operation object
		BankOperation operation = new BankOperation();

		// call show balance
		double balance = 0;
		try {
			balance = operation.showBalance(account);
		} catch (AccountNotFound e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Class " + e.getClass());
			System.out.println("Excecption Message " + e.getMessage());
		}

		System.out.println("The user " + account.username + " account has balance " + balance);
		System.out.println("-------------");

		// call withdraw amount
		try {
		double newBalance = operation.withdrawAmount(account, 2100.2);

		System.out.println("After withdraw The user " + account.username + " account has balance " + newBalance);
		System.out.println("-------------");
		}
		catch (InvalidTransaction e) {
			System.out.println("Exception Class " + e.getClass());
			System.out.println("Excecption Message " + e.getMessage());
		}
		// call deposit amount
		
		try {
			double newBl;
			newBl = operation.depositeAmount(account, 100.22);
			System.out.println("After deposit The user " + account.username + " account has balance " + newBl);
		} catch (AccountNotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
