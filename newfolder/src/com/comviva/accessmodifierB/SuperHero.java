package com.comviva.accessmodifierB;

public class SuperHero {

	// protected properties
	protected String power = "Healing Power";
	protected int childrens = 2;

	// protected methods
	protected void usePower() {
		System.out.println("The best power of all : " + power);
	}

	protected int countChildrens() {
		return childrens;
	}

	// public methods
	public void showHero() {
		System.out.println(" Wolverine ");
	}
}
