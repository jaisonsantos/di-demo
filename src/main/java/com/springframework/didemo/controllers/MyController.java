package com.springframework.didemo.controllers;

import com.springframework.didemo.service.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author Jaison Santos
 * Created on 09/01/2018
 */
@Controller
public class MyController {

    private GreetingService greetingService;


    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Hello!!!");
        return greetingService.sayGreeting();
    }

}
