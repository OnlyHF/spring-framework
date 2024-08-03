package org.springframework.qzb.server;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.qzb.bean.OrderBean;
import org.springframework.stereotype.Component;

/**
 * OrderFactoryBean.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-03 07:21:10
 */
@Component
public class OrderFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new OrderBean();
	}

	@Override
	public Class<?> getObjectType() {
		return OrderBean.class;
	}
}
