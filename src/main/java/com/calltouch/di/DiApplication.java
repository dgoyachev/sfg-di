package com.calltouch.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		System.out.println("Main app before");
		SpringApplication.run(DiApplication.class, args);
		System.out.println("Main app after");
	}

}
