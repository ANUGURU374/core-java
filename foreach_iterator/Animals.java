package com.xworkz.collections.foreach_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class Animals {
	public static void main(String[] args) 
	{
		String animal1="Cow";
		String animal2="Tiger";
		String animal3="Lion";
		String animal4="Horse";
		String animal5="Deer";
		String animal6="Snake";
		String animal7="Rabbit";
		String animal8="Duck";
		String animal9="Dog";
		String animal10="Fox";
		
		Collection<String> animals=new ArrayList();
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		animals.add(animal6);
		animals.add(animal7);
		animals.add(animal8);
		animals.add(animal9);
		animals.add(animal10);
		
		System.out.println(animals.size());
		for(String element:animals)
		{
			System.out.println(element);
		}
		
		
		System.out.println("***************************");
		Iterator<String> r=animals.iterator();
		while(r.hasNext())
		{
			String element=r.next();
			System.out.println(element);
		}
		
	}

}
