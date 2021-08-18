package com.rajat.learning.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rajat.learning.interfaces.Coach;
import com.rajat.learning.interfaces.IFortuneService;


@Component("sillyTennisCoach")
public class TennisCoach implements Coach {
	
	/*
	 * Sample for Field Autowiring
	 * @Autowired
		private LuckyFortuneService luckyFortuneService
	 */
	
	
	
	private IFortuneService luckyFortuneService;
	
	/*
	 * Constructor Autowiring
	 */
	@Autowired
	public TennisCoach(IFortuneService luckyFortuneService) {
		super();
		this.luckyFortuneService = luckyFortuneService;
	}

	public String getDailyWorkouts() {
		return "Practice backhand For 30 Mins";
	}

	public String getFortune() {
		return luckyFortuneService.getTodaysFortune();
	}
	
}
