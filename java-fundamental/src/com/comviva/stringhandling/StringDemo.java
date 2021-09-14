package com.comviva.stringhandling;

public class StringDemo {

	public static void main(String[] args) {

		String username = "John";

		String name = "John";

		// Each time you create a string literal, the JVM checks the "string constant
		// pool" first.
		// If the string already exists in the pool, a reference to the pooled instance
		// is returned.
		// string literal verification
		if (username == name) {
			System.out.println("Same String !");
		} else {
			System.out.println("Different String !");
		}

		System.out.println("------------");
		// String by new keyword
		// Each Time new keyword is going to generate new string reference.
		String str1 = new String("Will");
		String str2 = new String("Will");
		
		if (str1 == str2) {
			System.out.println("Same String !");
		} else {
			System.out.println("Different String !");
		}

	}

}
