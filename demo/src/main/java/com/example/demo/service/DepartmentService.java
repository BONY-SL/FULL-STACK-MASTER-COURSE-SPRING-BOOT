package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.DepartmentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepo departmentRepo;

    @Value("${data.customer.id}")
    private String name;

    public Department getDepartmentById(long id){

       return departmentRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Department Not Found"));
    }

    public void print(){
        System.out.println(name);
    }
}
