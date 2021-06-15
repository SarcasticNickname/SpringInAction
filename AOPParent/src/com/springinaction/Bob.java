package com.springinaction;

import org.springframework.stereotype.Component;

@Component
public class Bob implements Performer {

	@Override
	public void perform() {
		System.out.println("Tra-la-la");
	}

}
