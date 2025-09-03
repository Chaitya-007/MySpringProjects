package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycleconfig.xml");
//		Samosa s = (Samosa) context.getBean("s1");
//
//		System.out.println(s);
//		registering shutdown hook
		context.registerShutdownHook();
//		Pepsi p = (Pepsi) context.getBean("p1");
//		
//		System.out.println(p);

		Example example = (Example) context.getBean("e1");
		System.out.println(example);

	}

}
