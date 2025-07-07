package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Starting Spring Application...");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Spring context loaded successfully!");

        MessageService service = (MessageService) context.getBean("messageService");

        System.out.println("Retrieved bean: " + service.getClass().getSimpleName());

        service.printMessage();
    }
}
