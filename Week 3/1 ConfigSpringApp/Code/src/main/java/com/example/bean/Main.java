package com.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load Spring context from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieve bean
        HelloService helloService = context.getBean("helloService", HelloService.class);
        helloService.sayHello();  // Output: Hello from Spring Bean!
    }
}
