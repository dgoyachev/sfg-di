package com.calltouch.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by morgan on 23.02.2020
 */
@Profile("EN")
@Service("l10nService")
public class L10NGreetingServicePortuguese implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
