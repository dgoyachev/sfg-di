package com.calltouch.di.controllers;

import com.calltouch.di.services.GreetingService;

/**
 * Created by morgan on 22.02.2020
 */

public abstract class AbstractController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
