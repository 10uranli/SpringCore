package com.kodumunkodu.lesson1.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodumunkodu.lesson1.helloworld.HelloWorld;

public class Execute {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lesson1.xml");
		Employee bean = (Employee) context.getBean("employee");

		System.out.println(bean);
	}
}
