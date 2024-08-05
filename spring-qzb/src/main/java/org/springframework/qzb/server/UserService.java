package org.springframework.qzb.server;

import lombok.Getter;
import org.springframework.qzb.entity.UserEntity;
import org.springframework.stereotype.Service;

/**
 * UserService.
 *
 * @Author qzb0212@126.com
 * @Date 2024-07-31 23:11:17
 */
@Service
public class UserService {

	@Getter
//	@Value("123123;张三")
	private UserEntity userEntity;

}
