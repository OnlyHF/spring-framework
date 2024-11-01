package org.springframework.qzb.aop.configuration;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.qzb.aop.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.lang.reflect.Method;

@Component
public class AopConfiguration {

//	@Bean
//	public ProxyFactoryBean userServiceProxy() {
//		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//		proxyFactoryBean.setTarget(new UserService());
//		proxyFactoryBean.addAdvice(new MethodBeforeAdvice() {
//			@Override
//			public void before(Method method, Object[] args, Object target) throws Throwable {
//				System.out.println("方法之前执行。。。。");
//			}
//		});
//		return proxyFactoryBean;
//	}

	@Bean
	public MethodInterceptor userMethodInterceptor() {
		return new MethodInterceptor() {
			@Nullable
			@Override
			public Object invoke(@Nonnull MethodInvocation invocation) throws Throwable {
				System.out.println("代理开始代码执行......");
				Object proceed = invocation.proceed();
				System.out.println("代理后续逻辑执行1111。。。");
				return proceed;
			}
		};
	}

//	@Bean
//	public ProxyFactoryBean userProxyFactoryBean() {
//		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
//		proxyFactoryBean.setTarget(new UserService());
//		proxyFactoryBean.addAdvice(userMethodInterceptor());
//		return proxyFactoryBean;
//	}

	@Bean
	public BeanNameAutoProxyCreator userServiceBeanNameAutoProxyCreator() {
		BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
		beanNameAutoProxyCreator.setBeanNames("user*");
		beanNameAutoProxyCreator.setInterceptorNames("userMethodInterceptor");
		beanNameAutoProxyCreator.setProxyTargetClass(true);
		return beanNameAutoProxyCreator;
	}

}
