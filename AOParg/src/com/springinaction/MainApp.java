package com.springinaction;

import java.util.Random;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	static final Random rnd = new Random();
	
	static String createRandomString() {
		String str = "";
		for(int i = 0; i < 20; i++) {
			str += (char)(rnd.nextInt(50)+100);
		}
		return str;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = 
				new ClassPathXmlApplicationContext("Beans.xml");
		
		Thinker volunteer = (Thinker)ctx.getBean("volunteer");
		MindReader mindReader = (MindReader)ctx.getBean("magician");
		
		System.out.println("Volunteer is thinking of something.");
		volunteer.thinkOfSomething(createRandomString());
		System.out.println("Magician has intercepted volunteer's thoughts.");
		System.out.println("Volunteer's thoughts: ");
		System.out.println(mindReader.getThoughts());
		
		ctx.close();
		
	}

}
