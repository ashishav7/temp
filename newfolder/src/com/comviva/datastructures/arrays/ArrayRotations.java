package com.comviva.datastructures.arrays;

import java.util.Arrays;

public class ArrayRotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] items = {-15,23,40,34,78,67,50};
		rotateRight(items,3);
	}

	private static void rotateRight(int[] items, int i) {
		// create temp array
		int temp[] = new int[i];
		
//		shift elements to temp array
		for(int j=0;j<i;j++) {
			temp[j] = items[j];
		}
		
//		rotate actual array
		for(int j=i;j<items.length;j++) {
			items[j-i] = items[j];
		}
		
		for(int j=0;j<i;j++) {
			items[j+items.length-i] =temp[j];
		}
		
		System.out.println(Arrays.toString(items));

	}
}
