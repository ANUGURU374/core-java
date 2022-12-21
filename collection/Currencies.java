package com.xworkz.collections.collection;

import java.util.Collection;
import java.util.LinkedList;

public class Currencies {

	public static void main(String[] args)
	{
		String curren1 = "Indian Rupee";
		String curren2= "Us Dollar";
		String curren3= "Pataca";
		String curren4= "Colombian Peso";
		String curren5 = "Comoro Franc";
		String curren6 = "Danish Krone";
		String curren7= "Iranian Rial";
		String curren8= "Rupaih";
		String curren9 = "Iraqi Dinar";
		String curren10= "Kenyan Shilling";
		String curren11 = "North Korean Won";
		String curren12 = "Kuwaiti Dinar";
		String curren13 = "Australian Dollar";
		String curren14 = "Aruban Florin";
		String curren15 = "Brazillian Real";
		String curren16 = "Pound Sterling";
		String curren17= "Denar";
		String curren18 = "Malagasy Ariary";
		String curren19 = "Naira";
		String curren20= "Som";
		String curren21= "Rufiyaa";
		String curren22 = "Tugrika";
		String curren23 = "Metical";
		String curren24 = "Kyat";
		String curren25 = "Kip";
		String curren26 = "Loti";
		
		
		Collection<String> currencies = new LinkedList();
		currencies.add(curren1);
		currencies.add(curren2);
		currencies.add(curren3);
		currencies.add(curren4);
		currencies.add(curren5);
		currencies.add(curren6);
		currencies.add(curren7);
		currencies.add(curren8);
		currencies.add(curren9);
		currencies.add(curren10);
		currencies.add(curren11);
		currencies.add(curren12);
		currencies.add(curren13);
		currencies.add(curren14);
		currencies.add(curren15);
		currencies.add(curren16);
		currencies.add(curren17);
		currencies.add(curren18);
		currencies.add(curren19);
		currencies.add(curren20);
		currencies.add(curren21);
		currencies.add(curren22);
		currencies.add(curren23);
		currencies.add(curren24);
		currencies.add(curren25);
		currencies.add(curren26);
		
		System.out.println(currencies.size());
		currencies.clear();
		System.out.println(currencies.size());

	}

}
