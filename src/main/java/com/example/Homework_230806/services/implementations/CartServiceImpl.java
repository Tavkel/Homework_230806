package com.example.Homework_230806.services.implementations;

import com.example.Homework_230806.models.Cart;
import com.example.Homework_230806.services.interfaces.CartService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Map;

@Service
public class CartServiceImpl implements CartService {
    private Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public Cart getCart(){
        return cart;
    }

    @Override
    public Map<Integer, Integer> getCartContents(){
        return cart.getContents();
    }

    @Override
    public void addProductToCart(int... ids) {
        Arrays.stream(ids).forEach(id -> cart.addItem(id));
    }
}
