package org.springframework.qzb.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.qzb.aop.service.UserInterface;
import org.springframework.qzb.aop.service.UserService;

@ComponentScan("org.springframework.qzb.aop")
public class StartApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartApplication.class);
		UserInterface userService = context.getBean(UserInterface.class);
		userService.test();
	}

}
