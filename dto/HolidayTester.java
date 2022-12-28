package com.xworkz.collections.dto;

public class HolidayTester {

	public static void main(String[] args)
	{
		Holiday h=new Holiday("Summer",9);

		Holiday h2=new Holiday("Winter",10);

		Holiday h3=new Holiday("festivel",9);

		System.out.println(h.getHolidayType().contains(h2.getHolidayType()));

	}

}
