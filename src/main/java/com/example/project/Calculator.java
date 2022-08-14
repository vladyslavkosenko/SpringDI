package com.example.project;

public class Calculator {
    private final PlusService plusService;
    private final MinusService minusService;

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
