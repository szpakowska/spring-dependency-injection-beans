package com.example.demo;

import com.example.demo.controller.ConstructorGreetingController;
import com.example.demo.controller.LanguageController;
import com.example.demo.controller.PropertyGreetingController;
import com.example.demo.controller.SetterGreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "pl.ex.exampleScan"})
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Demo1Application.class, args);


		System.out.println("____________Property");
		PropertyGreetingController propertyGreetingController = (PropertyGreetingController) ctx.getBean("propertyGreetingController");
		System.out.println(propertyGreetingController.getGreeting());

		System.out.println("____________Constructor");
		ConstructorGreetingController constructorGreetingController = (ConstructorGreetingController) ctx.getBean("constructorGreetingController");
		System.out.println(constructorGreetingController.getGreeting());


		System.out.println("____________Setter");
		SetterGreetingController setterGreetingController = (SetterGreetingController) ctx.getBean("setterGreetingController");
		System.out.println(setterGreetingController.getGreeting());


		System.out.println("____________Language");
		LanguageController languageController = (LanguageController) ctx.getBean("languageController");
		System.out.println(languageController.getLanguage());


	}


}
