package com.xworkz.collections.foreach_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompany 
{
	public static void main(String[] args)
	{
		String company1="Google";
		String company2="Microsoft";
		String company3="Infosys";
		String company4="Dell";
		String company5="Accenture";
		String company6="AT&T";
		String company7="Comcast";
		String company8="software heroes";
		String company9="Intelliware";
		String company10="AppXNext";
		String company11="wipro";
		String company12="software boat";
		String company13="Mad Mobile";
		String company14="Digiware";
		String company15="LG";
		String company16="HP";
		String company17="Terra logic";
		String company18="infotech";
		String company19="mphasis";
		String company20="IBM";
		
		
		Collection<String> comp=new ArrayList();
		comp.add(company1);
		comp.add(company2);
		comp.add(company3);
		comp.add(company4);
		comp.add(company5);
		comp.add(company6);
		comp.add(company7);
		comp.add(company8);
		comp.add(company9);
		comp.add(company10);
		comp.add(company11);
		comp.add(company12);
		comp.add(company13);
		comp.add(company14);
		comp.add(company15);
		comp.add(company16);
		comp.add(company17);
		comp.add(company18);
		comp.add(company19);
		comp.add(company20);
		
		
		
		System.out.println(comp.size());
		for(String element:comp)
		{
			System.out.println(element);
		}
		
		
		System.out.println("***************************");
		Iterator<String> r=comp.iterator();
		while(r.hasNext())
		{
			String element=r.next();
			System.out.println(element);
		}
		
	}

	}


