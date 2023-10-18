package com.example.demo.service;

import com.example.demo.repository.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingRepository {


    @Override
    public String sayGreeting() {
        return "Hello World - wstrzyknięcie przez konstruktor";
    }
}
