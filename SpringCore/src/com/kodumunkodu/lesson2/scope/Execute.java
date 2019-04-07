package com.kodumunkodu.lesson2.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execute {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lesson2.xml");
		Singleton single = (Singleton) context.getBean("singleton");
		
		/*Singleton Injection*/
		single.setMessage("Single Object");
		System.out.println(single);

		Singleton single2 = (Singleton) context.getBean("singleton");
		System.out.println(single2);
		
		System.out.println("******************");
		/*Prototype Injection*/
		Prototype prototype = (Prototype) context.getBean("prototype");
		prototype.setMessage("Prototype Object");
		System.out.println(prototype);
		
		Prototype prototype2 = (Prototype) context.getBean("prototype");
		System.out.println(prototype2);
		
	
	}

}
