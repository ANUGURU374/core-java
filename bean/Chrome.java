package com.xworkz.springg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser 
{
	@Autowired
	@Qualifier("airtel")
	private Provider provider;

	
	public void Chrome()
	{
		
		System.out.println("created chrome using no arg const");
		
	}


	@Override
	public void browers() 
	{
		System.out.println("running browser");
		
		
	}
	

}
