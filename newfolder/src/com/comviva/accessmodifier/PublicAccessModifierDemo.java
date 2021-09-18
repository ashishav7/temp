package com.comviva.accessmodifier;

public class PublicAccessModifierDemo {

	public static void main(String[] args) {
		
		// create father class object
		Father father = new Father();
		
		System.out.println("The Amount : "+father.amount);
		System.out.println("The Park : "+father.park);
		
		System.out.println("---------------");
		father.showAmount();
		System.out.println(father.displayPark());
		
	}

}


class Father {
	
	// public variable / properties
	public double  amount = 43534.343;
	public String park  ="Public Park";
	
	// public methods
	public void showAmount() {
		System.out.println("The amount is : "+ amount);
	}

	public String displayPark() {
		return park;
	}
	
	// public constructor.
	public Father() {};
	
}
