package com.comviva.methods.bank;

public class Test {

	public static void main(String[] args) {

		// create a account object
		Account account = new Account(10001, 10001, 2000.20, "Iron man", "Iron Bank");

		// create a bank operation object
		BankOperation operation = new BankOperation();

		// call show balance
		double balance = operation.showBalance(account);

		System.out.println("The user " + account.username + " account has balance " + balance);
		System.out.println("-------------");

		// call withdraw amount
		double newBalance = operation.withdrawAmount(account, 100.2);

		System.out.println("After withdraw The user " + account.username + " account has balance " + newBalance);
		System.out.println("-------------");
		
		// call deposit amount
		double newBl=  operation.depositeAmount(account, 100.22);

		System.out.println("After deposit The user " + account.username + " account has balance " + newBl);
	}

}
