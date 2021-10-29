package com.rajat.learning.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.rajat.learning.implementations.SadFortuneService;
import com.rajat.learning.implementations.SwimmingCoach;
import com.rajat.learning.interfaces.Coach;
import com.rajat.learning.interfaces.IFortuneService;
import com.rajat.learning.logger.MyLoggerConfig;

@Configuration
@PropertySource("classpath:mylogger.properties")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	// Configurations Using the Bean configurations
	
	
	//Define a method to expose a bean for dependency
	@Bean
	public IFortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//Define the Method to expose the actual bean with the dependency
	@Bean
	public Coach swimmingCoach() {
		return new SwimmingCoach(sadFortuneService());
	}
	
	
	// Logger Configurations
	@Bean
	public MyLoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {
 
		MyLoggerConfig myLoggerConfig = new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);
 
		return myLoggerConfig;
	}
	
}
