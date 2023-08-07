package com.example.Homework_230806.services.implementations;

import com.example.Homework_230806.models.Cart;
import com.example.Homework_230806.services.interfaces.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CartServiceImpl implements CartService {
    @Resource(name = "sessionCart")
    private Cart cart;

    @Override
    public Cart getCart(){
        return cart;
    }

    @Override
    public void addProductToCart(int... ids) {
        for(int id : ids) {
            if (cart.getContents().containsKey(id)) {
                cart.getContents().put(id, cart.getContents().get(id) + 1);
            } else {
                cart.getContents().put(id, 1);
            }
        }
    }
}
