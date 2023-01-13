package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Director
{
	@Autowired
	private Experiance experiance;
	
	public Director()
	{
		System.out.println("directore  is created");
	}

}
