package com.klaster.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.klaster.pattern.controllers", "com.klaster.pattern.models",
		"com.klaster.pattern.repositories", "com.klaster.pattern.services",})
public class PatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternApplication.class, args);
	}

}
