package com.rajat.learning.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.rajat.learning.logger.MyLoggerConfig;
 
@Configuration
@ComponentScan("com.rajat.learning")
@PropertySource("classpath:mylogger.properties")
public class LoggerConfig {
 
	@Bean
	public MyLoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {
 
		MyLoggerConfig myLoggerConfig = new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);
 
		return myLoggerConfig;
	}
	
 
}
