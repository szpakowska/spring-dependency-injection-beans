package com.example.demo.controller;

import com.example.demo.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorGreetingController {


    private final GreetingRepository greetingRepository;

    public ConstructorGreetingController(@Qualifier("constructorGreetingService") GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGreeting() {
        return greetingRepository.sayGreeting();
    }



}
