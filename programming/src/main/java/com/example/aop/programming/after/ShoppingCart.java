package com.example.aop.programming.after;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut(String id){
        System.out.println("CheckOut Method ");
    }


}
