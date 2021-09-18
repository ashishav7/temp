package com.comviva.multithreading;

class Counter{
	int count = 0;
	
	public synchronized void increaseCount() {
		count++;
	}
	public void decreaseCount() {
		count--;
	}
}
public class ThreadSafeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		Thread t1 = new Thread(() ->{
			for(int i=0;i<1000;i++) {
				counter.increaseCount();
			}
		});
		
		Thread t2 = new Thread(() ->{
			for(int i=0;i<1000;i++) {
				counter.increaseCount();
			}
		});
		
		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(counter.count);
	}

}
