package org.springframework.qzb.ioc.postprocessor;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.qzb.ioc.server.ImportBeanDefinitionRegistrarService;

public class QzbImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		beanDefinition.setBeanClass(ImportBeanDefinitionRegistrarService.class);
		registry.registerBeanDefinition("importBeanDefinitionRegistrarService", beanDefinition);
		System.out.println(importingClassMetadata);
	}
}
