package com.comviva.accessmodifier;

import com.comviva.accessmodifierB.SuperHero;

public class ProtectedAccessModiferOutsideThePackageDemo extends SuperHero{

	public static void main(String[] args) {
		
		//create object
		// SuperHero superHero = new SuperHero();
		
		// protected properties are not directly visible outside package
		// but can be access by usign inheritance.
		
		// create object of child class
		ProtectedAccessModiferOutsideThePackageDemo childObj = new ProtectedAccessModiferOutsideThePackageDemo();
		
		//access protected properties 
		System.out.println("The Power : "+childObj.power);
		System.out.println("The Childrens count : "+childObj.childrens);
		
		// access protected methods
		childObj.usePower();
		
		// access public methods
		childObj.showHero();		

	}

}
