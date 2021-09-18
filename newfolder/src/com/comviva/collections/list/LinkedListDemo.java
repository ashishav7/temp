package com.comviva.collections.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> listOfCompanies= new LinkedList<String>();
		
		listOfCompanies.add("SIMPLILEARN");
		listOfCompanies.add("COMVIVA");
		listOfCompanies.add("DELL");
		listOfCompanies.add("WIPRO");
		listOfCompanies.add("SIMPLILEARN");
		
		
		for(String comp : listOfCompanies) {
			System.out.println(comp);
		}

	}
	
	// TODO : WAM to find company

}
