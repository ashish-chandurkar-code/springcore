package com.jobvite.springioccore.demo;

public class MyApp {

	public static void main(String[] args) {
		
		Coach coach=new BaseballCoach();
		
		Coach coach2=new TrackCoach();
		
		System.out.println(coach.getMyActivity());
		System.out.println(coach2.getMyActivity());
		
	}

}
