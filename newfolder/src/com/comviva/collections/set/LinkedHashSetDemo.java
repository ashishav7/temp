package com.comviva.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		// LinkedHashSet : stores unique element and also preserve insertion order.
		Set<String> setOfBrands = new LinkedHashSet<String>();
		
		setOfBrands.add("NIKE");
		setOfBrands.add("ADIDAS");
		setOfBrands.add("PUMA");
		setOfBrands.add("GUCCI");
		setOfBrands.add("NIKE");
		
		System.out.println(setOfBrands);
		
		System.out.println("---------");
		for(String brand : setOfBrands) {
			System.out.println(brand);
		}

	}

}
