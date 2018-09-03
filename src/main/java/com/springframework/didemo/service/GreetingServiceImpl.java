package com.springframework.didemo.service;

import org.springframework.stereotype.Service;

/**
 * @author Jaison Santos
 * Created by 09/03/2018
 */
@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_WORLD = "Hello world!!!";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
