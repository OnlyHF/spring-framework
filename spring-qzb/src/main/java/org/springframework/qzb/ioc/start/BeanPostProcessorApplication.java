package org.springframework.qzb.ioc.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qzb.ioc.config.StartConfig;
import org.springframework.qzb.ioc.server.UserService;

/**
 * BeanPostProcessorApplication.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-03 07:07:51
 */
public class BeanPostProcessorApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartConfig.class);
		System.out.println(context.getBean(UserService.class));
	}

}
