package org.springframework.qzb.aop.concept;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.qzb.aop.service.UserService;

import java.lang.reflect.Method;

public class CglibDemo {

	public static void main(String[] args) {
		UserService userService = new UserService();
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(UserService.class);
		enhancer.setCallbacks(new Callback[]{
				new MethodInterceptor() {
					@Override
					public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
						System.out.println("方法执行前");
						Object result = method.invoke(userService, args);
						System.out.println("方法执行后。。。");
						return result;
					}
				}
		});
		UserService userService1 = (UserService) enhancer.create();
		userService1.test();
	}

}
