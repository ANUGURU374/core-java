package com.xworkz.collections.collection;

import java.util.Collection;
import java.util.TreeSet;

public class Bike 
{
	public static void main(String[] args) 
	
	{
		String bike1 = "Pulsar";
		String bike2 = "Honda";
		String bike3 = "Royal Enfield";
		String bike4 = "Hero splendor";
		String bike5 = "KTM";
		String bike6 = "TVS Apache";
		String bike7 = "Nova";
		String bike8 = "Patriot";
		String bike9 = "Panther";
		String bike10 = "Forger";
		String bike11 = "Activa";
		String bike12 = "Yamaha";
		String bike13 = "TVS";
		String bike14 = "Ducati";
		String bike15 = "Pegasus";
		String bike16 = "Phoenix";
		String bike17 = "Siren";
		String bike18 = "Aprilla";
		
		
		Collection<String> bikes = new TreeSet();
		bikes.add(bike1);
		bikes.add(bike2);
		bikes.add(bike3);
		bikes.add(bike4);
		bikes.add(bike5);
		bikes.add(bike6);
		bikes.add(bike7);
		bikes.add(bike8);
		bikes.add(bike9);
		bikes.add(bike10);
		bikes.add(bike11);
		bikes.add(bike12);
		bikes.add(bike13);
		bikes.add(bike14);
		bikes.add(bike15);
		bikes.add(bike16);
		bikes.add(bike17);
		bikes.add(bike18);
		
		System.out.println(bikes.size());
		bikes.clear();
		System.out.println(bikes.size());
	}

}
