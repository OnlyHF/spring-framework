package org.springframework.qzb.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.qzb.server.UserService;
import org.springframework.stereotype.Component;

/**
 * UserServiceInstantiationAwareBeanPostProcessor.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-05 23:14:15
 */
@Component
public class UserServiceInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	/**
	 * 初始化之前执行，
	 * postProcessBeforeInstantiation() 有返回对象，则该方法不执行.
	 *
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof UserService) {
			System.out.println("UserServiceInstantiationAwareBeanPostProcessor UserService 初始化之前执行...");
		}
		return bean;
	}

	/**
	 * 初始化之后执行，该方法一定会执行.
	 *
	 * @param bean the new bean instance
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof UserService) {
			System.out.println("UserServiceInstantiationAwareBeanPostProcessor UserService 初始化之后执行...");
		}
		return bean;
	}

	/**
	 * 实例化之前，可自定义返回bean对象，此时只会执行初始化之后的逻辑，不能执行Spring的完整bean周期.
	 *
	 * @param beanClass the class of the bean to be instantiated
	 * @param beanName the name of the bean
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanClass.equals(UserService.class)) {
			System.out.println("UserServiceInstantiationAwareBeanPostProcessor UserService 实例化之前，手动创建的对象.....");
			return new UserService();
		}
		return null;
	}
}
