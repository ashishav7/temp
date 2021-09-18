package com.comviva.datastructures.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] items = {-15,23,40,34,78,67,50};
		displayForward(items);
		System.out.println("----------------------");
		displayReverse(items);
	}
	static void displayForward(int[] items) {
		for(int i=0;i<items.length;i++) {
			System.out.print(items[i] + " ");
		}
		System.out.println(" ");
	}
	static void displayReverse(int[] items) {
		for(int i=items.length-1;i>=0;i--) {
			System.out.print(items[i] + " ");
		}
		System.out.println(" ");
	}

}
