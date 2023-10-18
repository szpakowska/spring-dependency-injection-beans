package com.example.demo.controller;

import com.example.demo.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetterGreetingController {


    private GreetingRepository greetingRepository;

    @Autowired
    public void setGreetingRepository(@Qualifier("setterGreetingService") GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @GetMapping
    public String getGreeting() {
        return greetingRepository.sayGreeting();
    }


}
