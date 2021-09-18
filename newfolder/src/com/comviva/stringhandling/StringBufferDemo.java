package com.comviva.stringhandling;

public class StringBufferDemo {

	public static void main(String[] args) {
		// StringBuffer is used to create a mutable.
		StringBuffer message= new StringBuffer("Today is a good day! ");
		
		System.out.println(message);
		
		//update the string 
		message.append("Happy learning !");
		System.out.println(message);
		
		//replace text
		message.replace(0, 5, "tomorrow");
		System.out.println(message);
		
		//delete
		message.delete(0, 8);
		System.out.println(message);
		
		
	}

}
