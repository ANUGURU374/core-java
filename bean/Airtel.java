package com.xworkz.springg.bean;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider
{
	public Airtel()
	{
		System.out.println("creating airtel using no arg const");
	}

	@Override
	public void connect() 
	{
		System.out.println("running airtel");
				
	}
	

}
