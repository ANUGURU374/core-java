package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery 
{
	
	 @Autowired
	 private Capacity capacity;
	 
    public Battery()
	{
		System.out.println("battery  is created");
	}
}