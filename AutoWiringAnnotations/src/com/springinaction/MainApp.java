package com.springinaction;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Beans.xml");
		Performer alexRibak = (Performer)ctx.getBean("ALEXRIBAK");
		alexRibak.perform();
		ctx.close();
	}

}
