package com.example.SpringDI;

import com.example.project.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext("com.example.project");
        Calculator calculator = (Calculator) applicationContext.getBean("calculator");
        calculator.calculation();
    }

}
