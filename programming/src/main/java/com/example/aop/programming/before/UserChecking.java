package com.example.aop.programming.before;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserChecking {

    @Before("execution(* com.example.aop.programming.before.HospitalService.*())")
    public void isCheck(){
        System.out.println("User ID Check");
    }
}
