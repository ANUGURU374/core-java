package com.xworkz.springg.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.springg")
public class Congirurations
{
	public Congirurations()
	{
		System.out.println("creating configuration with no arg const");
	}

}
