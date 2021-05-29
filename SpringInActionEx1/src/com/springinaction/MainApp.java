package com.springinaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		Performer juggler = (Performer)ctx.getBean("juggler");
		juggler.perform();
		
		Performer juggler2 = (Performer)ctx.getBean("jugglerParam");
		juggler2.perform();
		
		PoeticJuggler poeticJuggler = (PoeticJuggler)ctx.getBean("poeticJuggler");
		poeticJuggler.perform();
	}

}
