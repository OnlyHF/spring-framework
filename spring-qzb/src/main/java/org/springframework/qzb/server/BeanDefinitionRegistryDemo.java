package org.springframework.qzb.server;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanDefinitionRegistryDemo {

	@Bean
	public C c() {
		return new C();
	}

}
