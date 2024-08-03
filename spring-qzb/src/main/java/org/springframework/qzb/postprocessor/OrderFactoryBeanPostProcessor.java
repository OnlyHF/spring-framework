package org.springframework.qzb.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.qzb.bean.OrderBean;
import org.springframework.stereotype.Component;

/**
 * OrderFactoryBeanPostProcessor.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-03 07:28:45
 */
@Component
public class OrderFactoryBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean.getClass().equals(OrderBean.class)) {
			System.out.println("orderFactoryBean 初始化之前 start");
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean.getClass().equals(OrderBean.class)) {
			System.out.println("orderFactoryBean 初始化之后 end");
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
