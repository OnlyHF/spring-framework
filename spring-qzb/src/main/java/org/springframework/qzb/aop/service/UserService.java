package org.springframework.qzb.aop.service;

import org.springframework.stereotype.Component;

@Component
public class UserService implements UserInterface{

	@Override
	public void test() {
		System.out.println("UserService.test() 方法执行");
//		throw new RuntimeException("123");
	}

	@Override
	public void hello() {
		System.out.println("hello 方法执行");
	}


}
