package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person per = (Person) context.getBean("person");
		System.out.println(per);
		System.out.println(per.getFriends().getClass().getName());
		System.out.println(per.getFeestructure().getClass().getName());
		System.out.println(per.getProperties().getClass().getName());
	}

}
