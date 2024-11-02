package org.springframework.qzb.aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAop {

	@Pointcut("execution(public * org.springframework.qzb.aop.service.UserService.test())")
	public void pointCut() {

	}

	@Before("pointCut()")
	public void before() {
		System.out.println("AOP before method exec");
	}

}
