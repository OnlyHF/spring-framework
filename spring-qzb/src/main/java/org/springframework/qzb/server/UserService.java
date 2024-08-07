package org.springframework.qzb.server;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import lombok.Getter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.qzb.entity.UserEntity;
import org.springframework.stereotype.Service;

/**
 * UserService.
 *
 * @Author qzb0212@126.com
 * @Date 2024-07-31 23:11:17
 */
@Data
@Service
public class UserService implements InitializingBean {

	private String key;

	@Autowired
	private OrderService orderService;

	@Getter
//	@Value("123123;张三")
	private UserEntity userEntity;

	@PostConstruct
	public void init() {
		System.out.println("UserService InitializingBean afterPropertiesSet 执行");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("UserService InitializingBean afterPropertiesSet 执行");
	}
}
