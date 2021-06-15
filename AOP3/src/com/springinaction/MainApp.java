package com.springinaction;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Beans.xml");
		
		Performer bob = (Performer)ctx.getBean("Bob");
		Performer jack = (Performer)ctx.getBean("Jack");
		
		System.out.println("The show is going to start. Please prepare yourself.");
		bob.perform();
		jack.perform();
		
		ctx.close();
	}

}
