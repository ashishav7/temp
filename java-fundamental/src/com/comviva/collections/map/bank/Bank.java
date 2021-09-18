package com.comviva.collections.map.bank;

import java.util.Map;

public class Bank {
	// open account
	public Map<Long, Account> openAccount(Map<Long, Account> accountMap,Account account){
		accountMap.put(account.id, account);
		return accountMap;
	}
	
	//show balance
	
	public void showBalance(Map<Long,Account> accountMap,long id) {
		boolean match = false;
		for(Map.Entry<Long, Account> entry: accountMap.entrySet()) {
			if(entry.getValue().id == id) {
				match = true;
				System.out.println("Account Name :" + entry.getValue().accId);
				System.out.println("Account Balance :" + entry.getValue().balance);
				System.out.println("Account E-mail :" + entry.getValue().email);
				break;
			}
		}
		if(!match) {
			System.out.println("Account Does Not Exist");
		}
	}
	public void listAllAccounts(Map<Long,Account> accountMap) {
		for(Map.Entry<Long, Account> entry: accountMap.entrySet()) {
			System.out.println("----------------------------------------");
			System.out.println("Account Name :" + entry.getValue().accId);
			System.out.println("Account Balance :" + entry.getValue().balance);
			System.out.println("Account E-mail :" + entry.getValue().email);
			System.out.println("----------------------------------------");
		}
	}
	
	public void deposit(Map<Long,Account> accountMap,long id,double amt) {
		boolean match = false;
		for(Map.Entry<Long, Account> entry: accountMap.entrySet()) {
			if(entry.getValue().id == id) {
				match = true;
				System.out.println("Account Name :" + entry.getValue().accId);
				System.out.println("Old Balance :" + entry.getValue().balance);
				entry.getValue().balance += amt; 
				System.out.println("New Balance :" + entry.getValue().balance);
				break;
			}
		}
		if(!match) {
			System.out.println("Account Does Not Exist");
		}
	}
	public void withdraw(Map<Long,Account> accountMap,long id,double amt) {
		boolean match = false;
		for(Map.Entry<Long, Account> entry: accountMap.entrySet()) {
			if(entry.getValue().id == id) {
				match = true;
				if(amt<=entry.getValue().balance) {
					System.out.println("Account Name :" + entry.getValue().accId);
					System.out.println("Old Balance :" + entry.getValue().balance);
					entry.getValue().balance -= amt; 
					System.out.println("New Balance :" + entry.getValue().balance);
					
				}
				else {
					System.out.println("Insufficient Balance");
				}
				break;
			}
		}
		if(!match) {
			System.out.println("Account Does Not Exist");
		}
	}
	
	public void fixedDeposit(Map<Long,Account> accountMap,long id,double amt,double time) {
		boolean match = false;
		double r = 0.04;
		if(time<2) {
			r = 0.04;
		}
		else if(time>=2 && time<3) {
			r = 0.045;
		}
		else if(time>=3 && time<4) {
			r = 0.05;
		}
		else if(time>=4 && time<5) {
			r = 0.055;
		}
		else if(time>=5) {
			r = 0.06;
		}
		double interest = (amt*time*r);
		for(Map.Entry<Long, Account> entry: accountMap.entrySet()) {
			if(entry.getValue().id == id) {
				match = true;
				if(entry.getValue().balance>=amt) {
					System.out.println("Account Name :" + entry.getValue().accId);
					System.out.println("Old Balance :" + entry.getValue().balance);
					entry.getValue().balance -= amt; 
					System.out.println("Interest you will get = " + interest);
					System.out.println("New Balance :" + entry.getValue().balance);
					double finalValue = amt + interest;
					System.out.println("Fd after maturity = " + finalValue);
				}
				else {
					System.out.println("Insufficient Balance for fd");
				}
				break;
			}
		}
		if(!match) {
			System.out.println("Account Does Not Exist");
		}
	}
} 
