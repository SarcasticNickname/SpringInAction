package com.springinaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Beans.xml");
		Auditorium auditorium = (Auditorium)ctx.getBean("auditorium");
		ctx.close();
	}
}
