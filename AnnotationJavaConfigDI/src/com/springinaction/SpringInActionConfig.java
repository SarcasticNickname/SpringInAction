package com.springinaction;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;


@Configuration
public class SpringInActionConfig {
	@Bean("bob")
	public Bob createBob() {
		Bob bob = new Bob();
		Instrument instrument = new Guitar();
		bob.setInstrument(instrument);
		return bob;
	}
	
	@Bean("jack")
	public Jack createJack() {
		Jack jack = new Jack();
		Instrument instrument = new Violin();
		jack.setInstrument(instrument);
		return jack;
	}
}
