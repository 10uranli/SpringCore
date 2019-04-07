package com.kodumunkodu.lesson1.injection;

import com.kodumunkodu.lesson1.helloworld.HelloWorld;

public class Employee {

	private String name;
	private int age;
	private HelloWorld helloWorld;
	
	public Employee(String name, int age,HelloWorld helloWorld) {
		this.name = name;
		this.age = age;
		this.helloWorld = helloWorld;
	}
	
	@Override
	public String toString() {
		return "Age : " + age + " Name : " + name + " HelloWorld Bean : " + helloWorld;
	}
}
