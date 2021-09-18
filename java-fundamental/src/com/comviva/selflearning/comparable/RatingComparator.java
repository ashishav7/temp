package com.comviva.selflearning.comparable;

import java.util.Comparator;

public class RatingComparator implements Comparator<Bus>{

	@Override
	public int compare(Bus o1, Bus o2) {
		return o1.getRatings().compareTo(o2.getRatings());
	}

}
