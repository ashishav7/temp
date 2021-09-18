package com.comviva.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {

		// List -> Order collection of data with duplicates elements.
		// List (interface) -> imp classes -> ArrayList, LinkedList , Vector , Stack
		
		//decleration
		List<String> list1 = new ArrayList<String>();  // backed by dynamic array, not thread safe, read operations
		List<String> list2 = new LinkedList<String>(); // backed by doubly linked list, not thread, insert, update ,delete
		List<String> list3 = new Vector<String>();     // old legacy collection , thread safe
		List<String> list4 = new Stack<String>();      // old legacy collection , thread safe.
		
		
		
		List<String> users = new LinkedList<String>();
		
		// add data in array list
		users.add("John");
		users.add("Bob");
		users.add("David");
		users.add("Marry");
		users.add("Ava");
		users.add("John");
		// users.add(6565);
		
		System.out.println(users);
		System.out.println("The element at index 2 : "+users.get(2));
		
		// add data at specific index
		users.add(2, "Anushka");
		System.out.println(users);
		
		// iterate users collections
		for (int index = 0; index <users.size(); index++) {
			System.out.println("The index "+index +" user is "+users.get(index));
		}
		
		System.out.println("-------------------");
		// enhanced for loop
		for(String u : users) {
			System.out.println(u);
		}
		
		System.out.println("-------------------");
		Iterator<String> itr = users.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
