package com.rajat.learning.implementations;


import com.rajat.learning.interfaces.IFortuneService;

public class SadFortuneService implements IFortuneService {

	public String getTodaysFortune() {
		return "Hey This is Sad FortuneService, you will be Sad Today";
	}

}
