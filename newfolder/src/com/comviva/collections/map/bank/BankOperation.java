package com.comviva.collections.map.bank;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BankOperation {

	public static void main(String[] args) {
		//create account Objects
				Account acc1 = new Account(10001,"John Snow",987623.23,"john.snow@gmail.com",0);
				Account acc2 = new Account(10002,"Arya Stark",97623.23,"arya.stark@gmail.com",0);
				Account acc3 = new Account(10003,"Ava Smith",187623.23,"ava.smith@gmail.com",0);
				Account acc4 = new Account(10004,"David Miller",777623.23,"david.miller@gmail.com",0);
				Account acc5 = new Account(10005,"Marry James",667623.23,"marry.james@gmail.com",0);
				
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
			System.out.println("1)Open Account \n2)Show Balance \n3)Deposit \n4)Close Account \n5)Print All Account \n6)Fixed Deposit \n7)Any other key to exit");
			
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
				
				accountMap = b.openAccount(accountMap,new Account(accNo,name,balance,email,0));
				break;
			case 2:
				System.out.println("Enter account number ");
			    long acccNo = input.nextLong();
				b.showBalance(accountMap, acccNo);
				break;
			case 3:
				System.out.println("Enter account number ");
			    long accccNo = input.nextLong();
				System.out.println("Enter the amount you want to deposit");
				double amt = input.nextDouble();
				if(amt>=0) {
					b.deposit(accountMap, accccNo, amt);
				}
				else {
					System.out.println("Invalid amount");
				}
				break;
			case 4:
				System.out.println("Enter account number ");
			    long acNo = input.nextLong();
				System.out.println("Enter the amount you want to withdraw");
				double amt1 = input.nextDouble();
				if(amt1>=0) {
					b.withdraw(accountMap, acNo, amt1);
				}
				else {
					System.out.println("Invalid amount");
				}
				break;
			case 5:
				b.listAllAccounts(accountMap);
				break;
			case 6:
				System.out.println("The Interest Rates for fixed deposit are");
				System.out.println("-----------------------------------------");
				System.out.println("    Time(yrs)               Interest Rate");
				System.out.println("     0<t<2                         4.0%");
				System.out.println("     2<t<3                         4.5%");
				System.out.println("     3<t<4                         5.0%");
				System.out.println("     4<t<5                         5.5%");
				System.out.println("       t>5                         6.0%");
				
				System.out.println("Enter account number ");
			    long acNo1 = input.nextLong();
				System.out.println("Enter Fixed Deposit amount");
				double amt2 = input.nextDouble();
				System.out.println("Enter time");
				double time = input.nextDouble();
				b.fixedDeposit(accountMap, acNo1, amt2, time);
				break;
			default:
				System.out.println("Thank you for using the Bank");
				status = false;
				break;
			}
			
		} while(status);
		
		
		//interest rates
		
		
		
//		System.out.println(accountMap);
		
		//iterate over a map
//		for(Map.Entry<Long, Account> entry: accountMap.entrySet()) {
//			System.out.println(entry.getKey());
//		}
		
	}

}
