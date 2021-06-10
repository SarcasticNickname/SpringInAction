package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
@Qualifier("violin")
public class Violin implements Instrument {

	@Override
	public void play() {
		System.out.println("Tin - tin - tin - tin");
	}

}
