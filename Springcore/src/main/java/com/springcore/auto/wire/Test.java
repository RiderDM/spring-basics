package com.springcore.auto.wire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		// doesnt require type casting
		Emp s1 = context.getBean("emp1", Emp.class);
		System.out.println(s1);
		
		context.close();

	}

}
