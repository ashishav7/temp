package com.comviva.collections.list.tickets;

public class Ticket {
	//TODO : create a list of ticket.
	private String name,description;
	private boolean status;
	public Ticket(String name,boolean status,String description) {
		this.name = name;
		this.status = status;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public String getStatus() {
		if(status) {
			return "Active";
		}
		return "Inactive";
	}
	public void resolved() {
		status = false;
	}
}
