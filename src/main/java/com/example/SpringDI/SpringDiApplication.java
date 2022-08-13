package com.example.SpringDI;

import com.example.project.Calculator;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDiApplication {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("bean-factory.xml");
        Calculator calculator = (Calculator) beanFactory.getBean("calculator");
        calculator.calculation();
    }

}
