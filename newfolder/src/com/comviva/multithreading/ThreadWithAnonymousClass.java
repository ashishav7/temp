package com.comviva.multithreading;

public class ThreadWithAnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable threadObj = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread working");
			}
		};
		Thread t1 = new Thread(threadObj);
		t1.start();
	
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread2 working");
			}
		});
		t2.start();
	}

}