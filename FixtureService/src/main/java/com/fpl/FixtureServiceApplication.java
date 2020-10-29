package com.fpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FixtureServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FixtureServiceApplication.class, args);
	}

}
