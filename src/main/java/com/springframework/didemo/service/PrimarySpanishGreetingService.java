package com.springframework.didemo.service;

/**
 * @author Jaison Santos
 * Created by 09/06/2018
 */
public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.saySpanishGreeting();
    }
}