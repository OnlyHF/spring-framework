package org.springframework.qzb.server;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

/**
 * OrderService.
 *
 * @Author qzb0212@126.com
 * @Date 2024-08-07 06:46:03
 */
@Service
public class OrderService {

	@PostConstruct
	public void initMethod() {
		System.out.println("@PostConstruct 方法执行....");
	}

	@PreDestroy
	public void destroyMethod() {
		System.out.println("@PreDestroy 方法执行.....");
	}

}
