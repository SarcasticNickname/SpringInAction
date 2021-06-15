package com.springinaction;

import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;

@Component("audience")
public class Audience {

	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		 try {
			 
		 System.out.println("The audience is taking their seats.");
		 System.out.println("The audience is turning off their cellphones");
		 
		 long start = System.currentTimeMillis(); // Перед выступлением
		 
		 joinpoint.proceed(); // Вызов целевого метода
		 
		 long end = System.currentTimeMillis(); // После выступления
		 
		 System.out.println("CLAP CLAP CLAP CLAP CLAP");
		 System.out.println("The performance took " + (end - start)
		 + " milliseconds.");
		 
		 } catch (Throwable t) {
		 System.out.println("Boo! We want our money back!");
		 }
	}
}
