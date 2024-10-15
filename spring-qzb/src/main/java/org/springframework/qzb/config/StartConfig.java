package org.springframework.qzb.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.qzb.entity.UserEntity;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * StartConfig.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-01 07:18:49
 */
@Configuration
@ComponentScan(value = "org.springframework.qzb")
//@ComponentScan(value = "org.springframework.qzb", excludeFilters = {
//		@ComponentScan.Filter(
//				type = FilterType.ASSIGNABLE_TYPE,
//				classes = {UserService.class}
//		)
//})
//@ComponentScan(value = "org.springframework.qzb", includeFilters = {
//		@ComponentScan.Filter(
//				type = FilterType.ASSIGNABLE_TYPE,
//				classes = {UserService.class}
//		)
//})
@PropertySource("classpath:spring.properties")
@EnableAspectJAutoProxy
@EnableAsync
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

	/**
	 * 定义事件监听器.
	 *
	 * @return
	 */
	@Bean
	public ApplicationListener userEntityListener() {
		return (userEntity) -> {
			if (userEntity.getSource() instanceof UserEntity){
				System.out.println(userEntity.getSource());
				System.out.println(Thread.currentThread().getName());
			}
		};
	}

//	/**
//	 * 配置为异步监听.
//	 *
//	 * @return
//	 */
//	@Bean
//	public SimpleApplicationEventMulticaster applicationEventMulticaster() {
//		SimpleApplicationEventMulticaster multicaster = new SimpleApplicationEventMulticaster();
//		multicaster.setTaskExecutor(Executors.newSingleThreadExecutor());
//		return multicaster;
//	}

//	/**
//	 * 将PropertyEditor注入到Spring容器.
//	 *
//	 * @return
//	 */
//	@Bean
//	public CustomEditorConfigurer customEditorConfigurer() {
//		CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
//		Map<Class<?>, Class<? extends PropertyEditor>> customEditors = new HashMap<>();
//		customEditors.put(UserEntity.class, StringToUserPropertyEditor.class);
//		customEditorConfigurer.setCustomEditors(customEditors);
//		return customEditorConfigurer;
//	}

//	@Bean
//	public ConversionServiceFactoryBean conversionService() {
//		ConversionServiceFactoryBean factoryBean = new ConversionServiceFactoryBean();
//		factoryBean.setConverters(Collections.singleton(new StringToUserConverter()));
//		return factoryBean;
//	}

}
