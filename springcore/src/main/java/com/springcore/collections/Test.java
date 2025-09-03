package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp obj = (Emp) context.getBean("empBean");
		
		System.out.println(obj.getEmployeeName());
		System.out.println(obj.getAddresses());
		System.out.println(obj.getPhones());
		System.out.println(obj.getCourses());
		System.out.println(obj.getProperties());
		
	}

}
