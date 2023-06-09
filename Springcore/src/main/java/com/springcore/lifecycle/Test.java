package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		Samosa s1 = (Samosa)context.getBean("s1");
		System.out.println(s1);
		
		
		/*
		 * to enable the destory method before the program closes automatically use
		 * preshutdowm hook
		 * 
		 * registering shutdown hook via AbstractApplicationContext reference
		 */
		context.registerShutdownHook();
		
		
		
		System.out.println("**********************************");
		
		Pepsi p1 = (Pepsi) context.getBean("p1");
		
		
		System.out.println("**********************************");
		
		Example example =(Example) context.getBean("example");
		System.out.println(example);
		
	}
}
