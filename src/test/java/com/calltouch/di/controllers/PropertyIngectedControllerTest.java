package com.calltouch.di.controllers;

import com.calltouch.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyIngectedControllerTest {

    PropertyIngectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyIngectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}