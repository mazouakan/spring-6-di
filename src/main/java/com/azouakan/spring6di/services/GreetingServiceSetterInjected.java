package com.azouakan.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class GreetingServiceSetterInjected implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey I'm Setting a Greeting!!";
    }
}
