package com.xworkz.collections.foreach_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoesSize
{
	public static void main(String[] args)
{
	int shoeSize1=5;
	int shoeSize2=6;
	int shoeSize3=2;
	int shoeSize4=7;
	int shoeSize5=8;
	int shoeSize6=5;
	int shoeSize7=5;
	int shoeSize8=5;
	int shoeSize9=5;
	int shoeSize10=4;
	int shoeSize11=5;
	int shoeSize12=10;
	int shoeSize13=8;
	int shoeSize14=6;
	int shoeSize15=5;
	
	Collection<Integer> size=new ArrayList<Integer>();
	size.add(shoeSize1);
	size.add(shoeSize2);
	size.add(shoeSize3);
	size.add(shoeSize4);
	size.add(shoeSize5);
	size.add(shoeSize6);
	size.add(shoeSize7);
	size.add(shoeSize8);
	size.add(shoeSize9);
	size.add(shoeSize10);
	size.add(shoeSize11);
	size.add(shoeSize12);
	size.add(shoeSize13);
	size.add(shoeSize14);
	size.add(shoeSize15);
	
	
	System.out.println(size.size());
	for(Integer element:size)
	{
		System.out.println(element);
	}
	
	
	System.out.println("***************************");
	Iterator<Integer> r=size.iterator();
	while(r.hasNext())
	{
		Integer element=r.next();
		System.out.println(element);
	}
	
}
	

}
