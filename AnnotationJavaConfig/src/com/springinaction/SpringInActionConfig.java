package com.springinaction;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class SpringInActionConfig {
	
	@Bean("bob")
	public Bob createBob() {
		return new Bob();
	}
	
	@Bean("john")
	public John createJohn() {
		return new John();
	}
	
	@Bean("jack")
	public Jack createJack() {
		return new Jack();
	}
}
