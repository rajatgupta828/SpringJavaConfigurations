package com.rajat.learning.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.rajat.learning.interfaces.Coach;
import com.rajat.learning.interfaces.IFortuneService;

public class SwimmingCoach implements Coach {
	
	/*
	 * Sample for Only Java configurations using @Bean and @Configuration 
	 *
	 */

	private IFortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	/*
	 * Constructor Injection
	 */
	@Autowired
	public SwimmingCoach(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	/**
	 *
	 */
	public String getDailyWorkouts() {
		return "Practice Backstroke and Butterfly Storke";
	}

	/**
	 *
	 */
	public String getFortune() {
		return fortuneService.getTodaysFortune();
	}
	
}
