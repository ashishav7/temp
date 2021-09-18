package com.comviva.innerclass;

//outer class
public class OuterTest {
	
	private double amount = 345456.67;
	private String username = "mikesmith";
	
	//inner class : non static inner class
	class InnerTest {
		
		private String message = "Hello & welcome everyone !";
		
		public void showData() {
			System.out.println("Outer class data : "+ amount);
			System.out.println("Outer class username "+username);
			System.out.println("Inner class message "+message);
		}
		
	}  //inner class	
	
	public static void main(String[] args) {
		
		//create a outer class object
		OuterTest outer = new OuterTest();
		
		//create a inner class object
		InnerTest inner = outer.new InnerTest();

		inner.showData();
	}

} // outer class
