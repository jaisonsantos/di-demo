package com.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * @author Jaison Santos
 * Created on 09/01/2018
 */
@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello!!!");
        return "foo";
    }

}
