package com.springframework.didemo.service;

/**
 * @author Jaison Santos
 * Created by 09/03/2018
 */
public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.sayEnglishGreeting();
    }
}
