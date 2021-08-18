package com.rajat.learning.implementations;

import org.springframework.stereotype.Component;

import com.rajat.learning.interfaces.IFortuneService;


@Component
public class LuckyFortuneService implements IFortuneService {

	public String getTodaysFortune() {
		return "Hey This is Happy FortuneService, you are Lucky Today";
	}

}
