package com.springinaction;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;


@Configuration
public class SpringInActionConfig {
	@Bean("bob")
	public Bob createBob() {
		Bob bob = new Bob();
		bob.setInstrument(createGuitar());
		return bob;
	}
	
	@Bean("jack")
	public Jack createJack() {
		Jack jack = new Jack();
		jack.setInstrument(createViolin());
		return jack;
	}
	
	@Bean("violin")
	public Instrument createViolin() {
		return new Violin();
	}
	
	@Bean("guitar")
	public Instrument createGuitar() {
		return new Guitar();
	}
}
