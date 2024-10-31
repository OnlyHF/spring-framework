package org.springframework.qzb.ioc.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qzb.ioc.server.UserService;
import org.springframework.qzb.ioc.config.StartConfig;

/**
 * PropertyEditorApplication.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-02 22:10:01
 */
public class ConversionServiceApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartConfig.class);
		System.out.println(context.getBean(UserService.class).getUserEntity());
	}

}
