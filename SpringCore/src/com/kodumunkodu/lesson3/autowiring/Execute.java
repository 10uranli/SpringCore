package com.kodumunkodu.lesson3.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodumunkodu.lesson1.injection.Employee;

public class Execute {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("lesson3.xml");
		ByName byName = (ByName) context.getBean("byName");

		/*ByName : Bean adý ile inject edilecek bean properti adý ayný olmalý */
		System.out.println(byName.getWhichOne());
		System.out.println(byName.getMessageByName().getMessage());
		
		System.out.println("*************");
		/*ByType : Bean içerisindeki properti tipi ile ile inject edilecek tipi ayný olmalý*/
		ByType byType = (ByType) context.getBean("byType");
		System.out.println(byType.getWhichOne());
		System.out.println(byType.getMessageByType().getMessage());
		
		
	}
}
