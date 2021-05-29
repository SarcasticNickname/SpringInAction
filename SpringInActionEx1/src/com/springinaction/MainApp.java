package com.springinaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		Performer juggler = (Performer)ctx.getBean("juggler");
		juggler.perform();
	}

}
