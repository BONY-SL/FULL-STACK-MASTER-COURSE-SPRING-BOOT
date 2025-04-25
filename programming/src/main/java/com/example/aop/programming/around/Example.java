package com.example.aop.programming.around;

import org.springframework.stereotype.Component;

@Component
public class Example {

    public String aroundCheck(){
        System.out.println("Check");

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
        return "Return My";
    }
}
