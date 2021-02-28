package com.jobvite.springioccore.demo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public BaseballCoach() {
		System.out.println("BaseballCoach empty constructor");
	}
	//constructor injection
	public BaseballCoach(FortuneService fortuneService) {
		System.out.println("BaseballCoach constructor with fortuneService "+fortuneService);
		this.fortuneService = fortuneService;
	}

	@Override
	public String getMyActivity() {	
		
		return "Do the base ball activity for 30 mins";
	}
	@Override
	public String getMyDailyFortune() {
		
		return "Baseball fortune " + fortuneService.getMyFortune();
	}

}
