package com.springinaction;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		Bob performer = (Bob)ctx.getBean("BOB");
		System.out.println("Presenting Bob, age: " + performer.getAge());
		performer.perform();
		ctx.close();
	}
}
