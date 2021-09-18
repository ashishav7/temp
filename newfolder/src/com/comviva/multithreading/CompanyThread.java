package com.comviva.multithreading;

public class CompanyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bob bob = new Bob();
		Thread t1 = new Thread(bob);
		t1.start();
	
		Ashish ash = new Ashish();
		Thread t2 = new Thread(ash);
		t2.start();
	
	}
}

class Task{
	void updateWork() {
		System.out.println("update work action");
	}
}

class Bob extends Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Bob is Working");
		updateWork();
	}
	
}

class Ashish implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Ashish is Working");
	}
	
}