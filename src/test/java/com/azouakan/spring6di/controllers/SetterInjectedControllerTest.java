package com.azouakan.spring6di.controllers;

import com.azouakan.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SetterInjectedControllerTest {

    SetterInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}