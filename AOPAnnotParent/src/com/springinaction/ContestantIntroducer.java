package com.springinaction;

import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Component
@Aspect
public class ContestantIntroducer {

	@DeclareParents(value = "com.springinaction.Performer+",
					defaultImpl = GratefulContestant.class)
	public Contestant contestant;
}
