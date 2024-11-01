package org.springframework.qzb.aop.concept;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.qzb.aop.service.UserInterface;
import org.springframework.qzb.aop.service.UserService;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class AroundAdviceDemo {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setInterfaces(UserInterface.class);
		proxyFactory.setTarget(new UserService());
		proxyFactory.addAdvice(new MethodInterceptor() {
			@Nullable
			@Override
			public Object invoke(@Nonnull MethodInvocation invocation) throws Throwable {
				System.out.println("环绕执行1111。。。");
				Object proceed = invocation.proceed();
				System.out.println("环绕执行。。。");
				return proceed;
			}
		});
		UserInterface proxy = (UserInterface) proxyFactory.getProxy();
		proxy.test();
	}

}
