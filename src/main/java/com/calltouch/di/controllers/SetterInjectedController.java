package com.calltouch.di.controllers;

import com.calltouch.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by morgan on 22.02.2020
 */

@Controller
public class SetterInjectedController extends AbstractController {
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
