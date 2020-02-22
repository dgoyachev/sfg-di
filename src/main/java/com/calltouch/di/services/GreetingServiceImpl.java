package com.calltouch.di.services;

/**
 * Created by morgan on 22.02.2020
 */

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world!";
    }
}
