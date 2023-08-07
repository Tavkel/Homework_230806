package com.example.Homework_230806.models;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.Map;

@Component
@SessionScope
public class Cart {
    private Map<Integer, Integer> contents = new HashMap<>();
    public Cart() {
    }

    @Bean
    @SessionScope
    public Cart sessionCart(){
        return new Cart();
    }

    public Map<Integer, Integer> getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + contents +
                '}';
    }
}
