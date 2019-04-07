package com.kodumunkodu.lesson1.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * @author 10uranli
 * 
 */
public class Execute {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lesson1.xml");
		HelloWorld bean = (HelloWorld) context.getBean("helloWorld");

		System.out.println(bean.getMessage());
			
	}
	

}
