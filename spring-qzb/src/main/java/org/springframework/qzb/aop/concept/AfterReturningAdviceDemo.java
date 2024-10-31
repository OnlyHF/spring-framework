package org.springframework.qzb.aop.concept;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.qzb.aop.service.UserInterface;
import org.springframework.qzb.aop.service.UserService;

import java.lang.reflect.Method;

public class AfterReturningAdviceDemo {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setInterfaces(UserInterface.class);
		proxyFactory.setTarget(new UserService());
		proxyFactory.addAdvice(new AfterReturningAdvice() {

			@Override
			public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
				System.out.println("方法afterReturning执行...");
			}
		});
		UserInterface proxy = (UserInterface) proxyFactory.getProxy();
		proxy.test();
	}

}
