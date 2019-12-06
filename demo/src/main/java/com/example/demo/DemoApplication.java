package com.example.demo;

import org.springframework.boot.SpringApplication;
import static org.springframework.boot.SpringApplication.run;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        Student student = context.getBean(Student.class);
        System.out.println("");
        student.compiling();
        student.setName("manuel");
        student.setAge("29");
        student.address.setCity("Houston");
        student.address.setCountry("USA");
        
        System.out.println("");
        System.out.println("..................");
        System.out.println("...............");
        System.out.println("............");
        System.out.println("");
        
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("City: " + student.address.getCity());
        System.out.println("Country: " + student.address.getCountry());
    }
}
