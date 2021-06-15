package com.springinaction;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

@Component("classic")
@Qualifier("classic")
public class Classic implements Song {

	@Override
	public void sing() {
		System.out.println("Eternal classic will be popular forever!");
	}

}
