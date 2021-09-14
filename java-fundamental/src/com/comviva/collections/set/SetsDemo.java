package com.comviva.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {

		// Set is child interface in Collection
		// Set do not store duplicate values
		// Implementation class : HashSet , LinkendHashSet, TreeSet.

		// decleration
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		Set<String> set3 = new TreeSet<String>();
		
		// HashSet : stores unique element but does not preserve insertion order.
		// set of unique companies
		Set<String> setOfUniqueCompanies = new HashSet<String>();
		
		setOfUniqueCompanies.add("SIMPLILEARN");
		setOfUniqueCompanies.add("CISCO");
		setOfUniqueCompanies.add("DELL");
		setOfUniqueCompanies.add("COMVIVA");
		setOfUniqueCompanies.add("SIMPLILEARN");
		
		boolean response = setOfUniqueCompanies.add("DELL");
		
		System.out.println("Response "+response);
		System.out.println(setOfUniqueCompanies);
		
		System.out.println("---------------");
		//iterate hashset
		for(String comp : setOfUniqueCompanies) {
			System.out.println(comp);
		}
		
	}

}
