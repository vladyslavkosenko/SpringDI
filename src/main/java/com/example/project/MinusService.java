package com.example.project;

import org.springframework.stereotype.Service;

@Service("minusService")
public class MinusService {

    public MinusService() {
    }

    public void minusCalculation(int a, int b) {
        System.out.println("minus " + (a - b));
    }
}
