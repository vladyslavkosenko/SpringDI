package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("calculator")
public class Calculator {
    private final PlusService plusService;
    private final MinusService minusService;

    @Autowired
    public Calculator(PlusService plusService, MinusService minusService) {
        this.plusService = plusService;
        this.minusService = minusService;
    }
    int first = (int) (Math.random() * 10);
    int second = (int) (Math.random() * 10);

    public void calculation() {
        if (first > second) {
            minusService.minusCalculation(first, second);
            System.out.println("first " + first + " " + "second " + second);
        } else {
            plusService.pLusCalculation(first, second);
            System.out.println("first " + first + " " + "second " + second);
        }
    }
}
