package com.example.aop.programming;

import com.example.aop.programming.after.ShoppingCart;
import com.example.aop.programming.around.Example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProgrammingApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProgrammingApplication.class, args);

//		SchoolService schoolService = context.getBean(SchoolService.class);
//		HospitalService hospitalService = context.getBean(HospitalService.class);
//
//		schoolService.printEnter();
//		hospitalService.doctorEnter();

//		ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
//		shoppingCart.checkOut("");

		Example example = context.getBean(Example.class);
		example.aroundCheck();
	}

}
