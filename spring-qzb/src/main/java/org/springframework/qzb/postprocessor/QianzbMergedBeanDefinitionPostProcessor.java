package org.springframework.qzb.postprocessor;

import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.qzb.server.UserService;
import org.springframework.stereotype.Component;

/**
 * QianzbMergedBeanDefinitionPostProcessor.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-06 22:42:24
 */
@Component
public class QianzbMergedBeanDefinitionPostProcessor implements MergedBeanDefinitionPostProcessor  {
	@Override
	public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
		if (beanType.equals(UserService.class)) {
			beanDefinition.getPropertyValues().addPropertyValue("key", "123");
		}
	}

}
