package com.example.Homework_230806.controllers;

import com.example.Homework_230806.services.interfaces.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/order")
public class CartController {
    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    //Отдается мапа ввиду проблемы описанной в обсуждениях домашки
    @GetMapping("/get")
    public ResponseEntity<Map<Integer,Integer>> getCart(){
        var result = cartService.getCart().getContents();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    //Отдается мапа ввиду проблемы описанной в обсуждениях домашки
    @GetMapping("/add")
    public ResponseEntity<Map<Integer,Integer>> addProduct(@RequestParam int... ids){
        cartService.addProductToCart(ids);
        var result = cartService.getCart().getContents();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
