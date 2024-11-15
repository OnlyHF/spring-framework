package org.springframework.qzb.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.qzb.aop.concept.Verifier;
import org.springframework.qzb.aop.service.TUserService;
import org.springframework.qzb.aop.service.UserInterface;
import org.springframework.qzb.aop.service.UserService;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan("org.springframework.qzb.aop")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class StartApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartApplication.class);
		UserInterface userService = context.getBean(UserInterface.class);
//		userService.test();

//		Verifier verifier = (Verifier) userService;
//		if (verifier.validate("123")) {
//			userService.test();
//		}

		TUserService tUserService = context.getBean(TUserService.class);
		tUserService.test();
	}

}
