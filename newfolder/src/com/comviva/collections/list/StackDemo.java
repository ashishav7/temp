package com.comviva.collections.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> listOfFruits = new Stack<String>();
		
		listOfFruits.add("Apple");
		listOfFruits.add("Orange");
		listOfFruits.add("Kiwi");
		listOfFruits.add("Mango");
		listOfFruits.add("Apple");
		listOfFruits.add("Banana");
		
		System.out.println(listOfFruits);

	}

}
