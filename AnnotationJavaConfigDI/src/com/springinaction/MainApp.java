package com.springinaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(SpringInActionConfig.class);
		
		Performer performer1 = (Performer)ctx.getBean("jack");
		Performer performer2 = (Performer)ctx.getBean("bob");
		
		System.out.println("Contestants are going to perform: ");
		performer1.perform();
		performer2.perform();
		
		ctx.close();

	}

}
