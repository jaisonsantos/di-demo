package com.springframework.didemo.service;

import org.springframework.stereotype.Service;

/**
 * @author Jaison Santos
 * Created by 09/03/2018
 */
@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the getter";
    }
}
