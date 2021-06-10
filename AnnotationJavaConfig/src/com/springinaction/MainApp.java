package com.springinaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext();
		ctx.register(SpringInActionConfig.class);
		ctx.refresh();
		
		Performer performer1 = (Performer)ctx.getBean("bob");
		Performer performer2 = (Performer)ctx.getBean("jack");
		Performer performer3 = (Performer)ctx.getBean("john");
		
		System.out.println("Performer are going to sing: ");
		
		System.out.println(performer1);
		performer1.perform();
		
		System.out.println(performer2);
		performer2.perform();
		
		System.out.println(performer3);
		performer3.perform();
		
		ctx.close();
	}

}
