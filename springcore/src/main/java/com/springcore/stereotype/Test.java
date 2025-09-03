package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = (Student) context.getBean("myCustomName");
//			System.out.println(student.getAddress());
		System.out.println(student.hashCode());
		Student student1 = (Student) context.getBean("myCustomName");
		System.out.println(student1.hashCode());
		
		Teacher t1 = (Teacher) context.getBean("teacher");
		System.out.println(t1.hashCode());
		Teacher t2 = (Teacher) context.getBean("teacher");
		System.out.println(t2.hashCode());
	}

}
