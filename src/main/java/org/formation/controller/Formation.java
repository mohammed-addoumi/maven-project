package org.formation.controller;

import org.formation.models.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Formation {
	
	public static void main(String[] args) {
	System.out.println("firt project maven");
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	User user = context.getBean("user",User.class);
	System.out.println(user.getName());
	System.out.println(user.getId());
	
	}

}
