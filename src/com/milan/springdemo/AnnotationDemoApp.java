package com.milan.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		//Coach theCoach = context.getBean("thatSillyCoach", Coach.class); //bean id
		Coach theCoach = context.getBean("tennisCoach", Coach.class); //deafult bean
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close context
		context.close();
	}

}
