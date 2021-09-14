package com.comviva.collections.map.bank;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BankOperation {

	public static void main(String[] args) {
		//create account Objects
				Account acc1 = new Account(10001,"John Snow",987623.23,"john.snow@gmail.com");
				Account acc2 = new Account(10002,"Arya Stark",97623.23,"arya.stark@gmail.com");
				Account acc3 = new Account(10003,"Ava Smith",187623.23,"ava.smith@gmail.com");
				Account acc4 = new Account(10004,"David Miller",777623.23,"david.miller@gmail.com");
				Account acc5 = new Account(10005,"Marry James",667623.23,"marry.james@gmail.com");
				
				// Account Map
				Map<Long, Account> accountMap = new HashMap<Long,Account>();
				
				accountMap.put(10001L, acc1);
				accountMap.put(10002L, acc2);
				accountMap.put(10003L, acc3);
				accountMap.put(10004L, acc4);
				accountMap.put(10005L, acc5);
				
		
				Bank b  = new Bank();
					
		System.out.println("---------------------------------------------");
		System.out.println("       :: Welcome to Banking System ::       ");
		System.out.println("---------------------------------------------");
		
		Scanner input = new Scanner(System.in);
		boolean status = true;
		do {
			System.out.println("1)Open Account \n2)Show Balance \n3)Deposit \n4)Close Account \n5)Print All Account \n6)Any other key to exit");
			
			int choice = input.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter account number ");
				long accNo = input.nextLong();
				
				System.out.println("Enter account name ");
				String name = input.next();
				
				System.out.println("Enter account balance ");
				double balance = input.nextDouble();
				
				System.out.println("Enter account email ");
				String email = input.next();
				
				accountMap = b.openAccount(accountMap,new Account(accNo,name,balance,email));
				break;
			case 2:
				System.out.println("Enter account number ");
			    long acccNo = input.nextLong();
				b.showBalance(accountMap, acccNo);
				break;
			case 3:
				System.out.println("Functionality will be added soon");
				break;
			case 4:
				System.out.println("Functionality will be added soon");
				break;
			case 5:
				b.listAllAccounts(accountMap);
				break;
			default:
				System.out.println("Thank you for using the Bank");
				status = false;
				break;
			}
			
		} while(status);
		
		
		//interest rates
		//deposit
		//withdraw
		
		
		
//		System.out.println(accountMap);
		
		//iterate over a map
//		for(Map.Entry<Long, Account> entry: accountMap.entrySet()) {
//			System.out.println(entry.getKey());
//		}
		
	}

}
