package com.rajat.learning.implementations;

import org.springframework.beans.factory.annotation.Autowired;

import com.rajat.learning.interfaces.Coach;
import com.rajat.learning.interfaces.IFortuneService;

public class SwimmingCoach implements Coach {
	
	/*
	 * Sample for Only Java configurations using @Bean and @Configuration 
	 *
	 */

	private IFortuneService fortuneService;
	
	/*
	 * Constructor Injection
	 */
	@Autowired
	public SwimmingCoach(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkouts() {
		return "Practice Backstroke and Butterfly Storke";
	}

	public String getFortune() {
		return fortuneService.getTodaysFortune();
	}
	
}
