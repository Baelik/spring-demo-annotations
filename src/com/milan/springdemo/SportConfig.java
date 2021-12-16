package com.milan.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
// @ComponentScan("com.milan.springdemo") //kada radimo bez @Bean vec ciatmo ceo paket
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	//define bean for our sad fortune service
	@Bean 
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//define bean for our swim coach and inject depnedecy
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
