package com.jobvite.springioccore.demo;

public class CricketCoach  implements Coach{

	
	private FortuneService fortuneService;
	
	private String coachEmailAddress;
	
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach setter called setFortuneService");
		this.fortuneService = fortuneService;
	}	

	public String getCoachEmailAddress() {
		return coachEmailAddress;
	}

	public void setCoachEmailAddress(String coachEmailAddress) {
		this.coachEmailAddress = coachEmailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getMyActivity() {
		
		return "Do bowling for 1 hr daily";
	}

	@Override
	public String getMyDailyFortune() {
		return fortuneService.getMyFortune();
	}

}
