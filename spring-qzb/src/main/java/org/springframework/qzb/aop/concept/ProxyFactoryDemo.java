package org.springframework.qzb.aop.concept;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.qzb.aop.service.UserInterface;
import org.springframework.qzb.aop.service.UserService;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ProxyFactoryDemo {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new UserService());
		// 设置接口，则使用JDK代理
		// 不设置接口，则默认使用CGLIB动态代理
//		proxyFactory.setInterfaces(UserInterface.class);
		proxyFactory.addAdvice(new MethodInterceptor() {

			@Nullable
			@Override
			public Object invoke(@Nonnull MethodInvocation invocation) throws Throwable {
				System.out.println("invoke 之前执行");
				Object proceed = invocation.proceed();
				System.out.println("invoke 之后执行。。。。。");
				return proceed;
			}
		});
		// 若上述代码设置了接口，使用接口接收代理对象
		// 若未设置接口，则使用接口或具体被代理类接收代理对象皆可
//		UserInterface proxy = (UserInterface) proxyFactory.getProxy();
		UserService proxy = (UserService) proxyFactory.getProxy();
		proxy.test();
	}

}
