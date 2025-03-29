package com.example.assignment01;

import com.example.assignment01.answer.Hero;
import com.example.assignment01.answer.SuperMan;
import com.example.assignment01.answer.TalkingCat;
import com.example.assignment01.answer.WonderWoman;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Assignment01Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("heroes.xml");

		// Superman Bean
		Hero superMan1 = applicationContext.getBean(SuperMan.class);
		superMan1.action();

		// WonderWomen Bean
		Hero wonderWomen1 = applicationContext.getBean(WonderWoman.class);
		wonderWomen1.action();

		// TalkingCat Bean
		Hero talkingCat1 = applicationContext.getBean(TalkingCat.class);
		talkingCat1.action();



		Hero wonderWomen2 = applicationContext.getBean(WonderWoman.class);
		if(wonderWomen1.equals(wonderWomen2)){
			System.out.println("Bean Scope is Singleton Type");
		}else {
			System.out.println("Bean Scope not Singleton Type");

		}

		Hero talkingCat2 = applicationContext.getBean(TalkingCat.class);
		if(talkingCat1.equals(talkingCat2)){
			System.out.println("Bean Scope is Singleton Type");
		}else {
			System.out.println("Bean Scope not Singleton Type");

		}

		Hero superMan2 = applicationContext.getBean(SuperMan.class);
		if(superMan1.equals(superMan2)){
			System.out.println("Bean Scope is Singleton Type");
		}else {
			System.out.println("Bean Scope not Singleton Type");

		}

	}

}
