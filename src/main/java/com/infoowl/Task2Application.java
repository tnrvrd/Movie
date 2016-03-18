package com.infoowl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Task2Application {

	/**
	 * Main method, used to run the application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(Task2Application.class, args);

	}
}
