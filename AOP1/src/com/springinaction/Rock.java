package com.springinaction;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component("rock")
@Qualifier("rock")
public class Rock implements Song {

	@Override
	public void sing() {
		System.out.println("Long live Rock, eee.");
	}

}
