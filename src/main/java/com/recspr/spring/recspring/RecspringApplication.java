package com.recspr.spring.recspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class RecspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecspringApplication.class, args);

		System.out.println("Welcome java boot");
	}


}
