package com.example.aop.programming.before;

import org.springframework.stereotype.Component;

@Component
public class SchoolService {

    public void printEnter(){
        System.out.println("Student Entered a Class");
    }

//    public void isCheck(){
//        System.out.println("Student ID Check");
//    }
}
