package org.springframework.qzb.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Service;

/**
 * QianzbBeanFactoryPostProcessor.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-03 07:14:06
 */
@Service
public class QianzbBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactory 后置处理器");
	}

}
