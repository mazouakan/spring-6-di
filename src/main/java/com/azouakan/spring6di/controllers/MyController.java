package com.azouakan.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println(" I am in MyController");
        return "Hello Everyone!!!";
    }
}
