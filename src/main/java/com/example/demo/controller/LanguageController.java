package com.example.demo.controller;


import com.example.demo.repository.LanguageRepository;
import org.springframework.stereotype.Controller;

@Controller
public class LanguageController {

    private final LanguageRepository languageRepository;

    public LanguageController(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }


    public String getLanguage() {
        return languageRepository.sayLanguage();
    }


}
