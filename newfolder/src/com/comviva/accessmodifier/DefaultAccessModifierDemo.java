package com.comviva.accessmodifier;

public class DefaultAccessModifierDemo {

	public static void main(String[] args) {
		
		// create object
		Brother brother = new Brother();
		
		//access default properties
		System.out.println("The Money : "+brother.money);
		System.out.println("The Shoes : "+brother.shoes);
		
		// access methods
		brother.showMoney();
		String shoes = brother.displayShoes();
		System.out.println("The Brothers Shoes : "+shoes);
	}

}

class Brother {
	
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
	Brother() { }
	
}
