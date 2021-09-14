package com.comviva.typecasting;

public class ImplicitTypeCastDemo {

	public static void main(String[] args) {
		// Implicit Type cast : Automatically type cast
		/**
		 * Widening Type cast : Converts data from lower range value to higher range type.
		 * byte -> short  -> int -> long -> float -> double.
		 */

		byte smallCount = 100;  // -128 to 127  => 1 byte  => 8 bit
		
		int intCount = smallCount;  // widening  => byte -> int

		long bigCount = intCount;   // widening  => int -> long
		
		float floatCout = intCount;  // widening => int => float
		
		double decimalCount = bigCount; // widening => long => double.
		
		System.out.println("Byte Count : "+ smallCount);
		System.out.println("Integer Count : "+ intCount);
		System.out.println("Long Count : "+ bigCount);
		System.out.println("Float Count : "+ floatCout);
		System.out.println("Double Count : "+ decimalCount);
	}

}
