package org.springframework.qzb.aop.concept;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * 对于After Advice类型的Advice没有特定的接口供我们实现，如果需要自己实现一个Advice可以达到after Advice那样的效果，
 * 即无论切入点方法是否抛出异常都执行某些逻辑时，可以使用MethodInterceptor代替，在方法实现中使用try…finally形式即可.
 */
public class QzbAfterAdvice implements MethodInterceptor {

	@Nullable
	@Override
	public Object invoke(@Nonnull MethodInvocation invocation) throws Throwable {
		try {
			return invocation.proceed();
		} finally {
			System.out.println(1111);
		}
	}
}
