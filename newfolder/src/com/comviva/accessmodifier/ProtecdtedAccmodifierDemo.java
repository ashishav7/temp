package com.comviva.accessmodifier;

public class ProtecdtedAccmodifierDemo {

	public static void main(String[] args) {
		// create instance
		Hero hero = new Hero();
		
		// access protected properties
		System.out.println("The Power : "+hero.power);
		System.out.println("The Childrens count: "+hero.childrens);

		// access protected methods
		hero.usePower();
		System.out.println("The Childrens count : "+hero.countChildrens());
		hero.showHero();
	}

}

class Hero {
	
	// protected properties
	protected String power = "Healing Power";
	protected int childrens = 2;
	
	// protected methods
	protected void usePower() {
		System.out.println("The best power of all : "+ power);
	}
	protected int countChildrens() {
		return childrens;
	}
	
	//public methods
	public void showHero() {
		System.out.println(" Wolverine ");
	}
	
}
