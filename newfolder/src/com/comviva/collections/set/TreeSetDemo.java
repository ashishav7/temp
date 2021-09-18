package com.comviva.collections.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		// TreeSet : Allows to store unique elements and also arrange data in specific order.
		TreeSet<String> setOfUniqueNames = new TreeSet<>();

		setOfUniqueNames.add("John");
		setOfUniqueNames.add("Amar");
		setOfUniqueNames.add("Mike");
		setOfUniqueNames.add("Syed");
		setOfUniqueNames.add("Bob");
		setOfUniqueNames.add("John");

		System.out.println(setOfUniqueNames);

		System.out.println("-------------");
		for (String name : setOfUniqueNames) {
			System.out.println(name);
		}

		System.out.println("-------------");
		System.out.println(setOfUniqueNames.descendingSet());

		TreeSet<Integer> setOfNumbers = new TreeSet<Integer>();

		setOfNumbers.add(99);
		setOfNumbers.add(10);
		setOfNumbers.add(66);
		setOfNumbers.add(99);
		setOfNumbers.add(55);

		System.out.println("-------------");
		System.out.println(setOfNumbers);

		

	}

}
