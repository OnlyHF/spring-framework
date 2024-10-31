package org.springframework.qzb.aop.concept;

import org.springframework.aop.ThrowsAdvice;

public class QzbThrowsAdvice implements ThrowsAdvice {

	public void afterThrowing(RuntimeException e) throws Throwable {
		System.out.println("方法 afterReturning 执行...");
		System.out.println("异常信息：" + e);
	}

}
