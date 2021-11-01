package com.fiserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsdemoApplication.class, args);
	    System.out.println("Welcome to Jenkins!");
	}

}
