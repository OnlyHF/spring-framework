package org.springframework.qzb.start;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.qzb.server.UserService;

/**
 * DefaultListableBeanFactoryApplication.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-01 20:52:22
 */
public class DefaultListableBeanFactoryApplication {
	public static void main(String[] args) {
		// 定义BeanFactory
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		// 定义BeanDefinition
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(UserService.class);
		// 将BeanDefinition注入到BeanFactory
		beanFactory.registerBeanDefinition("userService", beanDefinition);
		// 从而可以在BeanFactory中获取Bean
		UserService userService = beanFactory.getBean(UserService.class);
		System.out.println(userService);
	}
}
