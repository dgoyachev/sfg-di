package com.calltouch.di.controllers;

import com.calltouch.di.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by morgan on 22.02.2020
 */

@Controller
public class DiController {

    private final GreetingService greetingService;

    public DiController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println(greetingService.sayGreeting());
        return "Hi folks!";
    }
}
