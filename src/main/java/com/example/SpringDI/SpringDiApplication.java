package com.example.SpringDI;

import com.example.project.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com/example/");

        Calculator calculator = context.getBean(Calculator.class);
        calculator.calculation();

    }

}
