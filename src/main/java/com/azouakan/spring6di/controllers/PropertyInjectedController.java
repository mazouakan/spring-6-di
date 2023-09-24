package com.azouakan.spring6di.controllers;

import com.azouakan.spring6di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
