package com.comviva.innerclass;

//outer class
public class OuterTest2 {
	
	private static double amount = 345456.67;
	private static String username = "mikesmith";
	
	//inner class : static inner class
	static class InnerTest {
		
		private String message = "Hello & welcome everyone !";
		
		public void showData() {
			System.out.println("Outer class data : "+ amount);
			System.out.println("Outer class username "+username);
			System.out.println("Inner class message "+message);
		}
		
	}  //inner class	
	
	public static void main(String[] args) {
		
		//create a inner class object with outer class refence.
		InnerTest inner = new OuterTest2.InnerTest();
		
		inner.showData();
	}

} // outer class
