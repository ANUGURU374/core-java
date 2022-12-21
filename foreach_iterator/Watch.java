package com.xworkz.collections.foreach_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch
{
	public static void main(String[] args)
	{
		String watch1="Rolex";
		String watch2="Sonata";
		String watch3="Zenith";
		String watch4="Seiko";
		String watch5="Breitling";
		
		Collection<String> watches=new ArrayList();
		watches.add(watch5);
		watches.add(watch4);
		watches.add(watch3);
		watches.add(watch2);
		watches.add(watch1);
		
		
		System.out.println(watches.size());
		for(String element:watches)
		{
			System.out.println(element);
		}
		
		
		System.out.println("***************************");
        Iterator<String> r=watches.iterator();
		while(r.hasNext())
		{
			String element=r.next();
			System.out.println(element);
		}
		
	}
}
		
		
		
		
		
