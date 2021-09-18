package com.comviva.methods;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Arithmetic calculation
		ArithmeticCalculator ac = new ArithmeticCalculator();

		// step 1. Collect input from user
		Scanner input = new Scanner(System.in);

		System.out.println("--------------------------------------");
		System.out.println(" :: Welcome to arithmatic calculator ::");
		System.out.println("--------------------------------------");

		System.out.println(" :: Enter a first number value ::");
		int x = input.nextInt();
		
		System.out.println(" :: Enter a second number value ::");
		int y =  input.nextInt();

		System.out.println(" First number : " + x);
		System.out.println(" Second number : " + y);
		System.out.println("----------------");
		System.out.println(" Addition of numbers : " + ac.add(x, y));
		System.out.println(" Substraction of numbers : " + ac.sub(x, y));
		System.out.println(" Multiplication of numbers : " + ArithmeticCalculator.mul(x, y));
		System.out.println(" Division of numbers : " + ArithmeticCalculator.div(x, y));
	}

}

class ArithmeticCalculator {

	// add
	public float add(int num1, int num2) {
		float result = num1 + num2;
		return result;
	}

	// sub
	public float sub(int num1, int num2) {
		float result = num1 - num2;
		return result;
	}

	// div
	public static float div(int num1, int num2) {
		float result = num1 / num2;
		return result;
	}

	// mul
	public static float mul(int num1, int num2) {
		float result = num1 * num2;
		return result;
	}

	// avg
	public static float avg(int num1, int num2) {
		float result = (num1 + num2) / 2;
		return result;
	}

}