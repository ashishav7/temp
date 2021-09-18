package com.comviva.accessmodifier;

public class PrivateAccessModifier {

	public static void main(String[] args) {
		
		// create Account object		
		Account account = new Account();
		
		
		// private properties
//		System.out.println(account.id);
//		System.out.println(account.balance);
//		System.out.println(account.username);
//		System.out.println(account.password);
		
		
		//private method
//	    account.showBalance();
//		account.showId();
//		account.getUsername();
//		
		account.showCred();

	}

}


class Account {
	
	// private data properties
	private long id = 1000001;
	private double balance= 344554.546;
	private String username = "mike123";
	private String password = "mikey@123";
	
	// private methods
	private void showBalance() {
		System.out.println("The Balance : "+ balance);
	}
	
	private long showId() {
		return id;
	}
	
	private String getUsername() {
		return username;
	}
	
	public void showCred() {
		System.out.println("The Username : "+ username +" & the password : "+password);
	}
	
	// private constructor
	// private Account() {};	
	// Note : Private Constructor based class can not be instantiated.
}