package com.springframework.didemo.service;

/**
 * @author Jaison Santos
 * Created by 09/06/2018
 */
public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.sayGermanGreeting();
    }
}

