package com.comviva.stringhandling;

public class StringImmutableTest {

	public static void main(String[] args) {
		
		// In java, string objects are immutable.
		// Immutable mean unmodifiable or unchangeable values.
		String username ="John";
		
		// concat()  -> update string 
		String response = username.concat(" Snow");
		
		System.out.println("username : " +username);  // old name => old string
		
		System.out.println("response : "+ response);  // new name => new string

	}

}
