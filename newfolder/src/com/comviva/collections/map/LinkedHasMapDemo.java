package com.comviva.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMapDemo {

	public static void main(String[] args) {

		Map<String, Double> groceries = new LinkedHashMap<String, Double>();

		groceries.put("Olive Oil", 987.33);
		groceries.put("Milk", 987.346);
		groceries.put("Vegi", 86576.546);
		groceries.put("Tea", 556.56);
		groceries.put("Coffee", 8856.56);
		

		System.out.println(groceries);
		System.out.println(groceries.get("Milk"));
	}

}
