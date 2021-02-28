package com.jobvite.springioccore.demo;

public class DailyFortuneServiceImpl implements FortuneService {
	
	
	public DailyFortuneServiceImpl() {
		System.out.println("DailyFortuneServiceImpl object created");
	}

	@Override
	public String getMyFortune() {
		
		return "Today is your good day";
	}

}
