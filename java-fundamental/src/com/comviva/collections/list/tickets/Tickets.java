package com.comviva.collections.list.tickets;

import java.util.ArrayList;
import java.util.List;

public class Tickets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Ticket> tickets = new ArrayList<Ticket>();
		Ticket tkt1 = new Ticket("Ashish",true,"Video Not Working");
		Ticket tkt2 = new Ticket("Ram",true,"Subtitles Not Working");
		Ticket tkt3 = new Ticket("John",true,"Login Issue");
		Ticket tkt4 = new Ticket("Joey",true,"Otp Issue");
		
		tickets.add(tkt1);
		tickets.add(tkt2);
		tickets.add(tkt3);
		tickets.add(tkt4);
		
		for(Ticket tkt: tickets) {
			System.out.println("Issue Raised by " + tkt.getName() + "\nCurrent Status " + tkt.getStatus() + "\nIssue: " + tkt.getDescription() + "\n");
		}
	}

}
