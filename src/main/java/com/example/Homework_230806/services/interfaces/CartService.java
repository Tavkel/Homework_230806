package com.example.Homework_230806.services.interfaces;

import com.example.Homework_230806.models.Cart;

import java.util.Map;

public interface CartService {
    Cart getCart();
    Map<Integer,Integer> getCartContents();
    void addProductToCart(int... id);
}
