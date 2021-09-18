package com.comviva.arrays;

import java.util.Arrays;

public class MultiDimentionalArrayDemo {

	public static void main(String[] args) {
		
		int[][] values =  { {2,4,6,8,10},{3,5,9,11,13}};
		
		System.out.println(Arrays.toString(values[0]));
		System.out.println(Arrays.toString(values[1]));

		System.out.println("-------------------");
		//iterate two dimensional array
		
		for (int row = 0; row < values.length; row++) {
			System.out.println(Arrays.toString(values[row]));
			for (int col = 0; col < values[row].length; col++) {
				System.out.println("Row : " +row +" Col : "+ col + " data :> " + values[row][col]);
			}
		}
	}

}
