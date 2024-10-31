package org.springframework.qzb.server;

import jakarta.annotation.PostConstruct;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class ImportBeanDefinitionRegistrarService implements EnvironmentAware {

	public void test() {
		System.out.println("ImportBeanDefinitionRegistrarService.test()");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct");
	}

	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("setEnvironment");
	}
}
