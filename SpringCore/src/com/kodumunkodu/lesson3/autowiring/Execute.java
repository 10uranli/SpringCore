package com.kodumunkodu.lesson3.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodumunkodu.lesson1.injection.Employee;

public class Execute {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lesson3.xml");
		ByName byName = (ByName) context.getBean("byName");

		/*ByName : Bean ad� ile inject edilecek bean properti ad� ayn� olmal� */
		System.out.println(byName.getWhichOne());
		System.out.println(byName.getMessageByName().getMessage());
		
		System.out.println("*************");
		/*ByType : Bean i�erisindeki properti tipi ile ile inject edilecek tipi ayn� olmal�*/
		ByType byType = (ByType) context.getBean("byType");
		System.out.println(byType.getWhichOne());
		System.out.println(byType.getMessageByType().getMessage());
		
		
	}
}
