package com.example.aop.programming.after;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CheckOutCheck {

    @Pointcut("execution(* com.example.aop.programming.after.ShoppingCart..*(..))")
    public void checkOutPointCut(){

    }
    // Within Parameter
    @Before("checkOutPointCut()")
    public void isCheck(){
        System.out.println("Check Out Checked");
    }

    @After("checkOutPointCut()")
    public void emailSendAfterCheckOut(){
        System.out.println("User Check Success Sending email...");
    }
}
