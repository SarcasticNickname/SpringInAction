package com.springinaction;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Beans.xml");
		Performer bob = (Performer)ctx.getBean("Bob");
		
		System.out.println("The show is going to start: ");
		bob.perform();
		ctx.close();
	}
}
