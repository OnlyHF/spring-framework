package org.springframework.qzb.aop.concept;

import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.adapter.AfterReturningAdviceInterceptor;
import org.springframework.qzb.aop.service.UserInterface;
import org.springframework.qzb.aop.service.UserService;

import java.lang.reflect.Method;

public class AfterThrowingAdviceDemo {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setInterfaces(UserInterface.class);
		proxyFactory.setTarget(new UserService());
		// ThrowsAdvice 不能在当前main方法中创建匿名内部类 对象
		ThrowsAdvice advice = new QzbThrowsAdvice();
		proxyFactory.addAdvice(advice);
		UserInterface proxy = (UserInterface) proxyFactory.getProxy();
		proxy.test();
	}

}
