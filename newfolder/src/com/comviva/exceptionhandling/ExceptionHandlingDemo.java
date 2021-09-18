package com.comviva.exceptionhandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int totalBalance = 5000;
			int userCount = 0;
			int result = totalBalance/userCount;
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
	}

}
