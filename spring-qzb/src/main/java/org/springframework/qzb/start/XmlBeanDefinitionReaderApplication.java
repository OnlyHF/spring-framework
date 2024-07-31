package org.springframework.qzb.start;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qzb.config.StartConfig;
import org.springframework.qzb.server.UserService;

/**
 * XmlBeanDefinitionReaderApplication.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-01 07:33:37
 */
public class XmlBeanDefinitionReaderApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartConfig.class);
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(context);
		reader.loadBeanDefinitions("spring.xml");
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService);
	}

}
