package com.springinaction;

import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

@Component
@Aspect
public class Audience {
	
	@Pointcut("execution(* com.springinaction.Performer.perform(..))")
	public void performance(){
		
	}
	
	@Around("performance()")
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
