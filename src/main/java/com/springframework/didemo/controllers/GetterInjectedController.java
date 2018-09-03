package com.springframework.didemo.controllers;

import com.springframework.didemo.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author Jaison Santos
 * Created by 09/03/2018
 */

@Controller
public class GetterInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
