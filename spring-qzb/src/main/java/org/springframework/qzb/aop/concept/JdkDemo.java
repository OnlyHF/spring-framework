package org.springframework.qzb.aop.concept;

import org.springframework.qzb.aop.service.UserInterface;
import org.springframework.qzb.aop.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDemo {

	public static void main(String[] args) {
		UserService userService = new UserService();
		UserInterface userInterface = (UserInterface) Proxy.newProxyInstance(JdkDemo.class.getClassLoader(), new Class[] {UserInterface.class}, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("JDK动态代理执行之前");
				Object result = method.invoke(userService, args);
				System.out.println("JDK动态代理执行之后。。。。。");
				return result;
			}
		});
		userInterface.test();
	}

}
