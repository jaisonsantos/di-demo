package com.springframework.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Jaison Santos
 * Created by 09/06/2018
 */
@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario";
    }
}
