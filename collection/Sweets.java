package com.xworkz.collections.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Sweets 
{

	public static void main(String[] args) 
	{
		
		
		String sw1 = "Jalebi";
		String sw2 = "Baalusha";
		String sw3 = "Carrot halwa";
		String sw4 = "Kaju katli";
		String sw5 = "Ladoo";
		String sw6 = "Mysore pak";
		String sw7 = "Kheer";
		String sw8 = "Rasgulla";
		String sw9 = "Lassi";
		String sw10 = "Peda";
		String sw11 = "Burfie";
		String sw12= "Jaamun";
		String sw13 = "Kulfi";
		
	
		Collection<String> sweets = new ArrayList();
		sweets.add(sw1);
		sweets.add(sw2);
		sweets.add(sw3);
		sweets.add(sw4);
		sweets.add(sw5);
		sweets.add(sw6);
		sweets.add(sw7);
		sweets.add(sw8);
		sweets.add(sw9);
		sweets.add(sw10);
		sweets.add(sw11);
		sweets.add(sw12);
		sweets.add(sw13);
		
		System.out.println(sweets.size());
		sweets.clear();
		System.out.println(sweets.size());

	}

}
