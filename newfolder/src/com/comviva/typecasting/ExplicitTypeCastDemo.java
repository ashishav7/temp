package com.comviva.typecasting;

public class ExplicitTypeCastDemo {

	public static void main(String[] args) {
		// Explicit type cast : does not happen automatically
		/**
		 * Narrowing type cast: Converts data of incompatible type 
		 * Convert data from higher range value to lower range value.
		 * double => float => long => int => short => byte.
		 */
		
		double price = 1550.77;
		
		long bigPrice = (long) price;  // Narrowing => double -> long
		
		int intPrice = (int) bigPrice;  // Narrowing => long => int
		
		short shortPrice = (short) intPrice; // Narrowing => int => short
		
		byte bytePrice = (byte) price;  // Narrowing => double -> byte.
		
		float floatPrice = (float) price;
		
		System.out.println("Double Price : "+ price);
		System.out.println("Long Price : "+ bigPrice);
		System.out.println("Integer Price : "+ intPrice);
		System.out.println("Short Price : "+ shortPrice);
		System.out.println("Byte Price : "+ bytePrice);
		System.out.println("Float Price : "+ floatPrice);
		

	}

}
