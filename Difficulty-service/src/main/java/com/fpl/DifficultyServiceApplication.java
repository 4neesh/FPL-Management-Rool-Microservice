package com.fpl;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DifficultyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DifficultyServiceApplication.class, args);
	}

	DefaultListableBeanFactory ab = new DefaultListableBeanFactory();
	
}
