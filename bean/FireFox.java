package com.xworkz.springg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireFox implements Browser 
{
	
	@Autowired
	@Qualifier("jio")
	private Provider provider;

	
	void FireFox()
	{
		System.out.println("creating firefox");
	}
	
	
	@Override
	public void browers()
	{
		System.out.println("running browser in firefox");
		provider.connect();
		
		
	}
	
}

