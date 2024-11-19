package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.entity.Person;

public class Controller {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigureFile.class);
		Person p = context.getBean(Person.class);

		System.out.println(p.getSim1().calling());
		System.out.println(p.getSim2().calling());
	}

}
