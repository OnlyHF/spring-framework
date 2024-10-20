package org.springframework.qzb.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qzb.config.StartConfig;
import org.springframework.qzb.server.*;

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

//		context.close();

		UserService bean = context.getBean(UserService.class);
		UserService bean2 = context.getBean(UserService.class);
		System.out.println(bean);
		System.out.println(bean2);

		System.out.println(context.getBean(BeanDefinitionRegistryDemo.class));


		System.out.println(context.getBean(C.class));
	}

}
