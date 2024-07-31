package org.springframework.qzb.start;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qzb.config.StartConfig;
import org.springframework.qzb.server.UserService;

/**
 * Default (Template) Project.
 *
 * @author <a href="mailto:qianzb@yxt.com">qianzb</a>
 * @date 2024-07-31 22:47
 * @since 1.0
 */
public class BeanDefinitionApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartConfig.class);
		// 编程式定义BeanDefinition
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(UserService.class);
		// 设置属性
		beanDefinition.setScope("prototype");
		context.registerBeanDefinition("userService", beanDefinition);
		UserService userService = context.getBean(UserService.class);
		UserService userService2 = context.getBean(UserService.class);
		System.out.println(userService);
		System.out.println(userService2);
	}
}