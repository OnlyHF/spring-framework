package org.springframework.qzb.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qzb.config.StartConfig;
import org.springframework.qzb.server.DemoAService;
import org.springframework.qzb.server.DemoBService;
import org.springframework.qzb.server.UserService;

/**
 * StartApplication.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-05 23:12:20
 */
public class StartApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartConfig.class);
//		System.out.println(context.getBean(UserService.class));
//		System.out.println(context.getBean(UserService.class).getKey());
//
//		context.close();

		DemoAService demoAService = context.getBean(DemoAService.class);
		DemoBService demoBService = context.getBean(DemoBService.class);
		System.out.println(demoAService);
		System.out.println(demoBService);
	}

}
