package com.comviva.multithreading;

public class ThreadDemo extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo mainThread = new ThreadDemo();
		
		mainThread.start();
	}

	@Override
	public void run() {
		// thread processing logic
		System.out.println("The Main Thread is Running");
		
	}
}
