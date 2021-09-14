package com.comviva.typecasting;

import java.util.Scanner;

public class NumericDataConvertor {

	public static void main(String[] args) {
		// step 1. Collect input from user
		Scanner input =  new Scanner(System.in);
		
		System.out.println("--------------------------------------");
		System.out.println(" :: Welcome to numeric convertor ::");
		System.out.println(" :: Enter a integer number value ::");
		System.out.println("--------------------------------------");
		
		int userInput = input.nextInt();
		
		System.out.println("User Input : "+userInput);
		
		// step 2. Convert user input into numeric types
		// implicit conversion
		long bigValue = userInput;
		float floatValue = userInput;
		double doubleValue = userInput;
		
		// explicit type cast
		byte byteValue = (byte) userInput;
		short shortValue = (short) userInput;	
		
		// step 3. Print Response
		System.out.println("--- Implicit & Explicit Converted values ---");
		System.out.println("Byte Value : "+byteValue);
		System.out.println("Short Value : "+shortValue);
		System.out.println("Double Value : "+doubleValue);
		System.out.println("Float Value : "+floatValue);
		System.out.println("Long Value : "+bigValue);
		
		input.close();

	}

}
