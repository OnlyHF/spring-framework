package org.springframework.qzb.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.qzb.config.StartConfig;

/**
 * EnvironmentApplicaton.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-02 21:09:13
 */
public class EnvironmentApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartConfig.class);
		ConfigurableEnvironment env = context.getEnvironment();
		System.out.println(env.getSystemEnvironment());
		System.out.println(env.getSystemProperties());
		System.out.println(env.getPropertySources());
		System.out.println(env.getProperty("name"));
	}

}
