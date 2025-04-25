package com.example.aop.programming.before;

import org.springframework.stereotype.Component;

@Component
public class HospitalService {

    public void doctorEnter(){
        System.out.println("Doctor Entered a Hospital");
    }
//
//    public void isCheck(){
//        System.out.println("Doctor ID Check");
//    }
}
