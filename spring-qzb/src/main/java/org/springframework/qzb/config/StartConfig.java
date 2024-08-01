package org.springframework.qzb.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * StartConfig.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-01 07:18:49
 */
@Configuration
@ComponentScan("org.springframework.qzb")
public class StartConfig {

	/**
	 * 注入MessageSource对象到容器.
	 * 并设置国际化文件名.
	 *
	 * @return
	 */
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("message");
		return messageSource;
	}

}
