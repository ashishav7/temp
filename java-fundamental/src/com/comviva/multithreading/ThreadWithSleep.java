package com.comviva.multithreading;

public class ThreadWithSleep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(()->{
			System.out.println("Thread t1 is working");	
		});
		
		Thread t2 = new Thread(()->{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Thread t2 is working");	
		});
		
		Thread t3 = new Thread(()->{
			System.out.println("Thread t3 is working");	
		});
		
		t1.start();
		t2.start();
		t3.start();
	}

}
