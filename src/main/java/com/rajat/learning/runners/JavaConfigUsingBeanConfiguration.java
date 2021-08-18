package com.rajat.learning.runners;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.learning.configurations.SportConfig;
import com.rajat.learning.interfaces.Coach;

public class JavaConfigUsingBeanConfiguration {

	public static void main(String[] args) {
		// Create the context
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SportConfig.class);
		
		// Retrieve the exposed beans from the context
		Coach swimmingCoach = context.getBean("swimmingCoach",Coach.class);
		
		// Perform methods on the bean created
		System.out.println(swimmingCoach.getDailyWorkouts());
		System.out.println(swimmingCoach.getFortune());
		
		// Close the context
		context.close();
	}

}
