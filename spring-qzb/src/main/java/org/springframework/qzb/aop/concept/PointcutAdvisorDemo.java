package org.springframework.qzb.aop.concept;

import org.aopalliance.aop.Advice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.qzb.aop.service.UserInterface;
import org.springframework.qzb.aop.service.UserService;

import java.lang.reflect.Method;

public class PointcutAdvisorDemo {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setInterfaces(UserInterface.class);
		proxyFactory.setTarget(new UserService());
		proxyFactory.addAdvisor(new PointcutAdvisor() {
			@Override
			public Pointcut getPointcut() {
				return new StaticMethodMatcherPointcut() {

					@Override
					public boolean matches(Method method, Class<?> targetClass) {
						return method.getName().equals("test");
					}
				};
			}

			@Override
			public Advice getAdvice() {
				return new MethodBeforeAdvice() {
					@Override
					public void before(Method method, Object[] args, Object target) throws Throwable {
						System.out.println("方法之前执行");
					}
				};
			}
		});
		UserInterface proxy = (UserInterface) proxyFactory.getProxy();
		proxy.test();

		System.out.println();

		proxy.hello();
	}

}
