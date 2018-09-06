package com.springframework.didemo.service;

import org.springframework.stereotype.Component;

/**
 * @author Jaison Santos
 * Created by 09/06/2018
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String sayEnglishGreeting() {
        return "Hello - Primary Greeting Service";
    }

    @Override
    public String saySpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String sayGermanGreeting() {
        return "Primäre Begrüßung";
    }
}
