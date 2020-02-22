package com.calltouch.di.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by morgan on 22.02.2020
 */

@Controller
public class DiController {

    public String sayHello() {
        System.out.println("Hello World!");
        return "Hi folks!";
    }
}
