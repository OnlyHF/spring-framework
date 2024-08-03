package org.springframework.qzb.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

/**
 * QzbBeanPostProcessor.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-03 07:08:43
 */
@Service
public class QianzbBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userService")) {
			System.out.println("QianzbBeanPostProcessor 初始化之前执行");
		}
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("userService")) {
			System.out.println("QianzbBeanPostProcessor 初始化之后执行  end");
		}
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
