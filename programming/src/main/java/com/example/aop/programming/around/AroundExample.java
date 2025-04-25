package com.example.aop.programming.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundExample {


    @Around("execution(* com.example.aop.programming.around.Example.aroundCheck())")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("[Around] Method Called :"+ joinPoint.getSignature().getName());
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end =  System.currentTimeMillis();
        System.out.println("Result from method: " + result);

        System.out.println("Method Completed : "+(end-start) + " Ms");
        System.out.println("Running Around AOP");
        return result;

    }
}
