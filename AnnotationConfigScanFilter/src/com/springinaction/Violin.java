package com.springinaction;

import org.springframework.stereotype.Component;

@Component
public class Violin implements Instrument {

	@Override
	public void play() {
		System.out.println("Tin - tin - tin - tin");
	}

}
