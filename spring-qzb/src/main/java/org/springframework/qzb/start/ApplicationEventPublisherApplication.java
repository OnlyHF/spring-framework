package org.springframework.qzb.start;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qzb.config.StartConfig;
import org.springframework.qzb.entity.UserEntity;

/**
 * ApplicationEventPublisherApplication.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-02 21:23:17
 */
public class ApplicationEventPublisherApplication {

	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartConfig.class);
		UserEntity user = new UserEntity("1", "张三");
		ApplicationEvent applicationEvent = new ApplicationEvent(user) {

		};
		context.publishEvent(applicationEvent);
		System.out.println(Thread.currentThread().getName());
	}

}
