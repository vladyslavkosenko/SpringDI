package com.example.project;

public class Calculator {
    MinusService minusService = new MinusService();
    PlusService plusService = new PlusService();
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
