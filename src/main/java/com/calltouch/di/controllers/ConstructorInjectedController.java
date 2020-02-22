package com.calltouch.di.controllers;

import com.calltouch.di.services.GreetingService;

/**
 * Created by morgan on 22.02.2020
 */

public class ConstructorInjectedController extends AbstractController {

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
