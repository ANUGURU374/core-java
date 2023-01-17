package com.xworkz.springg.bean;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider
{
	public Jio()
	{
		System.out.println("creating jio with no arg const");
	}

	@Override
	public void connect() 
	{
		System.out.println("runninng connect with jio");
		
	}

}
