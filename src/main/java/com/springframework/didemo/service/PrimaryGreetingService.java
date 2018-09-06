package com.springframework.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Jaison Santos
 * Created by 09/03/2018
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting Service";
    }
}
