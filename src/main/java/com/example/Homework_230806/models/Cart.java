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

    public Map<Integer, Integer> getContents() {
        return contents;
    }

    public void addItem(int id){
        if (contents.containsKey(id)){
            contents.put(id, contents.get(id) + 1);
        } else{
            contents.put(id, 1);
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + contents +
                '}';
    }
}
