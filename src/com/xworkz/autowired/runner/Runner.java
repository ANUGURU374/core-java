package com.xworkz.autowired.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.bean.Movie;
import com.xworkz.autowired.configuration.SpringConfiguration;

public class Runner 
{
	public static void main(String args[]) 
	{
		ApplicationContext ref=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		String[]ref2=ref.getBeanDefinitionNames();
		System.out.println(Arrays.toString(ref2));
		Movie ref3=ref.getBean(Movie.class);
		System.out.println(ref3);
	}
}
