package com.sist.main4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("app.xml");
		a a = (a)app.getBean("a");
		a.sayHello("ȫ�浿");
		
		b b = (b)app.getBean("b");
		b.sayHello("bra");
		
		v v = (v)app.getBean("v");
		v.sayHello("vra");
	}
}
