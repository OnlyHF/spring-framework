package org.springframework.qzb.start;

import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qzb.config.StartConfig;
import org.springframework.qzb.server.UserService;

/**
 * BeanDefinitionReaderApplication.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-01 07:15:38
 */
public class BeanDefinitionReaderApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartConfig.class);
		AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(context);
		reader.register(UserService.class);
		System.out.println(UserService.class);
	}

}
