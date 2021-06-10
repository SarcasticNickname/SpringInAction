package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
@Qualifier("guitar")
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("Trun - trun - trun.");

	}

}
