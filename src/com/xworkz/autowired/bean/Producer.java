package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer 
{
	@Autowired
	private Assistant  assistant;
	
	public Producer()
	{
		System.out.println("Assistant  is created");
	}

}
