package com.comviva.multithreading;


class Customer {
	double balance = 1000.0;
	
	synchronized void deposit(double amt) {
		System.out.println("Going to deposit ");
		balance+=amt;
		System.out.println("Amount deposited!! Balance = " + balance);
		
		// resume blocking thread
		notify();
	}
	synchronized void withdraw(double amt) {
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(balance>=amt) {
			balance-=amt;
			System.out.println("Amount Withdrawn!! Balance = " + balance);
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
	synchronized void showBalance() {
		System.out.println("Balance " + balance);
	}
}
public class ThreadWithWait {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		
		Thread t1 = new Thread(()->{
			customer.withdraw(3000);
		});
		
		Thread t2 = new Thread(()->{
			customer.showBalance();
		});
		Thread t3 = new Thread(()->{
			customer.deposit(5000);
		});
		
		t1.start();
		t2.start();
		t3.start();
	}

}
