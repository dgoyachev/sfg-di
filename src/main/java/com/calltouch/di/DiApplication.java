package com.calltouch.di;

import com.calltouch.di.controllers.DiController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
		DiController diController = (DiController) ctx.getBean("diController");
		String greeting = diController.sayHello();
		System.out.println(greeting);
	}

}
