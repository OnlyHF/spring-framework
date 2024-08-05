package org.springframework.qzb.server;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

/**
 * QianzbSmartInitializingSingleton.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-04 10:14:27
 */
@Component
public class QianzbSmartInitializingSingleton implements SmartInitializingSingleton {

	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("SmartInitializingSingleton全部非懒加载的bean实例化之后执行....");
	}

}
