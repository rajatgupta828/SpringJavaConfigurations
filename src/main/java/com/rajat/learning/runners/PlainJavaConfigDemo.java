package com.rajat.learning.runners;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rajat.learning.configurations.OnlyJavaConfig;
import com.rajat.learning.interfaces.Coach;

public class PlainJavaConfigDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext af = new AnnotationConfigApplicationContext(OnlyJavaConfig.class);
		
		
		Coach swimmingCoach = af.getBean("swimmingCoach",Coach.class);
		
		System.out.println(swimmingCoach.getDailyWorkouts());
		
		af.close();

	}

}
