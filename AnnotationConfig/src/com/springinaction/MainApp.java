package com.springinaction;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Beans.xml");
		Singer singer = (Singer)ctx.getBean("singer");
		
		singer.getInfo();
		singer.sing();
		
		ctx.close();

	}

}
