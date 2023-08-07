package com.example.Homework_230806.services.interfaces;

import com.example.Homework_230806.models.Cart;

public interface CartService {
    Cart getCart();
    void addProductToCart(int... id);
}
