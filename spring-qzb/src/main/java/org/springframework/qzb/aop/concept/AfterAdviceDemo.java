package org.springframework.qzb.aop.concept;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.qzb.aop.service.UserInterface;
import org.springframework.qzb.aop.service.UserService;

import java.lang.reflect.Method;

public class AfterAdviceDemo {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setInterfaces(UserInterface.class);
		proxyFactory.setTarget(new UserService());
		QzbAfterAdvice afterAdvice = new QzbAfterAdvice();
		proxyFactory.addAdvice(afterAdvice);
		UserInterface proxy = (UserInterface) proxyFactory.getProxy();
		proxy.test();
	}

}
