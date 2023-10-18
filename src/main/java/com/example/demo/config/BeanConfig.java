package com.example.demo.config;

import com.example.demo.service.PropertyGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:config.xml")
public class BeanConfig {


    @Bean
    PropertyGreetingService propertyGreetingService(){
        return new PropertyGreetingService();
    }







}
