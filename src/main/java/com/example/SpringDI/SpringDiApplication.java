package com.example.SpringDI;

import com.example.project.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDiApplication.class, args);
        Calculator c = new Calculator();
        c.calculation();
    }

}
