package com.comviva.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Long>  phoneBook = new HashMap<String, Long>();
		
		phoneBook.put("John", 9898989898L);
		phoneBook.put("Mike", 9898989888L);
		phoneBook.put("Emma", 9898989877L);
		phoneBook.put("William", 9898989866L);
		phoneBook.put("Tony", 9898989822L);
		phoneBook.put("Ava", 9898989833L);
		
		System.out.println(phoneBook);
		//search data in phonebook
		System.out.println("William's number "+ phoneBook.get("William"));
		System.out.println("Tony's numbers "+ phoneBook.get("Tony"));
		
	}

}
