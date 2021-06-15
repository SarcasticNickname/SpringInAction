package com.springinaction;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Beans.xml");
		
		Performer jack = (Performer)ctx.getBean("Jack");
		Performer bob = (Performer)ctx.getBean("Bob");
		
		System.out.println("Performers are going to sing: ");
		
		jack.perform();
		
		ctx.close();
	}

}
