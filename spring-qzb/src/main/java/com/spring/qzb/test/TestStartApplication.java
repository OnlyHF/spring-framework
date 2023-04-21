package com.spring.qzb.test;

import com.spring.qzb.test.config.TestConfig;
import com.spring.qzb.test.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2023-04-21 22:56
 * @since
 */
public class TestStartApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
		UserService userService = context.getBean("userService", UserService.class);
		System.out.println("userService: " + userService);
	}

}
