package com.jobvite.springioccore.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBasicApp {

	public static void main(String[] args) {

		// Loading the spring configuration file-->create spring container 
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");//eagar initilization
		//BeanFactory appContext = new XmlBeanFactory(new ClassPathResource("applicationContext.xml")); lazy initilization

		// Retrive the bean from spring container.

		Coach coach = appContext.getBean("myCoach", Coach.class);
		System.out.println(coach);

		/* Coach coach2=appContext.getBean("myCoach",Coach.class);

		 System.out.println(coach2);==> Singleton object com.jobvite.springioccore.demo.CricketCoach@242b836 */

		// call the method of loaded bean

		System.out.println(coach.getMyActivity());
		
		
		System.out.println(coach.getMyDailyFortune());

		// close the context
		appContext.close();

	}

}
