package com.comviva.multithreading;

public class OrganizationThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		John t1 = new John();
		t1.start();
		
		Mike t2 = new Mike();
		t2.start();
		Ava t3 = new Ava();
		t3.start();
	}
}

class John extends Thread{
	@Override
	public void run() {
		System.out.println("John thread is running");
	}
	
}


class Mike extends Thread{
	
	@Override
	public void run() {
		System.out.println("Mike thread is running");
	}
}

class Ava extends Thread{
	
	@Override
	public void run() {
		System.out.println("Ava thread is running");
	}
}
