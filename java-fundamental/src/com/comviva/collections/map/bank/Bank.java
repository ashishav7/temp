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
} 
