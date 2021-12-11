package com.milan.springdemo;

import org.springframework.stereotype.Component;

//@Component("thatSillyCoach") - bean id -default bean id for this class is tennisCoach
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practise your backhand volley";
	}

}
