package org.springframework.qzb.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.qzb.bean.OrderBean;
import org.springframework.qzb.config.StartConfig;

/**
 * FactoryBeanApplication.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-03 07:24:08
 */
public class FactoryBeanApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StartConfig.class);
		OrderBean bean = context.getBean("orderFactoryBean", OrderBean.class);
		System.out.println(bean);
	}

}
