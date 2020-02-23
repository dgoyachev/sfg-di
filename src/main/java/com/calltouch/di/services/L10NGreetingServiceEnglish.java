package com.calltouch.di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by morgan on 23.02.2020
 */
@Profile("PT")
@Service("l10nService")
public class L10NGreetingServiceEnglish implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Olá Mundo!";
    }
}
