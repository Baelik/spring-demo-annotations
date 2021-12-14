package com.milan.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") - bean id -default bean id for this class is tennisCoach
@Component
//@Scope("prototype") //default is singlton
public class TennisCoach implements Coach {
	
	// field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// constructor injection
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	
	// setter injection
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("TennisCoach: inside setter method");
//		this.fortuneService = fortuneService;
//	}
	
	//define my init method
	@PostConstruct
	public void doMStartupStaff() {
		System.out.println("TennisCoach: inside doMyStartupStuff");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStaff() {
		System.out.println("TennisCoach: inside doMyCleanupStuff");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practise your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
