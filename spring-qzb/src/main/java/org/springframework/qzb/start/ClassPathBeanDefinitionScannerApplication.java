package org.springframework.qzb.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.qzb.server.UserService;

/**
 * ClassPathBeanDefinitionScannerApplication.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-01 07:43:20
 */
public class ClassPathBeanDefinitionScannerApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();
		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
		scanner.scan("org.springframework.qzb");
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService);
	}

}
