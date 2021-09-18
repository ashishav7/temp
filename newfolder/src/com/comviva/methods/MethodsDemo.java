package com.comviva.methods;

public class MethodsDemo {

	public static void main(String[] args) {
		
		// method calling for non static 
		MethodsDemo demo = new MethodsDemo();
		
		// zero argument method call.
		demo.showMessage();		
		// one argument method call.
		demo.displayAuthor("John Smith");
		demo.ageCalculator(1990);
		
		System.out.println("-----------------------");
		// calling static method with class name reference
		MethodsDemo.displayDetails("Will Smith", "He is an actor.");
		MethodsDemo.displayDetails("Waheed Khan", "He is a trainer.");		
		MethodsDemo.getUserInfo("Ava Smith", 20, false);
		
	}
	
	// methods types
	// 1. predefined methods
	// 2. user defined methods
	    // 1. non parameterized method
	    // 2. parameterized method
	
	
	// method declaration / method definition
	// non parameterized method
	public void showMessage() {
		System.out.println("Welcome to java method.");
	}
	
	// one parameterized method
	public void displayAuthor(String author) {
		System.out.println("The Author : "+ author);
	}
	
	public void ageCalculator(int yearOfBirth) {
		int age = 2021 - yearOfBirth;
		System.out.println("The user age : "+age);
	}
	
	// multi parameterized method
	public static void displayDetails(String username, String description) {
		System.out.println("The user , "+username + " and its description "+description);
	}
	
	public static void getUserInfo(String username, int age, boolean isMarried) {
		System.out.println("The user "+username +" has age "+age +" and he/she is married "+isMarried);
	}
	

}
