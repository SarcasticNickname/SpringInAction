package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component("magician")
public class Magician implements MindReader {

	private String thoughts;
	
	@Override
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteer's thoughts");
		this.thoughts = thoughts;
	}

	@Override
	public String getThoughts() {
		return thoughts;
	}

}
