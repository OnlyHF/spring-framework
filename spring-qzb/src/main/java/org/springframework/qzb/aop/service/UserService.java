package org.springframework.qzb.aop.service;

public class UserService implements UserInterface{

	@Override
	public void test() {
		System.out.println("UserService.test() 方法执行");
		throw new RuntimeException("123");
	}

}
