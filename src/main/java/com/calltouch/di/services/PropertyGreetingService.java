package com.calltouch.di.services;

import org.springframework.stereotype.Service;

/**
 * Created by morgan on 22.02.2020
 */
@Service
public class PropertyGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world! - property";
    }
}
