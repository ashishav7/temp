package com.comviva.arrays;

import java.util.Scanner;

public class BankOperations {

	static String[] usernames = { "John Smith", "Mike Smith", "David Miller", "Rajan Ram", "Robert Kim" };
	static int[] userIds = { 10001, 10002, 10003, 10004, 10005 };
	static double[] balances = { 85435.45, 34345.454, 99576.6, 65756, 8789.456 };

	public static void main(String[] args) {

		// step 1. Collect input from user
		Scanner input = new Scanner(System.in);

		System.out.println("--------------------------------------");
		System.out.println(" :: Welcome Iron bank ::");
		System.out.println("--------------------------------------");

		System.out.println(" :: Enter userId ::");

		int userId = input.nextInt();;

		findUser(userId);

	}

	// find user
	private static void findUser(int userId) {
		int match = 0;
		// iterate over all userIds
		for (int index = 0; index < userIds.length; index++) {
			// find the userId match
			if (userIds[index] == userId) {
				System.out.println("User is found with userId " + userId);
				System.out.println("User account name " + usernames[index]);
				System.out.println("User account balance  " + balances[index]);
				match++;
			}

		}

		if (match == 0) {
			System.out.println("User is not found with userId : " + userId);
		}

	}

	// show balance
	// withdraw
	// deposit

}
