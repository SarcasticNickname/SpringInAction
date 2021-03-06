package com.springinaction;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		Performer performer1 = (Performer)ctx.getBean("ikotika");
		Performer performer2 = (Performer)ctx.getBean("sokol");
		
		performer1.perform();
		performer2.perform();
		
		ctx.close();
		
		System.out.println("Both performers were good, we have a tie.");

	}

}
