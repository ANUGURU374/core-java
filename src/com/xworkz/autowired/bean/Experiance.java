package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Experiance 
{
	@Autowired
	private Skill skill;
	
	public Experiance()
	{
		System.out.println("Experiance  is created");
	}

}