package com.rajat.learning.runners;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.learning.configurations.LoggerConfig;
import com.rajat.learning.interfaces.Coach;

public class JavaConfigDemo {

	public static void main(String[] args) {
		// Create the context
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(LoggerConfig.class);
		
		// Retrieve the beans from the context
		Coach tennisCoach = context.getBean("sillyTennisCoach",Coach.class);
		
		// Perform methods on the bean created
		System.out.println(tennisCoach.getDailyWorkouts());
		System.out.println(tennisCoach.getFortune());
		
		// Close the context
		context.close();
	}

}
