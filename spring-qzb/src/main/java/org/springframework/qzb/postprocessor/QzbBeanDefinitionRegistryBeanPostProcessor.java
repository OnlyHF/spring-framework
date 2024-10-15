package org.springframework.qzb.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.qzb.server.BeanDefinitionRegistryDemo;
import org.springframework.stereotype.Component;

@Component
public class QzbBeanDefinitionRegistryBeanPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(BeanDefinitionRegistryDemo.class);
		registry.registerBeanDefinition("beanDefinitionRegistryDemo", beanDefinition);
	}

}
