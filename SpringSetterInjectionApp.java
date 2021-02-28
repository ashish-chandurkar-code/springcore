package com.jobvite.springioccore.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSetterInjectionApp {

	public static void main(String[] args) {
		
		//Load spring config file
		ClassPathXmlApplicationContext classPathXmlApplicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from spring container
		
		CricketCoach cricketCoach= classPathXmlApplicationContext.getBean("myCricketCoach", CricketCoach.class);
		
		//call the method of loaded bean
		
		System.out.println(cricketCoach.getMyActivity());
		
		System.out.println(cricketCoach.getMyDailyFortune());
	
		System.out.println(cricketCoach.getCoachEmailAddress());
		
		System.out.println(cricketCoach.getTeam());
		
		//close the app context
		
		classPathXmlApplicationContext.close();
	}

}
