package com.fiserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JendemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JendemoApplication.class, args);
        System.out.println("Welcome to Jenkins!");
	}

}
