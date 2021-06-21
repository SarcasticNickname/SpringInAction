package com.springinaction;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;

@Component("magician")
@Aspect
public class Magician implements MindReader {

	private String thoughts;
	
	@Pointcut("execution(* com.springinaction.Thinker.thinkOfSomething(String)) && args(thoughts)")
	public void thinkOfSomething (String thoughts) {
		
	}
	
	@Override
	@Before("thinkOfSomething(thoughts)")
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteer's thoughts");
		this.thoughts = thoughts;
	}

	@Override
	public String getThoughts() {
		return thoughts;
	}

}
