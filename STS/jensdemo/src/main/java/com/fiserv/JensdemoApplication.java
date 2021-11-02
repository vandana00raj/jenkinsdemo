package com.fiserv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JensdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JensdemoApplication.class, args);
		System.out.println("Hello Jenkins!");
	}

}
