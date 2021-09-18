package com.comviva.accessmodifierB;

public class Brother {
	
	// default properties
	double money = 345345.546;
	String shoes = "Nike Shoes";
	
	// default methods
	void showMoney() {
		System.out.println("The brothers Money : "+ money );
	}
	
	String displayShoes() {
		return shoes;
	}
	
	// default constructor 
	// 	if you do not create a constructor, the default constructor is created by java compiler.
	public Brother() { }
	
}

