package com.bliss.blissapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class BlissApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlissApplication.class, args);
	}

}
