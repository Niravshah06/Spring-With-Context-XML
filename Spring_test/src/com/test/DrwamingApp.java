package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrwamingApp {
	public static void main(String[] args) {

		// BeanFactory factory=new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));
		// put sping.xml at project level if using XMl bean factory

		// if u r using application context put spirng.xml in src folder of the
		// project
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring-collections.xml");

		RectangleWithList r = (RectangleWithList) factory.getBean("react");

		r.drawfromList();

		// close and free the resoures
		((ClassPathXmlApplicationContext) factory).close();
	}

}
