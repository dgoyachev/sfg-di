package com.calltouch.di.controllers;

import com.calltouch.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by morgan on 23.02.2020
 */
@Controller
public class I18nController extends AbstractController {

    public I18nController(@Qualifier("l10nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
