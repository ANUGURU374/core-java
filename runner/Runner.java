package com.xworkz.springg.runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springg.bean.Chrome;
import com.xworkz.springg.bean.FireFox;
import com.xworkz.springg.configuration.Congirurations;


public class Runner
{
	public static void main(String[] args) 
	{
		ApplicationContext container = new AnnotationConfigApplicationContext(Congirurations.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		FireFox fireFox = container.getBean(FireFox.class);
		fireFox.browers();

		Chrome chrome = container.getBean(Chrome.class);
		chrome.browers();
	}

}
