package org.springframework.qzb.aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.qzb.aop.concept.Verifier;
import org.springframework.qzb.aop.concept.VerifierImpl;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAop {

	@DeclareParents(value = "org.springframework.qzb.aop.service.UserService",
			defaultImpl = VerifierImpl.class)
	private Verifier verifier;

	@Pointcut("execution(public * org.springframework.qzb.aop.service.UserService.test())")
	public void pointCut() {

	}

	@Before("pointCut()")
	public void before() {
		System.out.println("AOP before method exec");
	}

}
