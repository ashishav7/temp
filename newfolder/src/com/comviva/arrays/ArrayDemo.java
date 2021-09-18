package com.comviva.arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int numbers[] = new int[10];
		String[] users = new String[20];
		boolean[] status = new boolean[2];
		
		//adding data into array
		numbers[0] = 22;
		numbers[1] = 33;
		numbers[2] = 44;
		numbers[3] = 55;
		numbers[4] = 66;
		
		// add data into string array
		users[0] = "john";
		users[1] = "syed";
		users[2] = "will";
		users[3] = "david";
		
		// add data inot boolean array
		status[0] = false;
		status[1] = true;
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.toString(users));

		System.out.println(Arrays.toString(status));
	}

}
