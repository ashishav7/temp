package com.comviva.selflearning.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b1 = new Bus(1000,"Comviva Travels",3000.20,4.73);
		Bus b2 = new Bus(1200,"Wipro Travels",1010.20,4.71);
		Bus b3 = new Bus(1300,"Java Travels",1200.20,4.53);
		Bus b4 = new Bus(1400,"Python Travels",1100.20,4.33);
		Bus b5 = new Bus(1500,"Javascript Travels",2000.20,4.63);
		Bus b6 = new Bus(1100,"Com Travels",900.20,4.13);
		
		List<Bus> busList = new ArrayList<Bus>();
		busList.add(b1);
		busList.add(b2);
		busList.add(b3);
		busList.add(b4);
		busList.add(b5);
		busList.add(b6);
		
		Collections.sort(busList,new RatingComparator());
		for(Bus b: busList) {
			System.out.println(b);
		}
		
	}

}
