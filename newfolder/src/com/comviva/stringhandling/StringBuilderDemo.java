package com.comviva.stringhandling;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		// StringBuilder is used for mutable string  but it non thread safe
		StringBuilder text = new StringBuilder("Today is a wondefull day!");
		
		System.out.println(text);
		
		// update string
		//append
		text.append("Happy session.");
		System.out.println(text);
		
		//replace
		text.replace(0, 5, "This day ");
		System.out.println(text);
		
		//delete text
		text.delete(0, 10);
		System.out.println(text);
		
		//insert text
		text.insert(0, "Welcome today ");
		System.out.println(text);
	}

}
