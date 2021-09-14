package com.comviva.multithreading;

public class ThreadWithLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2 = new Thread(() -> {
				System.out.println("Thread2 working");
		});
		t2.start();

	}

}
