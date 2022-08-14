package com.example.config;

import com.example.project.Calculator;
import com.example.project.MinusService;
import com.example.project.PlusService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Calculator calculator() {
        return new Calculator(plusService(), minusService());
    }

    @Bean
    public PlusService plusService() {
        return new PlusService();
    }

    @Bean
    public MinusService minusService() {
        return new MinusService();
    }
}
