package com.example.project;

import org.springframework.stereotype.Service;

@Service("plusService")
public class PlusService {

    public PlusService() {
    }

    public void pLusCalculation(int a, int b) {
        System.out.println("plus " + (a + b));
    }
}