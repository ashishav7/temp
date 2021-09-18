package com.comviva.collections.list;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Double> listOfPrice = new Vector<Double>();
		
		listOfPrice.add(998.34);
		listOfPrice.add(54998.34);
		listOfPrice.add(787998.34);
		listOfPrice.add(787998.34);
		listOfPrice.add(789998.34);
		listOfPrice.add(92398.34);
		
		double grandTotal = 0;
		
		for(Double price : listOfPrice) {
			grandTotal+=price;
		}

		System.out.println(grandTotal);
	}

}
